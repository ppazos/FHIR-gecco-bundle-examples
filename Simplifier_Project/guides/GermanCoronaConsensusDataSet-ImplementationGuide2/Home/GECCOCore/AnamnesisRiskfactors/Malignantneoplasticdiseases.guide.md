#### Malignant neoplastic diseases

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient suffer from at least one active tumor or cancer disease? | Active / Remission / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 
**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.
`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

In addition to the usual approach when capturing presence, absence and uncertainty, the remission of malignant neoplastic diseases is recorded by setting *Condition.clinicalStatus* to `remission`. Also check out the extra example below.

---

**Profile - Malignant neoplastic diseases**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/malignant-neoplastic-disease

**Snapshot**

{{tree:ForschungsnetzCovid-19/MalignantNeoplasticDisease, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/malignant-neoplastic-diseases

{{render:ForschungsnetzCovid-19/malignant-neoplastic-diseases}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/malignant-neoplastic-diseases-icd

{{render:ForschungsnetzCovid-19/malignant-neoplastic-diseases-icd}}

---

**Examples**

**Malignant neoplastic disease active**
<br>
Example condition that is confirmed present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-44}} 

---

**Malignant neoplastic disease in remission**
<br>
Example condition that is confirmed absent

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-45}} 

---

**Malignant neoplastic disease absent**
<br>
Example condition that is confirmed absent

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-43}} 

---

**Malignant neoplastic disease unknown**
<br>
Example condition where the presence is unknown

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-46}} 

---