#### Ventilation type

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Type of ventilation | Nasal High-Flow-Oxygen-Therapy / Non-invasive ventilation / Invasive ventilation (orotracheal) / Invasive ventilation (Tracheotomy) / No / n.a. | 

---

This profile of a FHIR Procedure is derived from the [Procedure-profile](https://simplifier.net/medizininformatikinitiative-modulprozeduren/prozedur-duplicate-2) of the Medical Informatics Initiative (MII). 

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

{{tree:ForschungsnetzCovid-19/RespiratoryTherapies-procedure, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies

{{render:ForschungsnetzCovid-19/respiratory-therapies}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/respiratory-therapies-devices

{{render:ForschungsnetzCovid-19/respiratory-therapies-devices}}

---

**Examples**

**Nasal High-Flow-Oxygen-Therapy**
<br>
Patient is receiving nasal high-flow oxygen-therapy 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-25}} 

---

**Non-invasive ventilation**
<br>
Patient is not receiving non-invasive ventilation

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-26}} 

---

**Invasive ventilation (orotracheal)**
<br>
Patient is receiving orotracheal ventilation

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-23}} 

---

**Invasive ventilation (Tracheotomy)**
<br>
Patient is ventilated via tracheotomy

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-24}} 

---

**No**
<br>
Patient is not receiving ventilation

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-21}} 

---

**Unknown**
<br>
Unknown if patient is receiving ventilation 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-22}} 

---