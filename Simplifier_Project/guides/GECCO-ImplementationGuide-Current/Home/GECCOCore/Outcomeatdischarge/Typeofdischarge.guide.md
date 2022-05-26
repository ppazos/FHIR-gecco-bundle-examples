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

{{tree:ForschungsnetzCovid-19/DischargeDisposition, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/discharge-disposition

{{render:ForschungsnetzCovid-19/discharge-disposition}}

---

**Examples**

**Patient discharged alive**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-21}} 

---

**Patient admitted to hospital**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-20}} 

---

**Patient refered to other institution**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-22}} 

---

**Patient discharged dead**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-19}} 

---

**Patient discharged to palliative care**
<br>

{{json:f5e75865-0907-4842-bfa5-5d0cec8b2769}}

---

**Discharge type unknown**
<br>

{{json:ForschungsnetzCovid-19/Observation-example-duplicate-24}} 

---