#### Body temperature

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Body temperature |  | 

---

This profile of a FHIR Observation is derived from the [Body temperature-profile](http://hl7.org/fhir/observation-bodytemp.html) of the FHIR R4 core specification.

In addition to LOINC, *Observation.code* contains an exemplary SNOMED-CT coding.

*Observation.valueQuantity* has a fixed UCUM-unit of *Cel*.

---

**Profile - Body temperature**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/body-temperature

**Snapshot**

{{tree:ForschungsnetzCovid-19/BodyTemperature, snapshot}}

---

**Examples**

**Body Temperature**
<br>
Example observation body temperature

{{json:ForschungsnetzCovid-19/Observation-example-body-temperature-2}} 

---

**Body Temperature Urinary Bladder**
<br>
Note the additional LOINC coding on Observation.code

{{json:ForschungsnetzCovid-19/162918dc-dc70-4767-a6d5-34c7d67e280a-duplicate-2}} 

---