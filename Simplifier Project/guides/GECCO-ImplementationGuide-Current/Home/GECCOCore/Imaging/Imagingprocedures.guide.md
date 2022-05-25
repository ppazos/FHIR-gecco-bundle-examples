#### Imaging procedures

---

Parameter Case Report Form and Response Options

| Imaging procedures of the lung | Yes | No | Unknown |
|-
| Imaging procedures of the lung | &#9744; | &#9744; | &#9744; |  

---

This profile of a FHIR Procedure is derived from the [Procedure-profile](https://simplifier.net/medizininformatikinitiative-modulprozeduren/prozedur) of the Medical Informatics Initiative (MII). 

*Procedure.category* shall be coded as *103693007 |Diagnostic procedure (procedure)|*

The valueset bindings on the *Procedure.code* element have been constrained to feature the response options for this particular parameter of the case report form with SNOMED-CT and DICOM codes.

*Procedure.bodySite* provides a coding pattern to capture the body site of lung.

The reference to the DiagnosticReport containing the radiological findings can be set via *Procedure.report*.

---

**Profile - Radiology Procedures**

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/radiology-procedures

{{tree:ForschungsnetzCovid-19/RadiologyProcedures, snapshot}}

---

**ValueSets**

The radiology procedures valueset is provided with SNOMED-CT and DICOM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-procedures

{{render:ForschungsnetzCovid-19/radiology-procedures}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-procedures-dicom

{{render:ForschungsnetzCovid-19/radiology-procedures-dicom}}

---

**Examples**

**Chest X-ray**
<br>
Example radiography procedure

{{json:afba3005-186f-4330-9d3e-c188cabd949e}} 

---

**Chest CT**
<br>
Example radiography procedure

{{json:ForschungsnetzCovid-19/f5084a70-d217-47aa-858a-7565e45b922b}} 

---

**Chest Ultrasound**
<br>
Example radiography procedure

{{json:ForschungsnetzCovid-19/7d07f267-e38e-4a4d-bd4d-24c08e4290bf}} 

---