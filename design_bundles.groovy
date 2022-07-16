// for each profile in the examples, takes one example of each, and creates a bundle configuration

def PS = System.getProperty("file.separator")
def examples_path = "Simplifier_Project${PS}beispiele${PS}"
def examples_folder = new File(examples_path)
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

   // choose one example from each profile, excluding sex based
   profile_examples.each { profile, examples ->

      if (profile == patient_profile) return // do not process the patient profile

      if (sex_dependent_profiles[sex].contains(profile)) return // do not process if profile should be avoided for the patient sex

      // avoid bundle examples
      if (examples[0].resourceType == "Bundle") return

      if (profile_example_counter[profile] == null)
      {
         profile_example_counter[profile] = 0 // use first example of this profile
      }

      // prepare output
      patient_output_folder = new File("patients${PS}patient_${patient_index}")
      patient_output_folder.mkdirs()

      example_pick = examples[profile_example_counter[profile]] // parsed example
      example_output_file = new File(patient_output_folder, example_pick.id +".json")

      // store a copy of the example in the folder corresponding to the current patient
      example_output_file << groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(example_pick))

      // if all examples are used, start again from the beginning
      profile_example_counter[profile] = (profile_example_counter[profile] + 1) % examples.size()
   }


   // output patient resource
   example_output_file = new File(patient_output_folder, "patient.json")
   example_output_file << groovy.json.JsonOutput.prettyPrint(groovy.json.JsonOutput.toJson(patient_resource))


   patient_index++
}

/*

*/