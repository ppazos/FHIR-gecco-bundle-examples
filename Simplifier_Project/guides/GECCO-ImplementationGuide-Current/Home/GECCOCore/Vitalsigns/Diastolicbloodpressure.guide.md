#### Diastolic blood pressure

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Diastolic blood pressure |  | 

---

This profile of a FHIR Observation is derived from the [Blood pressure-profile](http://hl7.org/fhir/observation-bp.html) of the FHIR R4 core specification.

In addition to LOINC, *Observation.code* contains an exemplary SNOMED-CT coding.

*Observation.value[x]* shall not be used in this observation. Instead, *Observation.component* has two separate components for systolic and diastolic values, each includes a code/value pattern with a LOINC/SNOMED-CT code and a quantity with a fixed UCUM-unit of *mm[Hg]*.

---

**Profile - Blood Pressure**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/blood-pressure

**Snapshot**

{{tree:ForschungsnetzCovid-19/BloodPressure, snapshot}}

---

**Examples**

**Blood Pressure**

{{json:ForschungsnetzCovid-19/Observation-example-blood-pressure}} 

---

**Blood Pressure Invasive**
<br>
Note the additional codings on Observation.component.code
{{json:ForschungsnetzCovid-19/2a1e1c87-64f4-490b-912b-d8726b7b5f13-duplicate-2}} 

---