#### SOFA-Score

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| SOFA-Score |  | 

This profile of a FHIR Observation is used to capture the Sepsis-related Organ Failure Assessment score.

Use *Observation.value[x]:valueInteger* to document the total score.

The six sub-scores can be included under *Observation.component*, but these are optional.

---

**Profile - SOFA Score**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/sofa-score

**Snapshot**

{{tree:ForschungsnetzCovid-19/SOFA, snapshot}}

---

**ValueSet**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/sofa-score

{{render:ForschungsnetzCovid-19/sofa-score-vs}}

---

**CodeSystem**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/sofa-score

{{render:ForschungsnetzCovid-19/sofa-score-cs}}

---

**Examples**

**SOFA-Score**

{{json:71e371b6-b801-4387-bd36-ea015b2df658}} 

---