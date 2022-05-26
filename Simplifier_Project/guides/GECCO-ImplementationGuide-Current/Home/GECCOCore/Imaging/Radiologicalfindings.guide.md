#### Radiological findings

---

Parameter Case Report Form and Response Options

| Radiological findings |  |
|-
| Undetermined finding | &#9744; |  
| COVID-19-characteristic finding | &#9744; |  
| Normal finding | &#9744; |  

---

This profile of a FHIR DiagnosticReport is aligned with the [DiagnosticReport Laboratory-profile](https://www.medizininformatik-initiative.de/fhir/core/modul-labor/StructureDefinition/DiagnosticReportLab) of the Medical Informatics Initiative (MII). 

*DiagnosticReport.category* is set to match radiology.

*DiagnosticReport.code* shall be coded as LOINC *18748-4 Diagnostic imaging study*.

*DiagnosticReport.conclusionCode* contains a valueset binding with SNOMED-CT codes for the possible case report form response options.

---

**Profile - Diagnostic Report Radiology**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/diagnostic-report-radiology

**Snapshot**

{{tree:ForschungsnetzCovid-19/RadiologyDiagnosticReport, snapshot}}

---

**ValueSets**

The *conclusionCode* valueset is provided with SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-findings

{{render:ForschungsnetzCovid-19/radiology-findings}}

---

**CodeSystem Supplement**

There is a CodeSystem supplement for postcoordinated SNOMED expressions.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/snomed-pce-supplement

{{render:ForschungsnetzCovid-19/gecco-codesystem-snomed-pce-supplement}}

---

**Examples**

**Radiology Report Covid-19 finding**
<br>
Example diagnostic report with positive finding

{{json:ForschungsnetzCovid-19/DiagnosticReport-example-radiology}} 

---

**Radiology Report finding undetermined**
<br>
Example diagnostic report where finding is undetermined

{{json:ForschungsnetzCovid-19/29cd7bc6-2b7b-44b9-8242-3d05fabd3e6a}} 

---

**Radiology Report finding normal**
<br>
Example diagnostic report where finding is normal

{{json:ForschungsnetzCovid-19/a30f5c42-8b4d-4cac-8118-55e7d876a8e8}} 

---