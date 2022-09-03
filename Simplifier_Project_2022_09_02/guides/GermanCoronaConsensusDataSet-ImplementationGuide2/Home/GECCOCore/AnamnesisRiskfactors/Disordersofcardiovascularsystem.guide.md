#### Disorders of cardiovascular system

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient suffer from a cardiovascular disease? | High blood pressure / History of myocardial infarction / Cardiac arrhythmia / Heart failure / Peripheral arterial occlusive disease / History of heart revascularization / Coronary arteriosclerosis / Carotid artery stenosis / Other / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.diagnose/2.0.0-alpha3/files/402364) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 

**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.

`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

---

**Profile - Cardiovascular Diseases**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/cardiovascular-diseases

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/cardiovascular-diseases, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/cardiovascular-diseases

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/cardiovascular-diseases}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/cardiovascular-diseases-icd

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/cardiovascular-diseases-icd}}

---

**Examples**

**Cardiovascular Disease present**
<br>
Example condition that is confirmed present 

{{json:de.gecco@1.0.5/package/examples/Condition-cardiovascular-disease-present.json}} 

---

**Cardiovascular Disease absent**
<br>
Example condition that is confirmed absent

{{json:de.gecco@1.0.5/package/examples/Condition-cardiac-arrhythmia-absent.json}} 

---

**Cardiovascular Disease unknown**
<br>
Example condition where the presence is unknown

{{json:de.gecco@1.0.5/package/examples/Condition-coronary-arteriosclerosis-unknown.json}}  

---