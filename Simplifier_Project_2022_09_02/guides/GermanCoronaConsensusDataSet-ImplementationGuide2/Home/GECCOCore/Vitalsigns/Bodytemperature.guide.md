#### Body temperature

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Body temperature |  | 

---

This profile of a FHIR Observation is derived from the [Body temperature-profile](http://hl7.org/fhir/R4/observation-bodytemp.html) of the FHIR R4 core specification.

In addition to LOINC, *Observation.code* contains an exemplary SNOMED-CT coding.

*Observation.valueQuantity* has a fixed UCUM-unit of *Cel*.

---

**Profile - Body temperature**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/body-temperature

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-BodyTemperature.json, snapshot}}

---

**Examples**

**Body Temperature**
<br>
Example observation body temperature

{{json:de.gecco@1.0.5/package/examples/Example-observation-body-temperature.json}} 

---

**Body Temperature Urinary Bladder**
<br>
Note the additional LOINC coding on Observation.code

{{json:de.gecco@1.0.5/package/examples/Observation-body-temperature-urinary-bladder.json}}

---