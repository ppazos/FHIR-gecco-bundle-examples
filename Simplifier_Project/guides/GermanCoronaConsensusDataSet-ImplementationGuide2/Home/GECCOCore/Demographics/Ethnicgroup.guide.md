#### Ethnic group

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Ethnic group | Caucasian / African / Asian / Arabs / Latin-American / Mixed-origin / Other | 

---

The EthnicGroups-Extension shall be used in conjunction with the profile on the Patient-resource.

Note that in prior versions to 1.0.4 of this implementation guide, the response option *Mixed-origin* used the SNOMED code *186019001 |Other ethnic, mixed origin (ethnic group)|* which was inactivated by SNOMED in the meantime. Hence, this has been replaced by *26242008 |Mixed (qualifier value)|*.

---

| Response option | Code | Display | System |
|-
| Caucasian | `14045001` | `Caucasian (ethnic group)` | `http://snomed.info/sct` |
| African | `18167009` | `Black African (ethnic group)` | `http://snomed.info/sct` |
| Asian | `315280000` | `Asian - ethnic group (ethnic group)` | `http://snomed.info/sct` | 
| Arabs | `90027003` | `Arabs (ethnic group)` | `http://snomed.info/sct` |
| Latin-American | `2135-2` | `Hispanic or Latino` | `urn:oid:2.16.840.1.113883.6.238` |
| Mixed-origin | `26242008` | `Mixed (qualifier value)` | `http://snomed.info/sct` |
| Other | `descendent-of` `372148003` | `Ethnic group (ethnic group)` | `http://snomed.info/sct` |

---

**Extension - Ethnic Groups**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/ethnic-group

**Snapshot**

{{tree:ForschungsnetzCovid-19/EthnicGroup, snapshot}}

---

**ValueSets**

The ethnic groups valueset is provided with SNOMED-CT codes.

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/ethnic-groups

{{render:ForschungsnetzCovid-19/ethnic-groups}}

---

**Examples**

Example instance of the ethnic group extension:

```json
{
    "url": "https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/ethnic-group",
    "valueCoding": {
        "code": "26242008",
        "display": "Mixed (qualifier value)",
        "system": "http://snomed.info/sct"
    }
}
```

---

Example patient resource that contains the extension:

{{json:ForschungsnetzCovid-19/Patient-example}}

---