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

{{tree:de.gecco@1.0.5/package/Profile-Observation-StudyInclusionCovid19.json, snapshot}} 

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/yes-no-unknown-other-na

{{render:de.gecco@1.0.5/package/ValueSet-yes-no-unknown-other-na.json}}

---

**Examples**

**Covid-19 as primary reason for study inclusion**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-study-inclusion-covid-19-yes-qualifier-value.json}} 

---

**Covid-19 not the primary reason for study inclusion**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-study-inclusion-covid-19-no-qualifier-value.json}} 

---

**Unknown if Covid-19 is primary reason for study inclusion**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-study-inclusion-covid-19-unknown-qualifier-value.json}}

---