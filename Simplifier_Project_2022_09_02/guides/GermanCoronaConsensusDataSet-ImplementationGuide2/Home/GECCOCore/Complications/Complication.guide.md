#### Complication

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Thromboembolic events | Venous thrombosis / Pulmonary embolism / Stroke / Myocardial infarction / Other | 
| Infectious disease of lung | Yes / No / Unknown |
| Infectious agent in bloodstream | Yes / No / Unknown |

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.diagnose/2.0.0-alpha3/files/402364) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. To represent the presence or absence of findings, use *verificationStatus*. 

---

**Profile - Complication**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/complications-covid-19

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/complications-covid-19, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence, snapshot}}

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/complications-covid-19

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/complications-covid-19}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/complications-covid-19-icd

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/complications-covid-19-icd}}

---

**Examples**

**Complication Present**
<br>

{{json:de.gecco@1.0.5/package/examples/Condition-complication-infectious-disease-of-lung-present.json}} 

---

**Complication Absent**
<br>

{{json:de.gecco@1.0.5/package/examples/Condition-complication-infectious-agent-in-bloodstream-absent.json}} 

---

**Complication Unknown**
<br>

{{json:de.gecco@1.0.5/package/examples/Condition-complication-myocardial-infarction-unknown.json}}   

---