// for each profile in the examples, takes one example of each, and adds it to the patient resources that will be used to generate the bundles

PS = System.getProperty("file.separator")
examples_path = "Simplifier_Project_2022_09_02${PS}fsh-generated${PS}resources${PS}"
examples_folder = new File(examples_path)
def json_slurper = new groovy.json.JsonSlurper()
def parsed_examples = [] // profiel => example list
def parsed_example

// class extensions =========================================================
String.metaClass.static.uuid = { ->
   java.util.UUID.randomUUID() as String
}


// metadata

// patient resource that will be used as the base to generate multiple patient data (10)
// this resource is mandatory in the bundle
def patient_example = "Simplifier_Project_2022_09_02${PS}fsh-generated${PS}resources${PS}Patient-patient-num-codex-crr-pseudonym-with-gender.json"
def patient_profile = "https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/Patient"

// profile examples will be used just for the corresponding sex
def sex_dependent_profiles = [
   'male': [ // profiles to avoid for males
      'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pregnancy-status'
   ],
   'unknown': [ // profiles to avoid for unknown
      'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pregnancy-status'
   ],
   'female': [ // profiles to avoid for females
      
   ]
]



// load all exampels
examples_folder.eachFileMatch(~/.*.json/) { example_file ->

   parsed_example = json_slurper.parseText(example_file.text)
   parsed_examples << parsed_example
}



// group examples by profile: profile => examples already parsed!
def profile_examples = parsed_examples.groupBy { it.meta.profile[0] }

//println profile_examples.keySet()



// metadata to generate instances of the patient resource
// id,first_name,last_name,gender,dob,ssn
def patients_meta = """
1,Leena,Bizzey,Female,2018-07-07,390-05-7157
2,Vaughan,Capstick,,1989-10-20,402-99-7921
3,Zorah,Hendrix,,1965-04-18,162-27-9099
4,Lind,Diess,Male,1967-02-07,411-58-7472
5,Pavla,Gatty,Female,2015-06-14,543-49-5027
6,Gabi,O'Hogertie,,1966-06-17,580-61-4027
7,Curtis,Oddboy,Male,2013-02-19,816-85-7754
8,Kiel,Sillars,Male,1985-01-07,353-89-1482
9,Elyssa,Inwood,Female,1978-01-19,724-75-4221
10,Robby,Goulstone,Female,1992-09-04,808-89-3509
"""

def patient_resource
def duration, age, now, sex, profile_example_counter = [:] // profile => index of the last example used
def patient_index = 0
def patient_output_folder, example_pick, example_output_file
def examples_picked // examples chosen for each patient, used to check for references and include them too



