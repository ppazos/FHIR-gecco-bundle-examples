#### FiO2

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| FiO2 |  | 

---

This profile of a FHIR Observation is from the Laboratory Module of the Medical Informatics Initiative (MII). Further information and examples can be found in the MII's [Implementation Guide](https://simplifier.net/guide/LaborbefundinderMedizininformatik-Initiative/Observation). 

---

This profile of a FHIR Observation is used to capture the inhaled oxygen concentration (FiO2).

*Observation.code* contains two exemplary codings from LOINC and SNOMED-CT.

*Observation.valueQuantity* has a fixed UCUM-unit of *%*.

---

**Profile - Inhaled Oxygen Concentration (FiO2)**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/inhaled-oxygen-concentration

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-FiO2.json, snapshot}}

---

**Blood Gas Analysis**

The FiO2 measurement may be part of a blood gas analysis. Thus, there is an additonal profile that can be used for observation grouping. 

*Observation.code* contains three exemplary LOINC codings for gas panel of blood, arterial blood or capillary blood.

*Observation.hasMember* references the resources that belong to this panel, e.g. pH, PaCO2, PO2 or oxygen saturation.

The LOINC system in *Observation.code*, i.e. blood, arterial blood, capillary blood, shall match the LOINC system in *Observation.code* of the member observation.

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/blood-gas-panel

{{tree:de.gecco@1.0.5/package/Profile-Observation-GasPanel.json, snapshot}}

---

**Examples**

**Fraction of Inspired Oxygen**
<br>
Example observation FiO2

{{json:de.gecco@1.0.5/package/examples/Example-observation-inhaled-oxygen-concentration.json}} 

---

**Gas Panel Arterial Blood**
<br>
This observation can be part of a gas panel via the *hasMember* element.

{{json:de.gecco@1.0.5/package/examples/Example-observation-bga-panel.json}}  

---