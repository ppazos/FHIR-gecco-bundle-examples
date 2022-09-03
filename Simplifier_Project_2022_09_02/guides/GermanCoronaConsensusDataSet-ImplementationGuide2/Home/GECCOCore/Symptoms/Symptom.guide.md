#### Symptom

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Loss of taste or smell | Yes / No / Unknown (Severity) | 
| Abdominal pain | Yes / No / Unknown (Severity) |
| Clouded consciousness | Yes / No / Unknown (Severity) |
| Diarrhea | Yes / No / Unknown (Severity) | 
| Vomiting | Yes / No / Unknown (Severity) | 
| Cough | Yes / No / Unknown (Severity) | 
| Dyspnea | Yes / No / Unknown (Severity) | 
| Nausea | Yes / No / Unknown (Severity) | 
| Fever | Yes / No / Unknown (Severity) | 
| Headache | Yes / No / Unknown (Severity) | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.diagnose/2.0.0-alpha3/files/402364) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. To represent the presence or absence of findings, use *verificationStatus*. 

---

**Profile - Presence Covid-19 Symptoms**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/symptoms-covid-19

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Condition-Symptoms-Covid-19.json, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:de.gecco@1.0.5/package/Extension-UncertaintyOfPresence.json, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/sars-cov-2-symptoms

{{render:de.gecco@1.0.5/package/ValueSet-sars-cov-2-symptome.json}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/condition-severity

{{render:de.gecco@1.0.5/package/ValueSet-condition-severity.json}}

---

**Examples**

**Symptom present**
<br>
Example condition where symptom with severity is present 

{{json:de.gecco@1.0.5/package/examples/Condition-symptom-cough-present.json}} 

---

**Symptom absent**
<br>
Example condition where symptom is absent 

{{json:de.gecco@1.0.5/package/examples/Condition-symptom-clouded-consciousness-absent.json}} 

---

**Symptom unknown**
<br>
Example condition where presence of symptom is unknown 

{{json:de.gecco@1.0.5/package/examples/Condition-symptom-loss-of-taste-unknown.json}}

---
