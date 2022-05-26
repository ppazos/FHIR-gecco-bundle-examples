#### Diabetes mellitus

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient suffer from diabetes? | Diabetes mellitus type 1 / Diabetes mellitus type 2 / Insulin treated type 2 diabetes mellitus / Secondary diabetes mellitus / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 
**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.
`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

---

**Profile - Diabetes Mellitus**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/diabetes-mellitus

**Snapshot**

{{tree:ForschungsnetzCovid-19/DiabetesMellitus, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/diabetes-mellitus-diseases

{{render:ForschungsnetzCovid-19/diabetes-mellitus-diseases}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/diabetes-mellitus-diseases-icd

{{render:ForschungsnetzCovid-19/diabetes-mellitus-diseases-icd}}

---

**Examples**

**Diabetes mellitus present**
<br>
Example condition that is confirmed present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-19}} 

---

**Diabetes mellitus type 1 absent**
<br>
Example condition that is confirmed absent

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-20}} 

---

**Diabetes mellitus type 2 present**
<br>
Example condition that is confirmed present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-21}} 

---

**Insulin treated type 2 diabetes mellitus absent**
<br>
Example condition that is confirmed absent

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-42}} 

---

**Secondary diabetes mellitus unknown**
<br>
Example condition where the presence is unknown

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-57}} 

---