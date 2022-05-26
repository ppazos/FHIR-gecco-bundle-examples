#### Respiratory therapies

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Did oxygen or respiratory therapy already exist before the current illness? | Yes / No / Unknown | 

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

**Profile - Respiratory Therapies**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/respiratory-therapies

**Snapshot**

{{tree:ForschungsnetzCovid-19/RespiratoryTherapies-procedure, snapshot}}

---

**ValueSets**

The respiratory therapies Valueset is provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies

{{render:ForschungsnetzCovid-19/respiratory-therapies}}

---

**Examples**

**Patient receiving respiratory therapy since 12/12/2020**
<br>

{{json:ForschungsnetzCovid-19/9fec44ce-5f2b-4814-8a71-6354e69a26b2}} 

---

**Patient not receiving respiratory therapy**
<br>

{{json:ForschungsnetzCovid-19/0ecfbae7-743f-4c35-aa4e-428890deb9df}} 

---

**Unknown if patient receives respiratory therapy**
<br>

{{json:ForschungsnetzCovid-19/b04e07b7-464f-4f13-a6a2-5f3304156c5c}} 

---