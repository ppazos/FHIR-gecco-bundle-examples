#### Immunoglobulins

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Immunoglobulins | Yes / No / Unknown | 

---

This profile of a FHIR MedicationStatement is derived from the [MedicationStatement-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.medikation/1.0.10/files/404831) of the Medical Informatics Initiative (MII).

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

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy-immunoglobulins, snapshot}}

---

**ValueSets**

Valuesets are provided with ATC codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/immunoglobulins-atc

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/immunoglobulins-atc}}

---

**Examples**

**Patient takes immunoglobulins**
<br>

{{json:de.gecco@1.0.5/package/examples/MedicationStatement-immunoglobulins-product-containing-immunoglobulin-active.json}} 

---

**Immunoglobulins not taken**
<br>

{{json:de.gecco@1.0.5/package/examples/MedicationStatement-immunoglobulins-product-containing-immunoglobulin-not-taken.json}} 

---

**Unknown if patient is taking immunoglobulins**
<br>

{{json:de.gecco@1.0.5/package/examples/MedicationStatement-immunoglobulins-product-containing-immunoglobulin-unknown.json}}

---