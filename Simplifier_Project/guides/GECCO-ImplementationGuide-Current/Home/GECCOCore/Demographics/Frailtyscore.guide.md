#### Frailty score

---

Parameter Case Report Form and Response Options 

| Frailty score before admission |  |
|-
| Frailty score | \{score\} | 

---

This profile of a FHIR Observation is used to capture the result from a Clinical Frailty Scale© (CFS).

*Observation.code* shall be coded as SNOMED-CT *713636003 |Frailty Index score (observable entity)|*.

*Observation.method* contains the type of assessment scale used for this observation in form of a SNOMED-CT code *445414007 |Canadian Study of Health and Aging clinical frailty scale (assessment scale)|*.

*Observation.valueCodeableConcept* shall be used to capture the coded result.

---

**Profile - Clinical Frailty Scale Score**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/frailty-score

**Snapshot**

{{tree:ForschungsnetzCovid-19/FrailtyScore, snapshot}}

---

**ValueSets**

The Frailty-Score valueset contains the coded results of this assessment scale. Please note the copyright: This artefact includes content under copyright from Geriatric Medicine Research, Dalhousie University, Halifax, Canada. Implementers of these artefacts must complete a Permission for Use Agreement - for more information visit https://www.dal.ca/sites/gmr/our-tools/clinical-frailty-scale.html.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies

{{render:ForschungsnetzCovid-19/frailty-score-vs}}

---

{{render:ForschungsnetzCovid-19/frailty-score}}

---

**Examples**

**Frailty Scale Score**
<br>
Example observation

{{json:ForschungsnetzCovid-19/Observation-example-frailty-scale-score}} 

---