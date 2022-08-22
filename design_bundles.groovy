// for each profile in the examples, takes one example of each, and adds it to the patient resources that will be used to generate the bundles

PS = System.getProperty("file.separator")
examples_path = "Simplifier_Project${PS}beispiele${PS}"
examples_folder = new File(examples_path)
def json_slurper = new groovy.json.JsonSlurper()
def parsed_examples = [] // profiel => example list
def parsed_example

// metadata

// patient resource that will be used as the base to generate multiple patient data (10)
// this resource is mandatory in the bundle
def patient_example = "Simplifier_Project${PS}beispiele${PS}Patient-num-codex-example-with-gender.json"
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

      output(patient_index, example_pick, examples)

      examples_picked << example_pick

      // if all examples are used, start again from the beginning
      profile_example_counter[profile] = (profile_example_counter[profile] + 1) % examples.size()
   }

   // resolve references
   def references = []
   examples_picked.each { example ->

      if (example.resourceType == 'Observation')
      {
         if (example.hasMember)
         {
            // hasMember is an array of references
            example.hasMember.each { ref ->

               def included_resource = get_resource_by_ref(examples_picked, ref.reference)

               if (!included_resource)
               {
                  def referenced_resource = get_resource_by_ref(parsed_examples, ref.reference)

                  if (!referenced_resource)
                  {
                     println "missing 1 $ref.reference"
                  }

                  output(patient_index, referenced_resource, parsed_examples)
               }
            }
         }
      }
      else if (example.resourceType == 'Procedure')
      {
         if (example.report)
         {
            example.report.each { ref ->

               def included_resource = get_resource_by_ref(examples_picked, ref.reference)

               if (!included_resource)
               {
                  def referenced_resource = get_resource_by_ref(parsed_examples, ref.reference)

                  if (!referenced_resource)
                  {
                     println "missing 2 $ref.reference"
                  }

                  output(patient_index, referenced_resource, parsed_examples)
               }
            }
         }
      }
   }


   // output patient resource
   patient_output_folder = new File("patients${PS}patient_${patient_index}")
   example_output_file = new File(patient_output_folder, "patient.json")
   example_output_file << groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(patient_resource))


   patient_index++
}

def get_resource_by_ref(parsed_examples, ref)
{
   def type_id = ref.split("/")

   parsed_examples.find { it.resourceType == type_id[0] && it.id == type_id[1] }
}

def output(patient_index, example, examples)
{
   def patient_output_folder, example_output_file, profile

   if (!example) throw new Exception("null example")

   profile = example.meta.profile[0]

   // prepare output
   patient_output_folder = new File("patients${PS}patient_${patient_index}")
   patient_output_folder.mkdirs()

   example_output_file = new File(patient_output_folder, example.id +".json")

   // store a copy of the example in the folder corresponding to the current patient
   example_output_file << groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(example))
}