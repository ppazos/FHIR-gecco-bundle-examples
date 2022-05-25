#### Immunization status

---

| PARAMETER CASE REPORT FORM | RESPONSE OPTIONS |
|--------------|-----------|
| Immunization status | Influenza / Pneumococcal / BCG / COVID-19 / Other | 

---

This profile of a FHIR Immunization is closely aligned to the [Immunization-profile](https://simplifier.net/im1x0/kbvprmiovaccinationrecordaddendum) of the MIO Impfpass by Kassenärztliche Bundesvereinigung (KBV). 

Use the *Immunization.protocolApplied.targetDisease* element to code the response options.

*Immunization.occurrence[x]* shall cover the date when the immunization was last administered.

*Immunization.vaccineCode* can contain a code for the vaccine product administered. In case there is no information on vaccinations or no vaccnations are known, use the options from the *absentOrUnknownImmunizations* slice.

Since the the January 2021 release, SNOMED provides two codes for Covid-19 vaccinations which are included in the MIO Impfpass ValueSet to be used on *Immunization.vaccineCode.coding:snomed*. Use the SNOMED code *1119349007|Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 messenger ribonucleic acid (medicinal product)|* for vaccinations with the Comirnaty® BioNTech/Pfizer or COVID-19 Vaccine Moderna®. An example is given below. Similarly, *1119305005 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 antigen (medicinal product)|* is used for Va­x­ze­vria® (CO­VID-19 Vac­ci­ne Astra­Zene­ca) and CO­VID-19 Vac­ci­ne Jans­sen®.

<br>

| Vaccine | SNOMED |
|--------------|-----------|
| Co­mir­na­ty® BioNTech/Pfizer | `1119349007 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 messenger ribonucleic acid (medicinal product)|` | 
| COVID-19 Vaccine Moderna® | `1119349007 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 messenger ribonucleic acid (medicinal product)|` | 
| Va­x­ze­vria® Astra­Zene­ca | `1119305005 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 antigen (medicinal product)|` | 
| Janssen® Johnson & Johnson | `1119305005 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 antigen (medicinal product)|` | 

---

**Profile - Immunization**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/immunization

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Immunization-Immunization.json, snapshot}} 

---

**ValueSets**

The [targetDisease](https://simplifier.net/im1x0/kbvvsmiovaccinationtargetdisease) value set is defined by KBV as part of the [MIO Impfpass](https://simplifier.net/im1x0). The vaccine codes also originate from the MIO Impfpass: [vaccineCode](https://simplifier.net/im1x0/kbvvsmiovaccinationvaccinelist). Here a replica of the value set is used to add terminology server validation support for postcoordinated SNOMED expressions. The ATC vaccine codes below are identical to KBV MIO Impfpass but use an updated URL for the ATC code system. 

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/vaccines-atc

{{render:de.gecco@1.0.5/package/ValueSet-vaccines_atc.json}} 

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/vaccines-snomed

{{render:de.gecco@1.0.5/package/ValueSet-vaccines-snomed.json}}

---

**Examples**

**Covid-19 Vaccination**
<br>
Example immunization

{{json:de.gecco@1.0.5/package/examples/Immunization-covid-19.json}} 

---

**Pneumococcal Immunization**
<br>
Example immunization

{{json:de.gecco@1.0.5/package/examples/Immunization-pneumococcal-vaccine.json}} 

---

**No known Immunizations**
<br>
Example immunization

{{json:de.gecco@1.0.5/package/examples/Immunization-no-known-immunizations.json}}

---