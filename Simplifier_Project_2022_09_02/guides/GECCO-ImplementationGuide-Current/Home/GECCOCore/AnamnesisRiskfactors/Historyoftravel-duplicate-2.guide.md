#### History of travel

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| History of travel | Destination of travel | 

---

This profile of a FHIR Observation is closely aligned to the [Travel History-profile](https://covid-19-ig.logicahealth.org/StructureDefinition-travel-history.html) of the Logica Implementation Guide for Covid-19. 

For each travel activity of a patient, a separate instance of this Observation needs to be created.

---

**Profile - History of Travel**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/history-of-travel

**Snapshot**

{{tree:ForschungsnetzCovid-19/HistoryOfTravel, snapshot}}

---

**ValueSets**

{{render:http://hl7.org/fhir/ValueSet/iso3166-1-2}}

---

{{render:basisprofilde/bundeslaender}}

---

**Examples**

**History of Travel**
<br>
Example observation with start and end date and travel destination 

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-67}} 

---

**No History of Travel**
<br>
Example observation where no travel history is present 

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-66}} 

---

**Unknown History of Travel**
<br>
Example observation where travel history is unknown 

{{json:813f6951-d737-4e43-a078-40adfe468892}}

---
