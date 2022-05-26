#### Follow-up swab result

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Follow-up swab result | Pos / Neg | 

---

This profile of a FHIR Observation is derived from the [Laboratory Observation-profile](https://simplifier.net/medizininformatikinitiative-modullabor/observationlab) of the Medical Informatics Initiative (MII). 

| RESPONSE OPTIONS | Observation.value[x]:valueCodeableConcept |
|--------------|-----------|
| Pos | `260373001 |Detected (qualifier value)|` |
| Neg | `260415000 |Not detected (qualifier value)|` | 

---

**Profile - SARS-CoV-2-RT-PCR**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/sars-cov-2-rt-pcr

**Snapshot**

{{tree:ForschungsnetzCovid-19/SarsCoV2RTPCR, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/detected-not-detected-inconclusive

{{render:ForschungsnetzCovid-19/detected-not-detected-inconclusive}}

---

**Examples**

**SARS-CoV-2 test positive**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-48}} 

---

**SARS-CoV-2 test negative**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-50}} 

---