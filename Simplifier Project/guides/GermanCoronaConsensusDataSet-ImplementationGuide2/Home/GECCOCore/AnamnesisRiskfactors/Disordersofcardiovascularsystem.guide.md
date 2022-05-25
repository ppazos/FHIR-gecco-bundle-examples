#### Disorders of cardiovascular system

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient suffer from a cardiovascular disease? | High blood pressure / History of myocardial infarction / Cardiac arrhythmia / Heart failure / Peripheral arterial occlusive disease / History of heart revascularization / Coronary arteriosclerosis / Carotid artery stenosis / Other / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 
**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.
`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

---

**Profile - Cardiovascular Diseases**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/cardiovascular-diseases

**Snapshot**

{{tree:ForschungsnetzCovid-19/CardiovascularDiseases, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/cardiovascular-diseases

{{render:ForschungsnetzCovid-19/cardiovascular-diseases}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/cardiovascular-diseases-icd

{{render:ForschungsnetzCovid-19/cardiovascular-diseases-icd}}

---

**Examples**

**Cardiovascular Disease present**
<br>
Example condition that is confirmed present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-5}} 

---

**Cardiovascular Disease absent**
<br>
Example condition that is confirmed absent

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-4}} 

---

**Cardiovascular Disease unknown**
<br>
Example condition where the presence is unknown

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-6}} 

---