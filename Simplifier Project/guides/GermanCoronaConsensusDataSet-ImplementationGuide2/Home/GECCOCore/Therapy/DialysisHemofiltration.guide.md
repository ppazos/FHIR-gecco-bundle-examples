#### Dialysis / Hemofiltration

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Dialysis / Hemofiltration | Yes / No / Unknown | 

---

This profile of a FHIR Procedure is derived from the [Procedure-profile](https://simplifier.net/medizininformatikinitiative-modulprozeduren/prozedur-duplicate-2) of the Medical Informatics Initiative (MII). 

The response options can be controlled via the *status*-Element of the Procedure resource:

| Response option | Procedure.status |
|--------------|-----------|
| Yes | `in-progress` | 
| No | `not-done` | 
| Unknown | `unknown` | 

Notice however that this should not discourage systems, that implement the entire workflow execution states, to exchange resources which may contain information deemed relevant for this use case. This can especially include procedures where the status is *completed*.

---

**Profile - Dialysis**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/dialysis

**Snapshot**

{{tree:ForschungsnetzCovid-19/Dialysis, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT and OPS codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/dialysis-procedures

{{render:ForschungsnetzCovid-19/dialysis-procedures}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/dialysis-procedures-ops

{{render:ForschungsnetzCovid-19/dialysis-procedures-ops}}

---

**Examples**

**Dialysis Yes**
<br>
Patient is receiving dialysis treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-5}} 

---

**Dialysis No**
<br>
Patient is not receiving dialysis treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-6}} 

---

**Dialysis Unknown**
<br>
Unknown if patient is receiving dialysis treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-7}} 

---