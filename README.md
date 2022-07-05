# FHIR-gecco-bundle-examples

Generator of examples of FHIR bundle resources for the NUM CODEX project of HiGHmed

## Use the Groovy script build_bundle.groovy to generate a bundle instance

> $ groovy build_bundle.groovy -wp input/bundle1_profiles | xclip -sel clip

## 1. Install Groovy from SDKMAN! or download directly

- https://sdkman.io/
- https://groovy.apache.org/download.html

(tested with Groovy Version: 2.5.14 JVM: 1.8.0_302 Vendor: Oracle Corporation OS: Linux)

## 2. Configure your profiles file

Create a text file with one profile URL per line, always include one URL for the Patient profile.

This file is the `bundle1_profiles` passed as an argument to the script above.

## 3. (optional) Install xclip to copy the bundle output to the clipboard

> $ sudo apt-get install xclip

If you don't use xclip, the output will be printed out to the terminal.

To store the output in a file:

> $ groovy build_bundle.groovy -wp input/bundle1_profiles > output/output1.json

## 4. Want to generate multiple outputs?

> $ groovy build_bundle_multiple.groovy -wp bundle1_profies -n 10

This will generate 10 JSON bundles in the `/out` folder. If the `-n` argument is not provided, it will generate 10 by default.

## 5. Using bloom-filter identifiers

Here `identifiers` is a text file containing one patient identifier per line.

> $ groovy build_bundle.groovy -wp bundle1_profiles -pid identifiers

This will generate 1 bundle, print it to the standard output, and the patient.identifier.value will be taken from the `identifiers` file randomly.

> $ groovy build_bundle_multiple.groovy -wp bundle1_profies -n 10 -pid identifiers

This will generate 10 bundles in the `/out` folder, and the patient.identifier.value will be taken from the `identifiers` file randomly for each bundle.

NOTE: the `/debugging_daten_bloomfilter` folder contains many files with identifiers.

## How this works?

The script uses the references to the profiles to search in the examples folder of the Simplifier Project (https://simplifier.net/forschungsnetzcovid-19).

If there is more than one example for a given profile, it picks just one example randomly. It uses ONLY the JSON examples.

By adding JSON examples to the examples folder, will make them available for the bundle generator without changing the code. So if you want to change the data included in the bundle, just add another example with the data modified manually, then some run (because it's random) of the bundle generator will pick that new example.

The identifier for the patient is generated, and all the references to the patient from the example entries of the bundle are fixed to the generated patient identifier.

The example resource types supported are:

- Patient
- Consent
- Condition
- Procedure
- Observation
- Immunization
- DiagnosticReport
- MedicationStatement

All the resource examples that are not `Patient` should have a reference to the patient/subject in them, which will be modified to reference the correct patient id in the bundle. The script won't create this reference object if it's missing. If the patient reference is missing, the script will fail.

Then the output could be validated against the profile https://simplifier.net/forschungsnetzcovid-19/geccobundle (you need to be logged in to Simplifier to access the validation functionality).

Note the project also includes another bundle profile (https://simplifier.net/forschungsnetzcovid-19/geccobundlecodex), this script doesn't generate a bundle for that one but could be tweaked to do so.

The output is JSON 'pretty printed'.


## Other utilitary scripts

### List available profile URLs

> $ groovy list_profiles -e Observation -e Immunization

The argument `-e` is optional and multivalued, it excludes listing profiles with the given resource type.

It is used to list all profiles without the patient and bundle ones to generate the input file configurations. That is because the patient will always be added and the bundle should be avoided since we want to process the rest of the types that will go inside a bundle.

> $ groovy list_profiles.groovy -e Patient -e Bundle


### Generate input file for the build_bundle.groovy script

This command will generate a file with a list of available profile URLs that can be used as input for the build_bundle.groovy script.

The number of profile URLs on each file is random, and the list or URLs always includes the profile for the `patient` and excludes any profiles for `bundle`, creating what the build_bundle script expects.

> $ groovy generate_input.groovy > input/bundle100_profiles

Then you can just execute this other command to get a JSON bundle:

> $ groovy build_bundle.groovy -wp input/bundle100_profiles > output/bundle100.json