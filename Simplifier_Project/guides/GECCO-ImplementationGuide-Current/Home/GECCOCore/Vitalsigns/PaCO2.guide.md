#### PaCO2

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| PaCO2 |  | 

---

This profile of a FHIR Observation is from the Laboratory Module of the Medical Informatics Initiative (MII). Further information and examples can be found in the MII's [Implementation Guide](https://simplifier.net/guide/LaborbefundinderMedizininformatik-Initiative/Observation). 

---

This profile of a FHIR Observation is used to capture the carbon dioxide partial pressure (PaCO2).

*Observation.code* contains three exemplary LOINC codings for PaCO2 in blood, arterial blood or capillary blood.

*Observation.valueQuantity* has a fixed UCUM-unit of *mm[Hg]*.

---

**Profile - Carbon Dioxide Partial Pressure (PaCO2)**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/carbon-dioxide-partial-pressure

**Snapshot**

{{tree:ForschungsnetzCovid-19/GasPanel-PaCO2, snapshot}}

---

**Blood Gas Analysis**

The PaCO2 measurement may be part of a blood gas analysis. Thus, there is an additonal profile that can be used for observation grouping. 

*Observation.code* contains three exemplary LOINC codings for gas panel of blood, arterial blood or capillary blood.

*Observation.hasMember* references the resources that belong to this panel, e.g. pH, PaCO2, PO2 or oxygen saturation.

The LOINC system in *Observation.code*, i.e. blood, arterial blood, capillary blood, shall match the LOINC system in *Observation.code* of the member observation.

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/blood-gas-panel

{{tree:ForschungsnetzCovid-19/BloodGasPanel, snapshot}}

---

**Examples**

**PaCO2 in Arterial Blood**
<br>
Example observation PaCO2

{{json:6a78560b-2f7c-4af5-a7bc-3c7d62ca8458}} 

---

**Gas Panel Arterial Blood**
<br>
This observation can be part of a gas panel via the *hasMember* element.

{{json:ForschungsnetzCovid-19/Observation-example-gas-panel-arterial}} 

---