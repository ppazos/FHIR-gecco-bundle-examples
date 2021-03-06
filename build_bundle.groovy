// globals ==================================================================
def PS = System.getProperty("file.separator")
def random = new Random()

// param parsing ============================================================
def cli = new CliBuilder(usage: 'build_bundle.groovy -wp profiles -pid pidfile')
cli.with {
   wp  longOpt: 'with profiles', args:1, required:true, 'Text file with profile URIs, one per line'
   pid longOpt: 'patient identifiers', args:1, required:false, 'Text file with patient identifiers, one per line, optional'
}
def options = cli.parse(args)
if (!options) {
   return
}

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


// config file reading ======================================================
def config_file = new File(options.wp)

if (!config_file.exists()) {
   println "Config file ${options.wp} doesn't exist"
   return
}

if (!config_file.canRead()) {
   println "Config file ${config.wp} exists but can't be read"
   return
}

def requested_profiles = config_file.readLines() // list of profile URL

//println requested_profiles

// cache examples for matching with requested profiles
def examples_path = "Simplifier_Project${PS}beispiele${PS}"
def examples_folder = new File(examples_path)

//println examples_folder.exists()

def json_slurper = new groovy.json.JsonSlurper()
def parsed_examples = [] // example cache

examples_folder.eachFileMatch(~/.*.json/) { example_file ->

   //println example_file.name

   parsed_examples << json_slurper.parseText(example_file.text)
}

// examples that match requested resources, note there could be more than one example for a given profile URL
// the key is the profile URL, the value a list of matched examples
def output_examples = [:]

parsed_examples.each { example ->

   requested_profiles.each { requested_profile_url ->

      // meta.profile is a list!
      if (example.meta.profile.contains(requested_profile_url))
      {
         //println "Found "+ example.meta.profile

         if (!output_examples[requested_profile_url])
         {
            output_examples[requested_profile_url] = []
         }

         // there could be multiple examples for the same profile, we index all of them
         output_examples[requested_profile_url] << example
      }
   }
}

// pick just one of each examples that match the each requested profile
def rnd_index, rnd, final_output_examples = []
output_examples.each {

   //println it.key +" "+ it.value.size()
   rnd_index = random.nextInt(it.value.size())
   //println rnd
   final_output_examples << it.value[rnd_index]
}


// prepare the output bundle map
def bundle_map = [
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

// add examples to the bundle map
def entry
def patient_id = String.uuid() // patient id is generated
def patient_identifier         // if present will use the bloom filter file

// if patient identifiers file is provided, pick the patient.identifier from there
if (options.pid)
{
   def pid_file = new File(options.pid)

   if (!pid_file.exists()) {
      println "PID file ${options.pid} doesn't exist"
      return
   }

   if (!pid_file.canRead()) {
      println "PID file ${config.pid} exists but can't be read"
      return
   }

   // picks random patient identifier from file
   def ids = pid_file.readLines()
   rnd_index = random.nextInt(ids.size())
   patient_identifier = ids[rnd_index]
}

//println patient_identifier

final_output_examples.each { example ->

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

         if (patient_identifier)
         {
            entry.resource.identifier[0].value = patient_identifier
         }
         else
         {
            entry.resource.identifier[0].value = String.randomNumeric(8)
         }
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

// serialize bundle to JSON
// TODO: add option to generate minimal or pretty printed output
println groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(bundle_map))