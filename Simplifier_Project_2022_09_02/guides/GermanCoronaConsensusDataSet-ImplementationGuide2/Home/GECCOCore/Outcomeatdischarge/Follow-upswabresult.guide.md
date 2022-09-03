#### Follow-up swab result

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Follow-up swab result | Pos / Neg | 

---

This profile of a FHIR Observation is derived from the [Laboratory Observation-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.laborbefund/1.0.6/files/388074) of the Medical Informatics Initiative (MII). 

| RESPONSE OPTIONS | Observation.value[x]:valueCodeableConcept |
|--------------|-----------|
| Pos | `260373001 |Detected (qualifier value)|` |
| Neg | `260415000 |Not detected (qualifier value)|` | 

---

**Profile - SARS-CoV-2-RT-PCR**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/sars-cov-2-rt-pcr

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-SARS-CoV-2-RT-PCR.json, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/detected-not-detected-inconclusive

{{render:de.gecco@1.0.5/package/ValueSet-detected-not-detected-inconclusive.json}}

---

**Examples**

**SARS-CoV-2 test positive**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-laboratory-sars-cov-2-pcr-detected-.json}} 

---

**SARS-CoV-2 test negative**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-laboratory-sars-cov-2-pcr-not-detected-.json}}

---