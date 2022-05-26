#### Human immunodeficiency virus infection

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Is the patient infected with HIV? | Yes / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 
**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.
`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

---

**Profile - Human Immunodeficiency Virus Infection**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/human-immunodeficiency-virus-infection

**Snapshot**

{{tree:ForschungsnetzCovid-19/HumanImmunodeficiencyVirusInfection, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

---

**ValueSets**

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/human-immunodeficiency-virus-infections

{{render:ForschungsnetzCovid-19/human-immunodeficiency-virus-infections}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/human-immunodeficiency-virus-infections-icd

{{render:ForschungsnetzCovid-19/human-immunodeficiency-virus-infections-icd}}

---

**Examples**

**Human Immunodeficiency Virus Infection present**
<br>
Example condition where HIV infection is present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-38}} 

---

**Human Immunodeficiency Virus Infection absent**
<br>
Example condition where HIV infection is absent 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-37}} 

---

**Human Immunodeficiency Virus Infection unknown**
<br>
Example condition where HIV infection is unknown 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-39}} 

---
