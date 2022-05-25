#### Peripheral oxygen saturation

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Peripheral oxygen saturation |  | 

---

In addition to LOINC, *Observation.code* contains an exemplary SNOMED-CT coding.

*Observation.valueQuantity* has a fixed UCUM-unit of *%*.

---

This profile of a FHIR Observation is derived from the [Oxygen saturation-profile](http://hl7.org/fhir/observation-oxygensat.html) of the FHIR R4 core specification.

**Profile - Oxygen Saturation**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/oxygen-saturation

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-OxygenSaturation.json, snapshot}}

---

**Blood Gas Analysis**

Oxygen saturation may be part of a blood gas analysis. Thus, there is an additonal profile that can be used for observation grouping. 

*Observation.code* contains three exemplary LOINC codings for gas panel of blood, arterial blood or capillary blood.

*Observation.hasMember* references the resources that belong to this panel, e.g. pH, PaCO2, PO2 or oxygen saturation.

The LOINC system in *Observation.code*, i.e. blood, arterial blood, capillary blood, shall match the LOINC system in *Observation.code* of the member observation.

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/blood-gas-panel

{{tree:de.gecco@1.0.5/package/Profile-Observation-GasPanel.json, snapshot}}

---

**Examples**

**Oxygen Saturation**
<br>
Example observation oxygen saturation

{{json:de.gecco@1.0.5/package/examples/Example-oxygen-saturation.json}}

---

**Gas Panel Arterial Blood**
<br>
This observation can be part of a gas panel via the *hasMember* element.

{{json:de.gecco@1.0.5/package/examples/Example-observation-bga-panel.json}}

---