#### Contact with persons suffering from Covid-19?

---

Parameter Case Report Form and Response Options 

| Contact with persons suffering from Covid-19 | Yes | No | Unknown |
|-
| Did the patient knowingly have contact with a person with probable or proven Covid-19 disease within 14 days before the onset of his/her symptoms? | &#9744; | &#9744; | &#9744; |  

---

This profile of a FHIR Observation is closely aligned to the [Known Exposure-profile](https://covid-19-ig.logicahealth.org/StructureDefinition-known-exposure.html) of the Logica Implementation Guide for Covid-19. 

---

**Profile - Known Exposure**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/known-exposure

**Snapshot**

{{tree:ForschungsnetzCovid-19/KnownExposure, snapshot}}

---

**ValueSets**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/known-exposure

{{render:ForschungsnetzCovid-19/known-exposure-sars-cov-2}}

---

**Examples**

**Known Exposure Present**
<br>
Example observation where a patient was knowingly exposed to SARS-CoV-2

{{json:3d42736a-9e47-491e-8d06-d884e90060c7}} 

---

**Known Exposure Absent**
<br>
Example observation where a patient was not knowingly exposed to SARS-CoV-2

{{json:b69cf35d-6d43-4881-9189-d5ea00dcf573}} 

---

**Exposure Unknown**
<br>
Example observation where a patient's exposure to SARS-CoV-2 is unknown

{{json:eb602464-bf4a-47ed-8558-0507474d24d1}}

---