#### Study enrolment due to Covid-19

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Confirmed Covid-19 diagnosis as main reason for enrolment in the study | Yes / No / Unknown | 

---

This profile of a FHIR Observation captures if a confirmed Covid-19 diagnosis is the main reason for enrolment in the study.

---

**Profile - Study Inclusion due to Covid-19**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/study-inclusion-covid-19

**Snapshot**

{{tree:ForschungsnetzCovid-19/StudyInclusionCovid19, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/yes-no-unknown-other-na

{{render:ForschungsnetzCovid-19/yes-no-unknown-other-na}}

---

**Examples**

**Covid-19 as primary reason for study inclusion**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-27}} 

---

**Covid-19 not the primary reason for study inclusion**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-25}} 

---

**Unknown if Covid-19 is primary reason for study inclusion**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-26}} 

---