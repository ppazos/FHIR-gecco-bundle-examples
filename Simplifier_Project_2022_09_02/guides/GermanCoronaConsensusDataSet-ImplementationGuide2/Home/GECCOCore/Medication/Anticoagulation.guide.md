#### Anticoagulation

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Anticoagulation | Unfractionated heparin / Low molecular weight heparin / Argatroban / Platelet aggregation inhibitor / Danaparoid / Phenprocoumon / direct oral anticoagulants / Other (Thrombosis prophylaxis / Therapeutic anticoagulation) | 
| Therapeutic intent - why the drug is taken | prophylactical / therapeutical |

---

This profile of a FHIR MedicationStatement is derived from the [MedicationStatement-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.medikation/1.0.10/files/404831) of the Medical Informatics Initiative (MII).

Use *MedicationStatement.medication[x]:medicationCodeableConcept* to code the case parameter form response options.

The therapeutic intent - prophylactical or therapeutical - can be specified with *MedicationStatement.reasonCode*.

| RESPONSE OPTIONS | MedicationStatement.reasonCode |
|--------------|-----------|
| prophylactical | `360271000 |Prophylaxis - procedure intent (qualifier value)|` |
| therapeutical | `373808002 |Curative - procedure intent (qualifier value)|` |

---

**Profile - Pharmacological Therapy - Anticoagulation**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy-anticoagulants

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy-anticoagulants}}

---

**ValueSets**

Valuesets are provided with ATC codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/anticoagulants-atc

{{render:de.gecco@1.0.5/package/ValueSet-anticoagulants-atc.json}} 

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/therapeutic-intent

{{render:de.gecco@1.0.5/package/ValueSet-therapeutic-intent.json}}

---

**Examples**

**Patient takes heparin prophylactically**
<br>

{{json:de.gecco@1.0.5/package/examples/MedicationStatement-anticoagulants-medicinal-product-acting-as-anticoagulant-agent-active.json}}  

---