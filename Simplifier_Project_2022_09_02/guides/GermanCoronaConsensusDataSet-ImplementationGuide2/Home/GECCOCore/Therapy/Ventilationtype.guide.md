#### Ventilation type

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Type of ventilation | Nasal High-Flow-Oxygen-Therapy / Non-invasive ventilation / Invasive ventilation (orotracheal) / Invasive ventilation (Tracheotomy) / No / n.a. | 

---

This profile of a FHIR Procedure is derived from the [Procedure-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.prozedur/2.0.0-alpha3/files/404852) of the Medical Informatics Initiative (MII). 

| RESPONSE OPTIONS | Procedure.status | Procedure.code | Procedure.usedCode |
|--------------|-----------|-----------|
| Nasal High-Flow-Oxygen-Therapy | `in-progress` | `371907003 |Oxygen administration by nasal cannula (procedure)|` | `426854004 |High flow oxygen nasal cannula (physical object)|` | 
| Non-invasive ventilation | `in-progress` | `428311008 |Noninvasive ventilation (procedure)|` |  | 
| Invasive ventilation (orotracheal) | `in-progress` | `40617009 |Artificial respiration (procedure)|` | `26412008 |Endotracheal tube, device (physical object)|` | 
| Invasive ventilation (Tracheotomy) | `in-progress` | `40617009 |Artificial respiration (procedure)|` | `129121000 |Tracheostomy tube, device (physical object)|` | 
| No | `not-done` | `40617009 |Artificial respiration (procedure)|` |  | 
| Unknown | `unknown` | `40617009 |Artificial respiration (procedure)|` |  | 

---

**Profile - Respiratory Therapies**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/respiratory-therapies

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Procedure-RespiratoryTherapies.json, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies

{{render:de.gecco@1.0.5/package/ValueSet-respiratory-therapies.json}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies-devices

{{render:de.gecco@1.0.5/package/ValueSet-respiratory-therapies-devices.json}}

---

**Examples**

**Nasal High-Flow-Oxygen-Therapy**
<br>
Patient is receiving nasal high-flow oxygen-therapy 

{{json:de.gecco@1.0.5/package/examples/Procedure-nasal-high-flow-oxygen-therapy-in-progress.json}} 

---

**Non-invasive ventilation**
<br>
Patient is not receiving non-invasive ventilation

{{json:de.gecco@1.0.5/package/examples/Example-procedure-respiratory-therapy-not-done.json}} 

---

**Invasive ventilation (orotracheal)**
<br>
Patient is receiving orotracheal ventilation

{{json:de.gecco@1.0.5/package/examples/Procedure-invasive-ventilation-orotracheal-in-progress.json}} 

---

**Invasive ventilation (Tracheotomy)**
<br>
Patient is ventilated via tracheotomy

{{json:de.gecco@1.0.5/package/examples/Procedure-invasive-ventilation-tracheotomy-in-progress.json}} 

---

**No**
<br>
Patient is not receiving ventilation

{{json:de.gecco@1.0.5/package/examples/Example-procedure-respiratory-therapy-not-done.json}} 

---

**Unknown**
<br>
Unknown if patient is receiving ventilation 

{{json:de.gecco@1.0.5/package/examples/Example-procedure-respiratory-therapy-unknown.json}}

---