#### Complication

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Thromboembolic events | Venous thrombosis / Pulmonary embolism / Stroke / Myocardial infarction / Other | 
| Infectious disease of lung | Yes / No / Unknown |
| Infectious agent in bloodstream | Yes / No / Unknown |

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. To represent the presence or absence of findings, use *verificationStatus*. 

---

**Profile - Complication**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/complications-covid-19

**Snapshot**

{{tree:ForschungsnetzCovid-19/complications-covid-19-profile, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/complications-covid-19

{{render:ForschungsnetzCovid-19/complications-covid-19}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/complications-covid-19-icd

{{render:ForschungsnetzCovid-19/complications-covid-19-icd}}

---

**Examples**

**Complication Present**
<br>

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-67}} 

---

**Complication Absent**
<br>

{{json:ForschungsnetzCovid-19/c989bb6b-e165-4896-8e4b-ae7ab80b4a9e}} 

---

**Complication Unknown**
<br>

{{json:ForschungsnetzCovid-19/ef23aad6-3e79-4e0d-a017-8915d7ed1480}} 

---