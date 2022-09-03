#### Radiological findings

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Radiological findings | Undetermined finding / COVID-19-characteristic finding / Normal finding | 

---

This profile of a FHIR DiagnosticReport is aligned with the [DiagnosticReport Laboratory-profile](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.laborbefund/1.0.6/files/388067) of the Medical Informatics Initiative (MII). 

*DiagnosticReport.category* is set to match radiology.

*DiagnosticReport.code* shall be coded as LOINC *18748-4 Diagnostic imaging study*.

*DiagnosticReport.conclusionCode* contains a valueset binding with SNOMED-CT codes for the possible case report form response options.

---

**Profile - Diagnostic Report Radiology**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/diagnostic-report-radiology

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/diagnostic-report-radiology, snapshot}}

---

**ValueSets**

The *conclusionCode* valueset is provided with SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-findings

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/radiology-findings}}

---

**CodeSystem Supplement**

There is a CodeSystem supplement for postcoordinated SNOMED expressions.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/snomed-pce-supplement

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/snomed-pce-supplement}}

---

**Examples**

**Radiology Report Covid-19 finding**
<br>
Example diagnostic report with positive finding

{{json:de.gecco@1.0.5/package/examples/DiagnosticReport-radiology-covid-19-typischer-befund.json}} 

---

**Radiology Report finding undetermined**
<br>
Example diagnostic report where finding is undetermined

{{json:de.gecco@1.0.5/package/examples/DiagnosticReport-radiology-unspezifischer-befund.json}} 

---

**Radiology Report finding normal**
<br>
Example diagnostic report where finding is normal

{{json:de.gecco@1.0.5/package/examples/DiagnosticReport-radiology-normalbefund.json}}  

---