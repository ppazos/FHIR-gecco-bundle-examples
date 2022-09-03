#### Human immunodeficiency virus infection

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Is the patient infected with HIV? | Yes / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.diagnose/2.0.0-alpha3/files/402364) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 

**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.

`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

---

**Profile - Human Immunodeficiency Virus Infection**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/human-immunodeficiency-virus-infection

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/human-immunodeficiency-virus-infection, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence, snapshot}}

---

**ValueSets**

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/human-immunodeficiency-virus-infections

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/human-immunodeficiency-virus-infections}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/human-immunodeficiency-virus-infections-icd

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/human-immunodeficiency-virus-infections-icd}}

---

**Examples**

**Human Immunodeficiency Virus Infection present**
<br>
Example condition where HIV infection is present 

{{json:de.gecco@1.0.5/package/examples/Condition-human-immunodeficiency-virus-infection-present.json}} 

---

**Human Immunodeficiency Virus Infection absent**
<br>
Example condition where HIV infection is absent 

{{json:de.gecco@1.0.5/package/examples/Condition-human-immunodeficiency-virus-infection-absent.json}} 

---

**Human Immunodeficiency Virus Infection unknown**
<br>
Example condition where HIV infection is unknown 

{{json:de.gecco@1.0.5/package/examples/Condition-human-immunodeficiency-virus-infection-unknown.json}}  

---
