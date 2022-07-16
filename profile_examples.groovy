// lists all profiles and their associated examples

def PS = System.getProperty("file.separator")
def examples_path = "Simplifier_Project${PS}beispiele${PS}"
def examples_folder = new File(examples_path)
def json_slurper = new groovy.json.JsonSlurper()
def parsed_examples = [:] // profiel => example list
def parsed_example, profile

examples_folder.eachFileMatch(~/.*.json/) { example_file ->

   parsed_example = json_slurper.parseText(example_file.text)

   profile = parsed_example.meta.profile[0] // NOTE: there could be more than one profile, we take the first one only

   if (!parsed_examples[profile])
   {
      parsed_examples[profile] = []
   }

   parsed_examples[profile] << example_file.name
}

int i = 0
parsed_examples.each { k_profile, examples ->

   println k_profile // prints just the profile URLs
/*
   println "${i+1}) ".padLeft(6, ' ') + k_profile
   examples.eachWithIndex { filename, j ->

      println "${i+1}.${j+1}) ".padLeft(12, ' ') + filename
   }
   i++
   */
}
