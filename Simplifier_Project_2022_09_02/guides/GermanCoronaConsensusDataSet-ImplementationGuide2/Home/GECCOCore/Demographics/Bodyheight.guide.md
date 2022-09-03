#### Body height

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Body height |  | 

---

This profile of a FHIR Observation is derived from the [Body height-profile](http://hl7.org/fhir/R4/observation-bodyheight.html) of the FHIR R4 core specification. Additional SNOMED-CT coding options are provided via the *Observation.code* element.

Note that in prior versions to 1.0.5 of this implementation guide, the SNOMED code *248334005 |Length of body (observable entity)|* was used on *Observation.code.coding:snomed* but was inactivated by SNOMED in the meantime. Hence, this has been replaced by *1153637007 |Body height (observable entity)|*.

---

**Profile - Body Height**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/body-height

**Snapshot**

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/body-height, snapshot}}

---

**Examples**

**Body height**
<br>
Example observation

{{json:de.gecco@1.0.5/package/examples/Example-observation-body-height.json}}   

---