#### Respiratory rate

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Respiratory rate |  | 

---

This profile of a FHIR Observation is derived from the [Respiratory rate-profile](http://hl7.org/fhir/R4/observation-resprate.html) of the FHIR R4 core specification.

In addition to LOINC, *Observation.code* contains an exemplary SNOMED-CT coding.

*Observation.valueQuantity* has a fixed UCUM-unit of */min*.

---

**Profile - Respiratory Rate**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/respiratory-rate

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-RespiratoryRate.json, snapshot}}

---

**Examples**

**Respiratory Rate**

{{json:de.gecco@1.0.5/package/examples/Example-observation-respiratory-rate.json}} 

---

**Respiratory Rate on Ventilator**
<br>
Note the additional LOINC coding on Observation.code

{{json:de.gecco@1.0.5/package/examples/Observation-respiratory-rate-on-ventilator.json}}

---