#### Dialysis / Hemofiltration

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Dialysis / Hemofiltration | Yes / No / Unknown | 

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

**Profile - Dialysis**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/dialysis

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Procedure-Dialysis.json, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT and OPS codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/dialysis-procedures

{{render:de.gecco@1.0.5/package/ValueSet-dialysis-procedures.json}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/dialysis-procedures-ops

{{render:de.gecco@1.0.5/package/ValueSet-dialysis-procedures-ops.json}}

---

**Examples**

**Dialysis Yes**
<br>
Patient is receiving dialysis treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-dialysis-procedure-.json}} 

---

**Dialysis No**
<br>
Patient is not receiving dialysis treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-dialysis-procedure-not-done.json}} 

---

**Dialysis Unknown**
<br>
Unknown if patient is receiving dialysis treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-dialysis-procedure-unknown.json}}

---