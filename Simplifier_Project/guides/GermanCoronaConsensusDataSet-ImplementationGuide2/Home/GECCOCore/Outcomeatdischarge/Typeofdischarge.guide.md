#### Type of discharge

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Type of discharge | Alive / Admission to hospital / Referral to other institution / Death / Palliative discharge / Unknown | 

---

This profile of a FHIR Observation is used to capture the type of discharge of a patient. *Observation.code* shall be fixed to LOINC *55128-3 Discharge disposition*.

The value set binding on *Observation.value[x]* provides the response options as SNOMED codes.

| RESPONSE OPTIONS | Observation.value[x].coding |
|--------------|-----------|
| Alive | `371827001 |Patient discharged alive (finding)|` |
| Admission to hospital | `32485007 |Hospital admission (procedure)|` | 
| Referral to other institution | `3457005 |Patient referral (procedure)|` |
| Death | `419099009 |Dead (finding)|` | 
| Palliative discharge | `306237005 |Referral to palliative care service (procedure)|` |
| Unknown | `261665006 |Unknown (qualifier value)|` | 

---

**Profile - Discharge Disposition**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/discharge-disposition

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-DischargeDisposition.json, snapshot}} 

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/discharge-disposition

{{render:de.gecco@1.0.5/package/ValueSet-discharge-disposition.json}} 

---

**Examples**

**Patient discharged alive**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-discharge-type-patient-discharged-alive-finding.json}} 

---

**Patient admitted to hospital**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-discharge-type-hospital-admission-procedure.json}}

---

**Patient refered to other institution**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-discharge-type-patient-referral-procedure.json}} 

---

**Patient discharged dead**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-discharge-type-dead-finding.json}} 

---

**Patient discharged to palliative care**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-discharge-type-referral-to-palliative-care-service-procedure.json}}

---

**Discharge type unknown**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-discharge-type-unknown-qualifier-value.json}}  

---