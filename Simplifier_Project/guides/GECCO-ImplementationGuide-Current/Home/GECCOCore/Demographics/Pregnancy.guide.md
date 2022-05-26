#### Pregnancy

---

Parameter Case Report Form and Response Options 

| Is the patient currently pregnant? | Yes | No | Unknown |
|-
| Pregnancy | &#9744; | &#9744; | &#9744; |  

---

This profile of a FHIR Observation is based on the [Pregnancy status-profile](http://hl7.org/fhir/uv/ips/StructureDefinition/Observation-pregnancy-status-uv-ips) of the International Patient Summary (IPS).

---

**Profile - Pregnancy Status**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pregnancy-status

**Snapshot**

{{tree:ForschungsnetzCovid-19/PregnancyStatus, snapshot}}

---

**ValueSets**

The valueset is provided with LOINC and SNOMED-CT codes. The IPS uses LOINC answer codes and should be prefered. SNOMED-CT codes can be used in addition.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pregnancy-status

{{render:ForschungsnetzCovid-19/pregnancy-status}}

---

**Examples**

**Pregnancy Status Pregnant**
<br>
Example observation

{{json:14616b17-7235-4024-a9a1-562a39bf7b0d}}

---

**Pregnancy Status Not Pregnant**
<br>
Example observation

{{json:aa5ae7bb-2c60-4a19-a588-933ca9aa18fc}}

---

**Pregnancy Status Unknown**
<br>
Example observation

{{json:cd0e97e5-7d33-4471-bcd5-154fa1284fff}}

---