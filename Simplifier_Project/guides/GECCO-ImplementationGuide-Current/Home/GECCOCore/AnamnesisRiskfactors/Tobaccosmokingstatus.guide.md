#### Tobacco smoking status

---

Parameter Case Report Form and Response Options

| Has the patient ever smoked cigarettes? | Yes | Nonsmoker | Former smoker | Unknown |
|-
| Smoking status | &#9744; | &#9744; | &#9744; | &#9744; | 

---

This profile of a FHIR Observation is derived from the [Tobacco use assessment-profile](http://hl7.org/fhir/uv/ips/STU1/StructureDefinition-Observation-tobaccouse-uv-ips.html) of the International Patient Summary (IPS). 

---

Control the different response options via the *valueCodeableConcept* of the Observation:

| RESPONSE OPTIONS | Observation.value[x]:valueCodeableConcept |
|--------------|-----------|
| Yes | `"Current every day smoker"` |
| Nonsmoker | `"Never smoker"` |
| Former smoker | `"Former smoker"` |
| Unknown | `"Unknown if ever smoked"` |

---

**Profile - Smoking Status**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/smoking-status

**Snapshot**

{{tree:ForschungsnetzCovid-19/SmokingStatus, snapshot}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/smoking-status

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/smoking-status}}

---

**Examples**

**Patient is smoker**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-6}} 

---

**Patient is nonsmoker**
<br>

{{json:cf5b0f7f-c05f-4620-9f7b-cd1372f44900}}

---

**Patient is former smoker**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-7}} 

---

**Unknown**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-9}} 

---