patients_meta.trim().splitEachLine(",") { row ->

   // util to resolve references to a fullUrl
   def new_old_reference_map = [:] // urn:uuid:123 => Obs/123

   //println row

   // load resource that will be used as template for all patients
   patient_resource = json_slurper.parseText(new File(patient_example).text)

   if (!row[3]) patient_resource.gender = 'unknown'
   else         patient_resource.gender = row[3].toLowerCase()

   sex = patient_resource.gender

   patient_resource.birthDate = row[4]

   // calculate age
   now = new Date()
   duration = groovy.time.TimeCategory.minus(
      now,
      Date.parse("yyyy-MM-dd", row[4])
   )

   // age.dateOfDocumentation
   patient_resource.extension[1].extension[0].valueDateTime = now.format('yyyy-MM-dd')

   // age.valueAge
   patient_resource.extension[1].extension[1].valueAge.value = duration.days.intdiv(365)


   // println duration
   //println Date.parse("yyyy-MM-dd", row[4])
   // TODO: update text.div

   examples_picked = []

   // choose one example from each profile, excluding sex based
   profile_examples.each { profile, examples ->

      // checks
      if (profile == patient_profile) return // do not process the patient profile

      if (sex_dependent_profiles[sex].contains(profile)) return // do not process if profile should be avoided for the patient sex

      // avoid bundle examples
      if (examples[0].resourceType == "Bundle") return

      if (profile_example_counter[profile] == null)
      {
         profile_example_counter[profile] = 0 // use first example of this profile
      }

      example_pick = examples[profile_example_counter[profile]] // parsed example

      // FIXME: before output should fix the references and ids...
      output(patient_index, example_pick, examples)

      examples_picked << example_pick

      // if all examples are used, start again from the beginning
      profile_example_counter[profile] = (profile_example_counter[profile] + 1) % examples.size()
   }

   // resolve references
   def reference_value, included_resource, referenced_resource
   examples_picked.each { example ->

      if (example.resourceType == 'Observation')
      {
         if (example.hasMember)
         {
            // hasMember is an array of references
            example.hasMember.each { ref ->

               reference_value = ref.reference

               included_resource = get_resource_by_ref(examples_picked, reference_value)

               if (reference_value.contains('urn'))
               {
                  if (new_old_reference_map[reference_value])
                  {
                     included_resource = get_resource_by_ref(examples_picked, new_old_reference_map[reference_value])
                  }

                  // the included resource already has an updated id
                  if (!included_resource)
                  {
                     included_resource = get_resource_by_ref(examples_picked, reference_value)
                  }
                  else // container has urn and referenced doesn't, updated referenced
                  {
                     included_resource.id = reference_value
                  }
               }
               else // Proc/123 => urn:uuid:123
               {
                  included_resource = get_resource_by_ref(examples_picked, reference_value)

                  ref.reference = 'urn:uuid:'+ String.uuid() //reference_value.split("/")[1]
                  new_old_reference_map[ref.reference] = reference_value
               }

               //println ref.reference
               //println reference_value

               if (!included_resource)
               {
                  if (reference_value.contains('urn'))
                  {
                     // referenced resource doesn't have an updated id
                     if (new_old_reference_map[reference_value])
                     {
                        referenced_resource = get_resource_by_ref(parsed_examples, new_old_reference_map[reference_value])
                     }

                     // the referenced resource already has an updated id
                     if (!referenced_resource)
                     {
                        referenced_resource = get_resource_by_ref(parsed_examples, reference_value)
                     }
                  }
                  else
                  {
                     referenced_resource = get_resource_by_ref(parsed_examples, reference_value)
                  }

                  if (!referenced_resource)
                  {
                     println "missing 1 ${reference_value}"
                  }
                  else
                  {
                     referenced_resource.id = ref.reference // with urn:uuid:123
                     output(patient_index, referenced_resource, parsed_examples)
                  }
               }
            }
         }
      }
      else if (example.resourceType == 'Procedure')
      {
         if (example.report)
         {
            // report has an array of references
            example.report.each { ref ->

               reference_value = ref.reference
               
               if (reference_value.contains('urn'))
               {
                  if (new_old_reference_map[reference_value])
                  {
                     included_resource = get_resource_by_ref(examples_picked, new_old_reference_map[reference_value])
                  }

                  // the included resource already has an updated id
                  if (!included_resource)
                  {
                     included_resource = get_resource_by_ref(examples_picked, reference_value)
                  }
                  else // container has urn and referenced doesn't, updated referenced
                  {
                     println "modified included_resource ${included_resource.id} => ${reference_value}"
                     included_resource.id = reference_value
                  }
               }
               else // Proc/123 => urn:uuid:123
               {
                  included_resource = get_resource_by_ref(examples_picked, reference_value)

                  ref.reference = 'urn:uuid:'+ String.uuid() //reference_value.split("/")[1]
                  new_old_reference_map[ref.reference] = reference_value
               }

               //println ref.reference
               //println reference_value

               if (!included_resource)
               {
                  if (reference_value.contains('urn'))
                  {
                     println "ref_value has urn"
                     // referenced resource doesn't have an updated id
                     if (new_old_reference_map[reference_value])
                     {
                        referenced_resource = get_resource_by_ref(parsed_examples, new_old_reference_map[reference_value])
                     }

                     // the referenced resource already has an updated id
                     if (!referenced_resource)
                     {
                        referenced_resource = get_resource_by_ref(parsed_examples, reference_value)\
                     }
                  }
                  else
                  {
                     println "ref_value doesn't have urn"
                     referenced_resource = get_resource_by_ref(parsed_examples, reference_value)
                  }

                  if (!referenced_resource)
                  {
                     println "missing 2 ${reference_value}"
                     //println parsed_examples*.id
                     println new_old_reference_map
                  }
                  else
                  {
                     println "modified referenced_resource ${referenced_resource.id} => ${ref.reference}"
                     referenced_resource.id = ref.reference // with urn:uuid:123
                     output(patient_index, referenced_resource, parsed_examples)

                     println parsed_examples*.id
                  }
               }
            }
         }
      }
   }
   println "-"


   // output patient resource
   patient_output_folder = new File("patients_2022_10_20${PS}patient_${patient_index}")
   //patient_output_folder.mkdirs()

   example_output_file = new File(patient_output_folder, "patient.json")
   example_output_file << groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(patient_resource))


   patient_index++
}

def get_resource_by_ref(parsed_examples, ref)
{
   def res
   if (ref.contains('urn'))
   {
      //println "get_resource_by_ref 1"
      res = parsed_examples.find { it.id == ref }
   }
   else
   {
      //println "get_resource_by_ref 2"
      def type_id = ref.split("/")

      res = parsed_examples.find { it.resourceType == type_id[0] && it.id == type_id[1] }
   }

   return res
}

def output(patient_index, example, examples)
{
   def patient_output_folder, example_output_file, profile

   if (!example) throw new Exception("null example")

   profile = example.meta.profile[0]

   // prepare output
   patient_output_folder = new File("patients_2022_10_20${PS}patient_${patient_index}")
   patient_output_folder.mkdirs()

   example_output_file = new File(patient_output_folder, example.id +".json")

   // store a copy of the example in the folder corresponding to the current patient
   example_output_file << groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(example))
}