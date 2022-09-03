#### Respiratory therapies

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Did oxygen or respiratory therapy already exist before the current illness? | Yes / No / Unknown | 

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

**Profile - Respiratory Therapies**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/respiratory-therapies

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/respiratory-therapies, snapshot}}

---

**ValueSets**

The respiratory therapies Valueset is provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies}}

---

**Examples**

**Patient receiving respiratory therapy since 12/12/2020**
<br>

{{json:de.gecco@1.0.5/package/examples/Example-procedure-respiratory-therapy.json}} 

---

**Patient not receiving respiratory therapy**
<br>

{{json:de.gecco@1.0.5/package/examples/Example-procedure-respiratory-therapy-not-done.json}} 

---

**Unknown if patient receives respiratory therapy**
<br>

{{json:de.gecco@1.0.5/package/examples/Example-procedure-respiratory-therapy-unknown.json}}  

---