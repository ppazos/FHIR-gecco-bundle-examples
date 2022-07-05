def PS = System.getProperty("file.separator")

def cli = new CliBuilder(usage: 'list_profiles.groovy -e excluded_type1 -e excluded_type2')
cli.with {
   e longOpt: 'excluded profiles', args: org.apache.commons.cli.Option.UNLIMITED_VALUES, 'Text file with profile URIs, one per line'
}
def options = cli.parse(args)

// List of excluded types
def excluded = options.es ?: []

def profiles_path = "Simplifier_Project${PS}ressourcen-profile${PS}"
def profiles_folder = new File(profiles_path)

def xml_slurper = new groovy.xml.XmlSlurper()
def parsed_profile

profiles_folder.eachFileMatch(~/.*.xml/) { profile_file ->

   //println profile_file.name

   parsed_profile = xml_slurper.parseText(profile_file.text)

   if (!excluded.contains(parsed_profile.type.@value.text()))
   {
      println parsed_profile.url.@value.text()
   }
}