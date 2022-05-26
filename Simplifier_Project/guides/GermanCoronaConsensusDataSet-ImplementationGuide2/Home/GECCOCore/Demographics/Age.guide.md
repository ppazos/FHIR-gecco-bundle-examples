#### Age

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Age |  | 

---

The Age-Extension shall be used to capture a patient's age at study enrollment.

---

**Profile - Patient**

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/Patient

{{tree:ForschungsnetzCovid-19/Patient, snapshot}}

---

**Extension Age**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/age

{{tree:ForschungsnetzCovid-19/Extension-Patient-Age}}

---

**Examples**

Example instance of the age extension:

```json
{
	"extension": [
		{
			"url": "dateTimeOfDocumentation",
			"valueDateTime": "2020-10-01"
		},
		{
			"url": "age",
			"valueAge": {
				"value": 67,
				"unit": "years",
				"system": "http://unitsofmeasure.org",
				"code": "a"
			}
		}
	],
	"url": "https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/age"
}
```

---

Example patient resource that contains the extension:

{{json:ForschungsnetzCovid-19/Patient-example}}

---