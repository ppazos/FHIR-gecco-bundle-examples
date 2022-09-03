#### Human immunodeficiency virus infection

---

Parameter Case Report Form and Response Options

| Is the patient infected with HIV? | Yes | No | Unknown |
|-
| Human immunodeficiency virus infection | &#9744; | &#9744; | &#9744; | 

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
