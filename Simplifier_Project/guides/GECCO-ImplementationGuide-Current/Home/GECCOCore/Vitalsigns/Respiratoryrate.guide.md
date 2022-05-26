#### Respiratory rate

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Respiratory rate |  | 

---

This profile of a FHIR Observation is derived from the [Respiratory rate-profile](http://hl7.org/fhir/observation-resprate.html) of the FHIR R4 core specification.

In addition to LOINC, *Observation.code* contains an exemplary SNOMED-CT coding.

*Observation.valueQuantity* has a fixed UCUM-unit of */min*.

---

**Profile - Respiratory Rate**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/respiratory-rate

**Snapshot**

{{tree:ForschungsnetzCovid-19/RespiratoryRate, snapshot}}

---

**Examples**

**Respiratory Rate**

{{json:a0897b04-2e57-43a7-9372-3c1f6a2fef1c}} 

---

**Respiratory Rate on Ventilator**
<br>
Note the additional LOINC coding on Observation.code

{{json:ForschungsnetzCovid-19/a0897b04-2e57-43a7-9372-3c1f6a2fef1c-duplicate-2}} 

---