#### ECMO therapy

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| ECMO therapy | Yes / No / Unknown | 

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

Use the SNOMED CT concept *233573008 |Extracorporeal membrane oxygenation (procedure)|* for *Procedure.code.coding:sct*.

Any OPS code from chapter *8-852 Extrakorporaler Gasaustausch ohne und mit Herzunterstützung und Prä-ECMO-Therapie* is applicable for *Procedure.code.coding:ops*.

---

**Profile - Extracorporeal membrane oxygenation**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/extracorporeal-membrane-oxygenation

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Procedure-Extracorporeal-membrane-oxygenation.json, snapshot}}

---

**ValueSets**

Valuesets are provided with OPS codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/extracorporeal-membrane-oxygenation

{{render:de.gecco@1.0.5/package/ValueSet-extracorporeal-membrane-oxygenation-ops.json}}

---

**Examples**

**ECMO Yes**
<br>
Patient is receiving ECMO treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-extracorporeal-membrane-oxygenation-in-progress.json}} 

---

**ECMO No**
<br>
Patient is not receiving ECMO treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-extracorporeal-membrane-oxygenation-not-done.json}} 

---

**ECMO Unknown**
<br>
Unknown if patient is receiving ECMO treatment 

{{json:de.gecco@1.0.5/package/examples/Procedure-extracorporeal-membrane-oxygenation-unknown.json}}

---
