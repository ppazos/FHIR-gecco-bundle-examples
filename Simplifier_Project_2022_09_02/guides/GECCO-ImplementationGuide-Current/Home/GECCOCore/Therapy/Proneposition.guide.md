#### Prone position

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Prone position | Yes / No / Unknown | 

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

**Profile - Prone Position**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/prone-position

**Snapshot**

{{tree:ForschungsnetzCovid-19/PronePosition-procedure, snapshot}}

---

**Examples**

**Prone position Yes**
<br>
Patient is receiving prone position treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-14}} 

---

**Prone position No**
<br>
Patient is not receiving prone position treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-15}} 

---

**Prone position Unknown**
<br>
Unknown if patient is receiving prone position treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-16}} 

---