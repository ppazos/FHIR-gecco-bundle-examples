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

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/do-not-resuscitate-order

{{tree:https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/do-not-resuscitate-order, snapshot}}

---

**ValueSets**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/resuscitation-status

{{render:https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/resuscitation-status}}

---

**Examples**

**DNR-order For resuscitation**
<br>
Example consent DNR-order

{{json:de.gecco@1.0.5/package/examples/Consent-DNR-for-resuscitation.json}} 

---

**DNR-order Not For resuscitation**
<br>
Example consent DNR-order

{{json:de.gecco@1.0.5/package/examples/Consent-DNR-not-for-resuscitation.json}} 

---

**DNR-order Status Unknown**
<br>
Example consent DNR-order

{{json:de.gecco@1.0.5/package/examples/Consent-DNR-unknown.json}}  

---