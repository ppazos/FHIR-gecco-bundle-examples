#### Covid-19 therapy

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Covid-19 therapy | Antipyretics / Corticosteroids / Atazanavir / Darunavir / Chloroquine phosphate / Hydroxychloroquine / Ivermectin / Lopinavir/ritonavir / Ganciclovir / Oseltamivir / Remdesivir / Ribavirin / Camostat / Favipiravir / Convalescent plasma / Steroids (> 0.5 mg/kg prednisone equivalents) / Steroids (<= 0.5 mg/kg prednisone equivalents) / Tocilizumab / Sarilumab / CNI or mTor inhibitors (e.g. cyclosporin A, tacrolimus, sirolimus, everolimus) / Anti-TNF-alpha inhibitors (e.g. adalimumab, etanercept) / Il1-receptor antangonists / Ruxolitinib / Colchicine / Interferone (any) / 25-Hydroxyvitamin D / Zinc / Other | 

---

This profile of a FHIR MedicationStatement is derived from the [MedicationStatement-profile](https://simplifier.net/medizininformatikinitiative-modulmedikation/medicationstatement-duplicate-3) of the Medical Informatics Initiative (MII).

Use *MedicationStatement.medication[x]:medicationCodeableConcept* to code the case parameter form response options.

---

**Profile - Pharmacological Therapy**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pharmacological-therapy

**Snapshot**

{{tree:ForschungsnetzCovid-19/PharmacologicalTherapy}}

---

**ValueSets**

Valuesets are provided with ATC and OPS codes for some medications.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-snomed

{{render:ForschungsnetzCovid-19/pharmacological-therapy-snomed}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-atc

{{render:ForschungsnetzCovid-19/pharmacological-therapy-atc}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pharmacological-therapy-ops

{{render:ForschungsnetzCovid-19/pharmacological-therapy-ops}}

---

**Examples**

**Patient is taking atazanavir**
<br>

{{json:ForschungsnetzCovid-19/MedicationStatement-example-duplicate-9}} 

---
