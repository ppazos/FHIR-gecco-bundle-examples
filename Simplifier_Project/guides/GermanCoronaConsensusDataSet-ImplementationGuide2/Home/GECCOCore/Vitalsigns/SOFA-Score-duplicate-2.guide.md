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

{{tree:de.gecco@1.0.5/package/Profile-Observation-SOFA.json, snapshot}} 

---

**ValueSet**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/sofa-score

{{render:de.gecco@1.0.5/package/ValueSet-sofa-score.json}} 

---

**CodeSystem**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/sofa-score

{{render:de.gecco@1.0.5/package/Codesystem-sofa-score.json}} 

---

**Examples**

**SOFA-Score**

{{json:de.gecco@1.0.5/package/examples/Example-observation-sofa-score.json}} 

---