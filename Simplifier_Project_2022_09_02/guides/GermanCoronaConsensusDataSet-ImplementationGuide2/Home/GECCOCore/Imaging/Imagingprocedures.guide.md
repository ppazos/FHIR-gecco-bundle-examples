#### Imaging procedures

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Imaging procedures of the lung | CT / Radiography / Ultrasonography | 

---

This profile of a FHIR Procedure is derived from the [Procedure-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.prozedur/2.0.0-alpha3/files/404852) of the Medical Informatics Initiative (MII). 

*Procedure.category* shall be coded as *103693007 |Diagnostic procedure (procedure)|*

The valueset bindings on the *Procedure.code* element have been constrained to feature the response options for this particular parameter of the case report form with SNOMED-CT and DICOM codes.

*Procedure.bodySite* provides a coding pattern to capture the body site of lung.

The reference to the DiagnosticReport containing the radiological findings can be set via *Procedure.report*.

---

**Profile - Radiology Procedures**

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/radiology-procedures

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/radiology-procedures, snapshot}}

---

**ValueSets**

The radiology procedures valueset is provided with SNOMED-CT and DICOM codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-procedures

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-procedures}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-procedures-dicom

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-procedures-dicom}}

---

**Examples**

**Chest X-ray**
<br>
Example radiography procedure

{{json:de.gecco@1.0.5/package/examples/Example-procedure-chest-x-ray.json}} 

---

**Chest CT**
<br>
Example radiography procedure

{{json:de.gecco@1.0.5/package/examples/Imaging-procedure-computerized-axial-tomography.json}} 

---

**Chest Ultrasound**
<br>
Example radiography procedure

{{json:de.gecco@1.0.5/package/examples/Imaging-procedure-diagnostic-ultrasonography.json}}

---