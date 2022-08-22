// globals ==================================================================
def PS = System.getProperty("file.separator")
def random = new Random()

// param parsing ============================================================
/*
def cli = new CliBuilder(usage: 'build_bundle.groovy -wp profiles -pid pidfile')
cli.with {
   wp  longOpt: 'with profiles', args:1, required:true, 'Text file with profile URIs, one per line'
   pid longOpt: 'patient identifiers', args:1, required:false, 'Text file with patient identifiers, one per line, optional'
}
def options = cli.parse(args)
if (!options) {
   return
}
*/

// class extensions =========================================================
String.metaClass.static.uuid = { ->
   java.util.UUID.randomUUID() as String
}

Date.metaClass.static.nowInIsoUtc = {
   return new Date().format("yyyy-MM-dd'T'HH:mm:ss'Z'", TimeZone.getTimeZone("UTC"))
}

String.metaClass.static.randomNumeric = { digits ->
   def alphabet = ['0','1','2','3','4','5','6','7','8','9']
   new Random().with {
      (1..digits).collect { alphabet[ nextInt( alphabet.size() ) ] }.join()
   }
}


// source examples per patient ======================================================
def designed_patient_resources = new File('patients')

if (!designed_patient_resources.exists()) {
   println "Please run first: groovy design_bundles.groovy"
   return
}


// folder containing text files, one per organization, each containing the same amounts of ids
// id 1 on all organizations corresponds to the same patient
def organization_identifiers = new File('debugging_daten_bloomfilter')

def identifier_matrix = [:] // organization => list of ids


organization_identifiers.eachFileMatch(~/.*.csv/) { organization_id_file ->

   identifier_matrix[(organization_id_file.name - "bloomfilter_" - ".csv")] = organization_id_file.readLines()
}


def json_slurper = new groovy.json.JsonSlurper()
def parsed_examples
def bundle_map
def patient_index = 0
def patient_id, patient_identifier

designed_patient_resources.eachFileRecurse (groovy.io.FileType.DIRECTORIES) { patient_folder ->

   parsed_examples = [] // resources for the current patient

   // load resources for the current patient
   patient_folder.eachFileMatch(~/.*.json/) { example_file ->

      parsed_examples << json_slurper.parseText(example_file.text)
   }


   // for each organization we take bloom filter[patient_index] and use the same base resources for each bundle
   identifier_matrix.each { organization, identifiers ->

      patient_id = String.uuid() // patient id is generated
      patient_identifier = identifiers[patient_index]

      // prepare output
      bundle_map = [
         resourceType: "Bundle",
         id: String.uuid(),
         meta: [
            profile: [
               "https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/gecco-bundle"
            ]
         ],
         type: "transaction",
         timestamp: Date.nowInIsoUtc(),
         entry: [

         ]
      ]

      // add entries to the output bundle
      parsed_examples.each { example ->

         entry = [
            resource: example,
            request: [
               method: "POST",
               url: example.resourceType
            ]
         ]

         // generating an id for the patient
         if (example.resourceType == "Patient")
         {
            entry.resource.id = patient_id

            // if the patient example doesn't have an identifier, add one
            //if (!entry.resource.identifier)
            //{
               entry.resource.identifier = [ // it's a list of identifiers
                  [
                     type: [
                        coding: [
                           [
                              system:"http://terminology.hl7.org/CodeSystem/v2-0203",
                              code: "ANON"
                           ]
                        ]
                     ],
                     system: "http://www.netzwerk-universitaetsmedizin.de/sid/bloom-filter"
                  ]
               ]

               entry.resource.identifier[0].value = patient_identifier
            //}

            entry.request = [
               method: "PUT",
               url: "Patient/${patient_id}"
            ]
         }

         bundle_map.entry << entry
      }


      // different resource types have the patient data in different attributes,
      // this maps the resource to the attribute name
      def patient_attribute_map = [
         Consent:             'patient',
         Condition:           'subject',
         Procedure:           'subject',
         Observation:         'subject',
         Immunization:        'patient',
         DiagnosticReport:    'subject',
         MedicationStatement: 'subject'
      ]


      // fix references to the patient using the generated id
      def patient_attribute, type
      bundle_map.entry.each { bundle_entry ->

         type = bundle_entry.resource.resourceType

         // avoid touching the patient
         if (type == "Patient") return

         patient_attribute = patient_attribute_map[type]

         if (!patient_attribute)
         {
            println "ERROR: resource ${type} doesn't have a patient attribute configuration"
         }

         bundle_entry.resource."$patient_attribute".reference = "Patient/${patient_id}"
      }


      // output
      def out_folder = new File('output')
      out_folder.mkdirs()

      def out = new File(out_folder, organization +'_'+ patient_index +'.json')
      out << groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(bundle_map))
   }


   patient_index++
}
