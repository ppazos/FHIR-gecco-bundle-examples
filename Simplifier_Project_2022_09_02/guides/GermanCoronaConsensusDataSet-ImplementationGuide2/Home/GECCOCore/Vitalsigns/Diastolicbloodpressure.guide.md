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

{{tree:de.gecco@1.0.5/package/Profile-Observation-BloodPressure.json, snapshot}}

---

**Examples**

**Blood Pressure**

{{json:de.gecco@1.0.5/package/examples/Example-observation-blood-pressure.json}} 

---

**Blood Pressure Invasive**
<br>
Note the additional codings on Observation.component.code
{{json:de.gecco@1.0.5/package/examples/Observation-blood-pressure-invasive.json}}  

---