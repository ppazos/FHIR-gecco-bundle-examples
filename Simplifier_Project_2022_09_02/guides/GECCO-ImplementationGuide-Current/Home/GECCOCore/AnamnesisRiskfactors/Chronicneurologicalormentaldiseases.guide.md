#### Chronic neurological or mental diseases

---

Parameter Case Report Form and Response Options 

| Does the patient suffer from a chronic neurological disease or psychiatric illness? | Yes | No | Unknown |
|-
| Parkinson's disease | &#9744; | &#9744; | &#9744; | 
| Dementia | &#9744; | &#9744; | &#9744; | 
| Multiple sclerosis | &#9744; | &#9744; | &#9744; | 
| Combined disorder of muscle and peripheral nerve | &#9744; | &#9744; | &#9744; | 
| Epilepsy | &#9744; | &#9744; | &#9744; | 
| Migraine | &#9744; | &#9744; | &#9744; | 
| History of a cerebrovascular accident with residual deficit | &#9744; | &#9744; | &#9744; | 
| History of a cerebrovascular accident without residual deficits | &#9744; | &#9744; | &#9744; | 
| Psychotic disorder | &#9744; | &#9744; | &#9744; | 
| Depressive disorder | &#9744; | &#9744; | &#9744; | 
| Anxiety disorder | &#9744; | &#9744; | &#9744; |  

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

**Profile - Chronic Neurological or Mental Diseases**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/chronic-neurological-mental-diseases

**Snapshot**

{{tree:ForschungsnetzCovid-19/ChronicNeurologicalMentalDiseases, snapshot}}

---

**Extension - Uncertainty of Presence**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence

**Snapshot**

{{tree:ForschungsnetzCovid-19/UncertaintyOfPresence, snapshot}}

---

**ValueSets**

Valuesets are provided with both SNOMED-CT and ICD-10-GM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-neurological-mental-diseases

{{render:ForschungsnetzCovid-19/chronic-neurological-mental-diseases}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/chronic-neurological-mental-diseases-icd

{{render:ForschungsnetzCovid-19/chronic-neurological-mental-diseases-icd}}

---

**Examples**

**Chronic Neurological or Mental Disease present**
<br>
Example condition that is confirmed present 

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-47}} 

---

**Chronic Neurological or Mental Disease absent**
<br>
Example condition that is confirmed absent

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-9}} 

---

**Chronic Neurological or Mental Disease unknown**
<br>
Example condition where the presence is unknown

{{json:ForschungsnetzCovid-19/Condition-example-duplicate-51}} 

---