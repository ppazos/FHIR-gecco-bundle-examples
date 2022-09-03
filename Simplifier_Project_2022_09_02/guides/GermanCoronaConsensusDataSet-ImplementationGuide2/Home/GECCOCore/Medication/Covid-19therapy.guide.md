#### Covid-19 therapy

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Covid-19 therapy | Antipyretics / Corticosteroids / Atazanavir / Darunavir / Chloroquine phosphate / Hydroxychloroquine / Ivermectin / Lopinavir/ritonavir / Ganciclovir / Oseltamivir / Remdesivir / Ribavirin / Camostat / Favipiravir / Convalescent plasma / Steroids (> 0.5 mg/kg prednisone equivalents) / Steroids (<= 0.5 mg/kg prednisone equivalents) / Tocilizumab / Sarilumab / CNI or mTor inhibitors (e.g. cyclosporin A, tacrolimus, sirolimus, everolimus) / Anti-TNF-alpha inhibitors (e.g. adalimumab, etanercept) / Il1-receptor antangonists / Ruxolitinib / Colchicine / Interferone (any) / 25-Hydroxyvitamin D / Zinc / Other | 

---

This profile of a FHIR MedicationStatement is derived from the [MedicationStatement-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.medikation/1.0.10/files/404831) of the Medical Informatics Initiative (MII).

Use *MedicationStatement.medication[x]:medicationCodeableConcept* to code the case parameter form response options.

---

**Profile - Pharmacological Therapy**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy, snapshot}}

---

**ValueSets**

Valuesets are provided with ATC and OPS codes for some medications.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-snomed

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-snomed}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-atc

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-atc}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-ops

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-ops}}

---

**Examples**

**Patient is taking atazanavir**
<br>

{{json:de.gecco@1.0.5/package/examples/MedicationStatement-pharmacological-therapy-covid-19-product-containing-atazanavir-.json}}  

---
