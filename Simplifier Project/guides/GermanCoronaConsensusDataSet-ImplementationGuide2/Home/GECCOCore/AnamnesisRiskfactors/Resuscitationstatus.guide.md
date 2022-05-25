#### Resuscitation status

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Do-not-resuscitate-order | Yes / No / Unknown | 

---

This profile constrains the FHIR Consent resource to cover the do-not-resuscitate order of a patient.

*Consent.scope* is the type of consent and shall have a fixed value of 'adr' for Advanced Care Directive.

*Consent.category* further specifies the scope of this consent. It has a fixed value of 'dnr' for 'Do Not Resuscitate'.

*Consent.provision.code* contains the content of this consent in coded form. This can be set to Yes - For resuscitation or No - Not for resuscitation. If the content is unknown, the dataAbsentReason Extension can be used and set to 'unknown'.


---

**Profile - Do-Not-Resuscitate Order**

**Snapshot**

Canonical: https://www.netzwerk-universitaetsmedizin.de//fhir/StructureDefinition/do-not-resuscitate-order

{{tree:ForschungsnetzCovid-19/DoNotResuscitateOrder, snapshot}}

---

**ValueSets**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/resuscitation-status

{{render:ForschungsnetzCovid-19/resuscitation-status}}

---

**Examples**

**DNR-order For resuscitation**
<br>
Example consent DNR-order

{{json:ForschungsnetzCovid-19/5e8956bf-0231-43c4-a538-c8629e990985}} 

---

**DNR-order Not For resuscitation**
<br>
Example consent DNR-order

{{json:ForschungsnetzCovid-19/7976c6e2-1b4c-4af5-99d7-a701e7f43472}} 

---

**DNR-order Status Unknown**
<br>
Example consent DNR-order

{{json:ForschungsnetzCovid-19/0432107d-0a5f-4767-aa93-b9353b2392c9}} 

---