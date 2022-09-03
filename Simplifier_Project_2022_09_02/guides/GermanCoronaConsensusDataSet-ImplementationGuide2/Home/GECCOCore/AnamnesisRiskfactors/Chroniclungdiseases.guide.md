#### Chronic lung diseases

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient suffer from a chronic lung disease? | Asthma / COPD / Fibrosis of lung / Pulmonary hypertension / Extreme obesity with alveolar hypoventilation / Sleep apnea / Obstructive sleep apnea syndrome / Cystic fibrosis / Other / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 

**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.

`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

---

**Profile - Chronic Lung Diseases**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/chronic-lung-diseases

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Condition-ChronicLungDiseases.json, snapshot}} 

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:de.gecco@1.0.5/package/Extension-UncertaintyOfPresence.json, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-lung-diseases

{{render:de.gecco@1.0.5/package/ValueSet-chronic-lung-diseases.json}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-lung-diseases-icd

{{render:de.gecco@1.0.5/package/ValueSet-chronic-lung-diseases-icd.json}}

---

**Examples**

**Chronic lung disease present**
<br>
Example condition that is confirmed present 

{{json:de.gecco@1.0.5/package/examples/Condition-chronic-lung-disease-present.json}}  

---

**Chronic lung disease absent**
<br>
Example condition that is confirmed absent

{{json:de.gecco@1.0.5/package/examples/Condition-asthma-absent.json}}

---

**Chronic lung disease unknown**
<br>
Example condition where the presence is unknown

{{json:de.gecco@1.0.5/package/examples/Condition-chronic-obstructive-lung-disease-unknown.json}}

---