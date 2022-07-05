def PS = System.getProperty("file.separator")
def random = new Random()

// List of excluded types
def excluded = ['Patient', 'Bundle']

def profiles_path = "Simplifier_Project${PS}ressourcen-profile${PS}"
def profiles_folder = new File(profiles_path)

def xml_slurper = new groovy.xml.XmlSlurper()
def parsed_profile

def profile_count = 0
def profile_urls = []
profiles_folder.eachFileMatch(~/.*.xml/) { profile_file ->

   //println profile_file.name

   parsed_profile = xml_slurper.parseText(profile_file.text)

   if (!excluded.contains(parsed_profile.type.@value.text()))
   {
      profile_count++
      profile_urls << parsed_profile.url.@value.text()
   }
}


def max = random.nextInt(profile_count)
def rnd

(0..max).each {

   rnd = random.nextInt(profile_urls.size())

   println profile_urls[rnd]

   profile_urls.removeAt(rnd) // avoid picking the same profile again
}

// Mandatory patient profile in the output
println "https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/Patient"