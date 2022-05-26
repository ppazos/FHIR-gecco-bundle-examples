#### Contact with persons suffering from Covid-19?

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Did the patient knowingly have contact with a person with probable or proven Covid-19 disease within 14 days before the onset of his/her symptoms? | Yes / No / Unknown | 

---

This profile of a FHIR Observation is closely aligned to the [Known Exposure-profile](https://covid-19-ig.logicahealth.org/StructureDefinition-known-exposure.html) of the Logica Implementation Guide for Covid-19. 

---

**Profile - Known Exposure**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/known-exposure

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-KnownExposure.json, snapshot}} 

---

**ValueSets**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/known-exposure

{{render:de.gecco@1.0.5/package/ValueSet-known-exposure.json}} 

---

**Examples**

**Known Exposure Present**
<br>
Example observation where a patient was knowingly exposed to SARS-CoV-2

{{json:de.gecco@1.0.5/package/examples/Example-observation-known-exposure-covid-19.json}} 

---

**Known Exposure Absent**
<br>
Example observation where a patient was not knowingly exposed to SARS-CoV-2

{{json:de.gecco@1.0.5/package/examples/Example-observation-known-exposure-no.json}} 

---

**Exposure Unknown**
<br>
Example observation where a patient's exposure to SARS-CoV-2 is unknown

{{json:de.gecco@1.0.5/package/examples/Example-observation-known-exposure-unknown.json}}

---