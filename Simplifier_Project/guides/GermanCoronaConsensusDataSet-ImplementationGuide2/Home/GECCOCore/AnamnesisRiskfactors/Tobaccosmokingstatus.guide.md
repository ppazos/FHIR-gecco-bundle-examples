#### Tobacco smoking status

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Has the patient ever smoked cigarettes? | Yes / Nonsmoker / Former smoker / Unknown | 

---

This profile of a FHIR Observation is derived from the [Tobacco use assessment-profile](https://build.fhir.org/ig/HL7/fhir-ips/StructureDefinition-Observation-tobaccouse-uv-ips.html) of the International Patient Summary (IPS). 

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

{{tree:de.gecco@1.0.5/package/Profile-Observation-SmokingStatus.json, snapshot}} 

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/smoking-status

{{render:de.gecco@1.0.5/package/ValueSet-smoking-status.json}} 

---

**Examples**

**Patient is smoker**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-tobacco-smoking-status-current-every-day-smoker.json}}

---

**Patient is nonsmoker**
<br>

{{json:de.gecco@1.0.5/package/examples/Example-smoking-status.json}} 

---

**Patient is former smoker**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-tobacco-smoking-status-former-smoker.json}} 

---

**Unknown**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-tobacco-smoking-status-unknown-if-ever-smoked.json}}

---
