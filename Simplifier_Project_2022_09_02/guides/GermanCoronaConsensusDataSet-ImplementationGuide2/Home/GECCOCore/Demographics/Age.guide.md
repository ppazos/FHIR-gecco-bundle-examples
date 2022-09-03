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

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/Patient, snapshot}}

---

**Extension Age**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/age

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/age}}

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

{{json:de.gecco@1.0.5/package/examples/Example-patient.json}}  

---