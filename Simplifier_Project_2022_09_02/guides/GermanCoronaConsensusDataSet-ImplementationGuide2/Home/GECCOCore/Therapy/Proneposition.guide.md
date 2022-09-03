#### Prone position

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Prone position | Yes / No / Unknown | 

---

This profile of a FHIR Procedure is derived from the [Procedure-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.prozedur/2.0.0-alpha3/files/404852) of the Medical Informatics Initiative (MII). 

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

{{tree:de.gecco@1.0.5/package/Profile-Procedure-PronePosition.json, snapshot}}

---

**Examples**

**Prone position Yes**
<br>
Patient is receiving prone position treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-placing-subject-in-prone-position-in-progress.json}} 

---

**Prone position No**
<br>
Patient is not receiving prone position treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-placing-subject-in-prone-position-not-done.json}} 

---

**Prone position Unknown**
<br>
Unknown if patient is receiving prone position treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-placing-subject-in-prone-position-unknown.json}}

---