#### Is the patient in the intensive care unit?

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Is the patient in the intensive care unit? | Yes / No / Unknown | 

---

Note that in prior versions to 1.0.4 of this implementation guide, Observation.code used a proprietary code defined by this guide [here](https://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/ecrf-parameter-codes) which is now deprecated. The appropriate LOINC code 95420-6 *Whether the patient was admitted to intensive care unit (ICU) for condition of interest* was added to LOINC Version 2.69 and shall be used on Observation.code.

---

| RESPONSE OPTIONS | Observation.value[x] |
|--------------|-----------|
| Yes | `373066001 |Yes (qualifier value)|` |
| No | `373067005 |No (qualifier value)|` | 
| Unknown | `261665006 |Unknown (qualifier value)|` |

---

**Profile - Patient in Intensive Care Unit**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/patient-in-icu

**Snapshot**

{{tree:ForschungsnetzCovid-19/PatientInICU, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/yes-no-unknown-other-na

{{render:ForschungsnetzCovid-19/yes-no-unknown-other-na}}

---

**Examples**

**Yes**
<br>
Patient is in ICU 

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-12}} 

---

**No**
<br>
Patient is not in ICU 

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-10}} 

---

**Unknown**
<br>
Unknown if patient is in ICU 

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-11}} 

---