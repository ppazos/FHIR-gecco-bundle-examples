#### Chronic neurological or mental diseases

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Does the patient suffer from at least one chronic neurological disease or psychiatric illness? Which one? | Parkinson's disease / Dementia / Multiple sclerosis / Combined disorder of muscle and peripheral nerve / Epilepsy / Migraine / History of a cerebrovascular accident with residual deficit / History of a cerebrovascular accident without residual deficits / Psychotic disorder / Depressive disorder / Anxiety disorder / No / Unknown | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. 

To represent the presence, absence or uncertainty of findings, use *Condition.verificationStatus* or *uncertaintyOfPresence* on *Condition.extension*. Note the additional constrain on *Condition* that checks if either *verificationStatus* or the *extension* is present:
<br> 
**unk-1**:If verificationStatus is present, uncertaintyOfPresence-Extension SHALL NOT be present.
`verificationStatus.exists() != Condition.modifierExtension.where(url = 'https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/uncertainty-of-presence').exists()`

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