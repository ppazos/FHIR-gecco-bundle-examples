#### Stage at diagnosis

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Stage at diagnosis | Uncomplicated phase / Complicated phase / Critical phase / Recovery phase / Dead / Unknown | 

---

Control the different response options via the *Condition.stage* element:

| RESPONSE OPTIONS | Condition.stage.summary |
|--------------|-----------|
| Uncomplicated phase | `Mild (qualifier value)`<br>`Mild to moderate (qualifier value)` |
| Complicated phase | `Moderate (severity modifier) (qualifier value)`<br>`Moderate to severe (qualifier value)` |
| Critical phase | `Severe (severity modifier) (qualifier value)`<br>`Life threatening severity (qualifier value)` |
| Recovery phase | `Remission phase (qualifier value)` | 
| Dead | `Fatal (qualifier value)` | 
| Unknown | `Unknown (qualifier value)` | 

---

**Profile - Diagnosis Covid-19**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/diagnosis-covid-19

**Snapshot**

{{tree:ForschungsnetzCovid-19/DiagnosisCovid19, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/stage-at-diagnosis

{{render:ForschungsnetzCovid-19/stage-at-diagnosis}}

---

**Examples**

**Critical phase at Covid-19 Diagnosis**
<br>

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-73}} 

---