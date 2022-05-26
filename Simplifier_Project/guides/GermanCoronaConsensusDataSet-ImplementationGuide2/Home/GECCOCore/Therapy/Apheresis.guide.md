#### Apheresis

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Apheresis | Yes / No / Unknown | 

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

**Profile - Apheresis**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/apheresis

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Procedure-Apheresis.json, snapshot}} 

---

**ValueSets**

Valuesets are provided with SNOMED-CT and OPS codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/apheresis-procedures

{{render:de.gecco@1.0.5/package/ValueSet-apheresis-procedures.json}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/apheresis-procedures-ops

{{render:de.gecco@1.0.5/package/ValueSet-apheresis-procedures-ops.json}} 

---

**Examples**

**Apheresis Yes**
<br>
Patient is receiving apheresis treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-apheresis-in-progress.json}} 

---

**Apheresis No**
<br>
Patient is not receiving apheresis treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-apheresis-not-done.json}}

---

**Apheresis Unknown**
<br>
Unknown if patient is receiving apheresis treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-apheresis-unknown.json}}

---