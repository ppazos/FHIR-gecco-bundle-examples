#### Immunoglobulins

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Immunoglobulins | Yes / No / Unknown | 

---

This profile of a FHIR MedicationStatement is derived from the [MedicationStatement-profile](https://simplifier.net/medizininformatikinitiative-modulmedikation/medicationstatement-duplicate-3) of the Medical Informatics Initiative (MII).

Use *MedicationStatement.medication[x]:medicationCodeableConcept* to identify what medication was taken. There is a predifined slice with a SNOMED-CT coding for medication containing immunoglobulins. In addition, the optional *atcClassDe* slice has a valueset binding to specifiy the medication in greater detail using ATC codes.

```json
{
  "system": "http://snomed.info/sct",
  "code": "333710000"
  "display": "Product containing immunoglobulin (product)"
}
```

Control the different response options via the *status* of the MedicationStatement:

| RESPONSE OPTIONS | MedicationStatement.status |
|--------------|-----------|
| Yes | `"status": "active"` |
| No | `"status": "not-taken"` |
| Unknown | `"status": "unknown"` |

---

**Profile - Pharmacological Therapy Immunoglobulins**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy-immunoglobulins

**Snapshot**

{{tree:ForschungsnetzCovid-19/PharmacologicalTherapyImmunoglobulins}}

---

**ValueSets**

Valuesets are provided with ATC codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/immunoglobulins-atc

{{render:ForschungsnetzCovid-19/immunoglobulins-atc}}

---

**Examples**

**Patient takes immunoglobulins**
<br>

{{json:ForschungsnetzCovid-19/MedicationStatement-example-duplicate-6}} 

---

**Immunoglobulins not taken**
<br>

{{json:ForschungsnetzCovid-19/MedicationStatement-example-duplicate-7}} 

---

**Unknown if patient is taking immunoglobulins**
<br>

{{json:ForschungsnetzCovid-19/MedicationStatement-example-duplicate-8}} 

---