# FHIR-gecco-bundle-examples

Example FHIR bundle resources for the NUM CODEX project of HiGHmed

## Use the Groovy script build_bundle.groovy to generate a bundle instance

> $ groovy build_bundle.groovy -wp bundle1_profiles | xclip -sel clip

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

> $ groovy build_bundle.groovy -wp bundle1_profiles > output.json

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

By adding JSON examples to the examples folder, will make them available for the bundle generator without changing the code.

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