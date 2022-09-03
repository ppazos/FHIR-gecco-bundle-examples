#### Laboratory value

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| CRP |  | 
| Ferritin |  |
| Bilirubin |  |
| D-dimer |  | 
| Gamma glutamyl transferase |  | 
| Aspartate aminotransferase |  | 
| Lactate dehydrogenase |  | 
| Cardiac troponin |  | 
| Hemoglobin |  | 
| Creatinine |  | 
| Lactate |  | 
| Leukocytes |  | 
| Lymphocytes |  | 
| Neutrophils |  | 
| Partial thromboplastin time |  | 
| Platelets |  | 
| INR |  | 
| Albumin in serum |  | 
| Antithrombin |  | 
| Procalcitonin |  |  
| Interleukin 6 |  | 
| Natriuretic peptide.B prohormone N-Terminal |  | 
| Fibrinogen |  | 

---

This profile of a FHIR Observation is from the Laboratory Module of the Medical Informatics Initiative (MII). Further information and examples can be found in the MII's [Implementation Guide](https://simplifier.net/guide/LaborbefundinderMedizininformatik-Initiative/Observation). 

The [Observation](https://simplifier.net/packages/de.medizininformatikinitiative.kerndatensatz.laborbefund/1.0.6/files/388074) is a generic structure to exchange laboratory values and is not limited to LOINC codes provided in the [ValueSet](https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/lab-tests-gecco) shown below. This is merely included to provide guidance on which LOINC codes can be used to capture the requested parameters or which LOINC codes should possibly be queried in an existing database. There can be no stipulation to restrict parameters to single codes or units because this would contradict the existing practices in laboratories.

---

**Observation Laboratory**

Canonical: https://www.medizininformatik-initiative.de/fhir/core/modul-labor/StructureDefinition/ObservationLab

{{tree:https://www.medizininformatik-initiative.de/fhir/core/modul-labor/StructureDefinition/ObservationLab, snapshot}}

---

**ValueSets**

{{render:de.gecco@1.0.5/package/ValueSet-lab-tests-gecco.json}}

---

**Examples**

**CRP**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-laboratory-c-reactive-protein-mass-per-volume-in-serum-or-plasma.json}}

---