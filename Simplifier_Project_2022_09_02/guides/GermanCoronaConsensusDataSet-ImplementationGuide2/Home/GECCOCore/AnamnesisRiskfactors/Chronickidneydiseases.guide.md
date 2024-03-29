#### Chronic kidney diseases

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient suffer from chronic kidney disease? | With hemodialysis / Without hemodialysis / No / Unknown / (Severity) | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.diagnose/2.0.0-alpha3/files/402364) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 

**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.

`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()` 

---

**Profile - Chronic Kidney Diseases**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/chronic-kidney-diseases

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/chronic-kidney-diseases, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-kidney-diseases

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-kidney-diseases}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-kidney-diseases-icd

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-kidney-diseases-icd}}

---

**Examples**

**Chronic Kidney Disease present**
<br>
Example condition that is confirmed present 

{{json:de.gecco@1.0.5/package/examples/Condition-chronic-kidney-disease-present.json}} 

---

**Chronic Kidney Disease with Hemodialysis present**
<br>
Example condition that is confirmed present 

{{json:de.gecco@1.0.5/package/examples/Condition-chronic-kidney-disease-stage-5-on-dialysis-present.json}} 

---

**Chronic Kidney Disease absent**
<br>
Example condition that is confirmed absent

{{json:de.gecco@1.0.5/package/examples/Condition-chronic-kidney-disease-absent.json}} 

---

**Chronic Kidney Disease unknown**
<br>
Example condition where the presence is unknown

{{json:de.gecco@1.0.5/package/examples/Condition-chronic-kidney-disease-unknown.json}}  

---