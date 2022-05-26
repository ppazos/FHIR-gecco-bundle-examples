#### History of being a tissue or organ recipient

---

Parameter Case Report Form and Response Options 

| Does the patient have a history of being an organ transplant recipient? | Yes | No | Unknown |
|-
| Heart | &#9744; | &#9744; | &#9744; | 
| Lung | &#9744; | &#9744; | &#9744; | 
| Liver | &#9744; | &#9744; | &#9744; | 
| Kidneys | &#9744; | &#9744; | &#9744; | 
| Intestine | &#9744; | &#9744; | &#9744; | 
| Skin | &#9744; | &#9744; | &#9744; | 
| Cornea | &#9744; | &#9744; | &#9744; | 
| Ossicle | &#9744; | &#9744; | &#9744; | 
| Heartvalve | &#9744; | &#9744; | &#9744; | 
| Blood vessel | &#9744; | &#9744; | &#9744; | 
| Cerebral meninges | &#9744; | &#9744; | &#9744; | 
| Bone tissue | &#9744; | &#9744; | &#9744; | 
| Cartilage tissue | &#9744; | &#9744; | &#9744; | 
| Tendon | &#9744; | &#9744; | &#9744; |  

This is an example of how the case report form could look like when such a data collection tool is used.

---

To integrate data from clinical care and research such as clinical trials, the guide relies on FHIR resources for data-exchange from the clinical and diagnostic healthcare process rather than constructing a plain questionnaire.

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. For the explicitly listed diseases in the case report form, the SNOMED and ICD codes are also explicitly specified in the ValueSets below. Note that for the 'Other' option the ValueSets contain filters that allow a number of other codes for this category that are included in the expansion.

A separate instance of a Condition resource is created for each of the requested diseases.

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.modifierExtension*. This is used to map the Yes/No/Unknown scheme from case report forms to the Condition resource. Note the additional constraint on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 

@```
from StructureDefinition 
where url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/gecco-base-condition'
for differential.element[0].constraint select
    key,
    severity,
    human,
    expression
```

---

**Profile - History of being a Tissue or Organ Recipient**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/organ-recipient

**Snapshot**

{{tree:ForschungsnetzCovid-19/OrganRecipient, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

---

**ValueSets**

Use the SNOMED-CT code *161663000 |History of being a tissue or organ recipient (situation)|* on the Condition.code element.

If a history of being a tissue or organ recipient is present, the SNOMED-CT valueset shall be used on the *Condition.bodySite* element to encode the organ that was transplanted.

Note that the codes from the ICD value set are used for *Condition.code* and contain the information about the transplanted organ. In that case, *Condition.bodySite* must match the ICD code or may not be used because of redundancy.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/organs-for-transplant

{{render:ForschungsnetzCovid-19/organsForTransplant}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/history-of-organ-transplantation-icd

{{render:ForschungsnetzCovid-19/history-of-organ-transplantation-icd}}

---

**Examples**

**History of being a Tissue or Organ Recipient present**
<br>
Example condition where history of transplantation is present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-31}} 

---

**History of being a Tissue or Organ Recipient absent**
<br>
Example condition where history of transplantation is absent 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-30}} 

---

**History of being a Tissue or Organ Recipient unknown**
<br>
Example condition where history of transplantation is unknown 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-32}} 

---