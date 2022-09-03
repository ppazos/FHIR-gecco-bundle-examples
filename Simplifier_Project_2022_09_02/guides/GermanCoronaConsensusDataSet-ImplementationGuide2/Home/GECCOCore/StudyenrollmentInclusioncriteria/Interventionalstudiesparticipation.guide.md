#### Interventional studies participation

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Has the patient participated in one or more interventional clinical trials? <br> If yes, please provide EudraCT or NCT number (if available) | Yes / No / Unknown / n.a. | 

---

This profile of a FHIR Observation captures if the patient participated in one or more interventional clinical trials.

---

**Profile - Interventional Clinical Trial Participation**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/interventional-clinical-trial-participation

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Observation-InterventionalClinicalTrialParticipation.json, snapshot}}

---

**ValueSets**

Valuesets are provided with SNOMED-CT codes.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/yes-no-unknown-other-na

{{render:de.gecco@1.0.5/package/ValueSet-yes-no-unknown-other-na.json}}

---

**Examples**

**Yes including EudraCT and NCT numbers**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-interventional-studies-participation-yes-eudract-nct.json}} 

---

**Yes including EudraCT number**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-interventional-studies-participation-yes-eudract.json}} 

---

**Yes including NCT number**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-interventional-studies-participation-yes-nct.json}} 

---

**No participation in other studies**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-interventional-studies-participation-no-qualifier-value.json}} 

---

**Unknown if participates in other studies**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-interventional-studies-participation-unknown-qualifier-value.json}} 

---

**Not applicable**
<br>

{{json:de.gecco@1.0.5/package/examples/Observation-interventional-studies-participation-not-applicable-qualifier-value.json}}

---