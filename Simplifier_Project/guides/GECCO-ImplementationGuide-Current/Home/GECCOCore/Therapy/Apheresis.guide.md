#### Apheresis

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Apheresis | Yes / No / Unknown | 

---

This profile of a FHIR Procedure is derived from the [Procedure-profile](https://simplifier.net/medizininformatikinitiative-modulprozeduren/prozedur) of the Medical Informatics Initiative (MII). 

The response options can be controlled via the *status*-Element of the Procedure resource:

| Response option | Procedure.status |
|--------------|-----------|
| Yes | `in-progress` | 
| No | `not-done` | 
| Unknown | `unknown` | 

Notice however that this should not discourage systems, that implement the entire workflow execution states, to exchange resources which may contain information deemed relevant for this use case. This can especially include procedures where the status is *completed*.

---

**Profile - Apheresis**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/apheresis

**Snapshot**

{{tree:ForschungsnetzCovid-19/Apheresis-procedure, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT and OPS codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/apheresis-procedures

{{render:ForschungsnetzCovid-19/apheresis-procedures}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/apheresis-procedures-ops

{{render:ForschungsnetzCovid-19/apheresis-procedures-ops}}

---

**Examples**

**Apheresis Yes**
<br>
Patient is receiving apheresis treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-9}} 

---

**Apheresis No**
<br>
Patient is not receiving apheresis treatment 

{{json:2b813af9-3b67-4f9c-ad82-825f7f6ffb67}}

---

**Apheresis Unknown**
<br>
Unknown if patient is receiving apheresis treatment 

{{json:ForschungsnetzCovid-19/Procedure-example-duplicate-11}} 

---