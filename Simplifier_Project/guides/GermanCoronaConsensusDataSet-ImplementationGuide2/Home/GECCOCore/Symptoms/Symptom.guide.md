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

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. To represent the presence or absence of findings, use *verificationStatus*. 

---

**Profile - Presence Covid-19 Symptoms**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/symptoms-covid-19

**Snapshot**

{{tree:ForschungsnetzCovid-19/SymptomsCovid19-profile, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/sars-cov-2-symptoms

{{render:ForschungsnetzCovid-19/SARS-CoV-2-symptoms}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/condition-severity

{{render:ForschungsnetzCovid-19/condition-severity}}

---

**Examples**

**Symptom present**
<br>
Example condition where symptom with severity is present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-77}} 

---

**Symptom absent**
<br>
Example condition where symptom is absent 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-76}} 

---

**Symptom unknown**
<br>
Example condition where presence of symptom is unknown 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-78}} 

---
