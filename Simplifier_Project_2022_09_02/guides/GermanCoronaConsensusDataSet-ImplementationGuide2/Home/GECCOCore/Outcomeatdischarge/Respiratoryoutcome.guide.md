#### Respiratory outcome

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Respiratory outcome | On ventilator / Not on ventilator | 

---

This profile of a FHIR Condition is derived from the [Diagnosis-profile](https://simplifier.net/medizininformatikinitiative-moduldiagnosen/diagnose-duplicate-3) of the Medical Informatics Initiative (MII). The valueset bindings on the *Condition.code* element have been constrained to solely feature the response options for this particular parameter of the case report form. To represent the presence or absence of findings, use *verificationStatus*. 

---

**Profile - Dependency on Ventilator**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/dependence-on-ventilator

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/dependence-on-ventilator, snapshot}}

---

**Examples**

**Patient dependent on ventilator**
<br>

{{json:de.gecco@1.0.5/package/examples/Condition-respiratory-outcome-dependence-on-ventilator-present.json}} 

---

**Patient not dependent on ventilator**
<br>

{{json:de.gecco@1.0.5/package/examples/Condition-respiratory-outcome-dependence-on-ventilator-absent.json}}

---