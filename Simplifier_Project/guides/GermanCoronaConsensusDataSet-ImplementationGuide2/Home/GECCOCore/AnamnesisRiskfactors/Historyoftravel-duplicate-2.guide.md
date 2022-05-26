#### History of travel

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| History of travel | Destination of travel | 

---

This profile of a FHIR Observation is closely aligned to the [Travel History-profile](https://covid-19-ig.logicahealth.org/StructureDefinition-travel-history.html) of the Logica Implementation Guide for Covid-19. 

---

**Profile - History of Travel**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/history-of-travel

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-HistoryOfTravel.json, snapshot}} 

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

{{json:de.gecco@1.0.5/package/examples/Example-observation-history-of-travel.json}} 

---

**No History of Travel**
<br>
Example observation where no travel history is present 

{{json:de.gecco@1.0.5/package/examples/Observation-travel-history-example.json}} 

---

**Unknown History of Travel**
<br>
Example observation where travel history is unknown 

{{json:de.gecco@1.0.5/package/examples/Observation-travel-history-unknown.json}}

---
