#### Pregnancy

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Pregnancy | Yes / No / Unknown | 

---

This profile of a FHIR Observation is based on the [Pregnancy status-profile](http://hl7.org/fhir/uv/ips/STU1/StructureDefinition-Observation-pregnancy-status-uv-ips.html) of the International Patient Summary (IPS).

---

**Profile - Pregnancy Status**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pregnancy-status

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-PregnancyStatus.json, snapshot}} 

---

**ValueSets**

The valueset is provided with LOINC and SNOMED-CT codes. The IPS uses LOINC answer codes and should be prefered. SNOMED-CT codes can be used in addition.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/pregnancy-status

{{render:de.gecco@1.0.5/package/ValueSet-pregnancy-status.json}} 

---

**Examples**

**Pregnancy Status Pregnant**
<br>
Example observation

{{json:de.gecco@1.0.5/package/examples/Pregnancy-status-pregnant.json}}

---

**Pregnancy Status Not Pregnant**
<br>
Example observation

{{json:de.gecco@1.0.5/package/examples/Pregnancy-status-not-pregnant.json}}

---

**Pregnancy Status Unknown**
<br>
Example observation

{{json:de.gecco@1.0.5/package/examples/Pregnancy-status-unknown.json}}

---