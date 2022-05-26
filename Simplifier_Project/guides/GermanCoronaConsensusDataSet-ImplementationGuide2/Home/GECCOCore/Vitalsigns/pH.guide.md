#### pH

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| pH value |  | 

---

This profile of a FHIR Observation is from the Laboratory Module of the Medical Informatics Initiative (MII). Further information and examples can be found in the MII's [Implementation Guide](https://simplifier.net/guide/LaborbefundinderMedizininformatik-Initiative/Observation). 

---

This profile of a FHIR Observation is used to capture the pH value.

*Observation.code* contains three exemplary LOINC codings for pH in blood, arterial blood or capillary blood.

*Observation.valueQuantity* has a fixed UCUM-unit of *[<nolink>pH]*.

---

**Profile - pH value**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/pH

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-GasPanel-pH.json, snapshot}} 

---

**Blood Gas Analysis**

The pH measurement may be part of a blood gas analysis. Thus, there is an additonal profile that can be used for observation grouping. 

*Observation.code* contains three exemplary LOINC codings for gas panel of blood, arterial blood or capillary blood.

*Observation.hasMember* references the resources that belong to this panel, e.g. pH, PaCO2, PO2 or oxygen saturation.

The LOINC system in *Observation.code*, i.e. blood, arterial blood, capillary blood, shall match the LOINC system in *Observation.code* of the member observation.

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/blood-gas-panel

{{tree:de.gecco@1.0.5/package/Profile-Observation-GasPanel.json, snapshot}}

---

**Examples**

**pH in Arterial Blood**
<br>
Example observation pH

{{json:de.gecco@1.0.5/package/examples/Example-observation-pH.json}}

---

**Gas Panel Arterial Blood**
<br>
This observation can be part of a gas panel via the *hasMember* element.

{{json:de.gecco@1.0.5/package/examples/Example-observation-bga-panel.json}}

---