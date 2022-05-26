#### ACE inhibitors

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| ACE inhibitors | Yes / No / Unknown / stopped | 

---

This profile of a FHIR MedicationStatement is derived from the [MedicationStatement-profile](https://simplifier.net/medizininformatikinitiative-modulmedikation/medicationstatement-duplicate-3) of the Medical Informatics Initiative (MII).

Use *MedicationStatement.medication[x]:medicationCodeableConcept* to identify what medication was taken. There is a predifined slice with a SNOMED-CT coding for medication containing ACE inhibitors. In addition, the optional *atcClassDe* slice has a valueset binding to specifiy the medication in greater detail using ATC codes.

```json
{
  "system": "http://snomed.info/sct",
  "code": "41549009"
  "display": "Product containing angiotensin-converting enzyme inhibitor (product)"
}
```

Control the different response options via the *status* of the MedicationStatement:

| RESPONSE OPTIONS | MedicationStatement.status |
|--------------|-----------|
| Yes | `"status": "active"` |
| No | `"status": "not-taken"` |
| Unknown | `"status": "unknown"` |
|stopped | `"status": "stopped"` | 


---

**Profile - Pharmacological Therapy - ACE inhibitors**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy-ace-inhibitors

**Snapshot**

{{tree:ForschungsnetzCovid-19/PharmacologicalTherapyACEInhibitors}}

---

**ValueSets**

Valuesets are provided with ATC codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/ace-inhibitors-atc

{{render:ForschungsnetzCovid-19/ace-inhibitors-atc}}

---

**Examples**

**Patient is taking ACE inhibitor**
<br>

{{json:ForschungsnetzCovid-19/MedicationStatement-example}} 

---
