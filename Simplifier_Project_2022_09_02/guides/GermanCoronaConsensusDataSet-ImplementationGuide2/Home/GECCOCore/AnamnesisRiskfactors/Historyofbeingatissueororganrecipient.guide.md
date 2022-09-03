#### History of being a tissue or organ recipient

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient have a history of being an organ transplant recipient? | Heart / Lung / Liver / Kidneys / Intestine / Skin / Cornea / Ossicle / Heartvalve / Blood vessel / Cerebral meninges / Bone tissue / Cartilage tissue / Tendon / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.diagnose/2.0.0-alpha3/files/402364) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 

**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.

`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

<br>

Take notice of the different code patterns between ICD-10 and SNOMED when capturing information in either of the systems. ICD-10 codes on *Condition.code.coding:icd10-gm* include the type organ transplant in a precoordinated fashion. In comparison, *Condition.code.coding:sct* is set to the unspecific SNOMED code *161663000 |History of being a tissue or organ recipient (situation)|* and the actual organ can be recorded on *Condition.bodySite*.

---

**Profile - History of being a Tissue or Organ Recipient**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/organ-recipient

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/organ-recipient, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence, snapshot}}

---

**ValueSets**

Use the SNOMED-CT code *161663000 |History of being a tissue or organ recipient (situation)|* on the Condition.code element.

If a history of being a tissue or organ recipient is present, the SNOMED-CT valueset shall be used on the *Condition.bodySite* element to encode the organ that was transplanted.

Note that the codes from the ICD value set are used for *Condition.code* and contain the information about the transplanted organ. In that case, *Condition.bodySite* must match the ICD code or may not be used because of redundancy.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/organs-for-transplant

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/organs-for-transplant}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/history-of-organ-transplantation-icd

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/history-of-organ-transplantation-icd}}

---

**Examples**

**History of being a Tissue or Organ Recipient present**
<br>
Example condition where history of transplantation is present 

{{json:de.gecco@1.0.5/package/examples/Condition-history-of-being-a-tissue-or-organ-recipient-present.json}} 

---

**History of being a Tissue or Organ Recipient absent**
<br>
Example condition where history of transplantation is absent 

{{json:de.gecco@1.0.5/package/examples/Condition-history-of-being-a-tissue-or-organ-recipient-absent.json}} 

---

**History of being a Tissue or Organ Recipient unknown**
<br>
Example condition where history of transplantation is unknown 

{{json:de.gecco@1.0.5/package/examples/Condition-history-of-being-a-tissue-or-organ-recipient-unknown.json}}  

---