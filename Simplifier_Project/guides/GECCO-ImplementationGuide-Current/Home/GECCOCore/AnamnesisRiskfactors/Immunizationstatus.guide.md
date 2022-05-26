#### Immunization status

---

Parameter Case Report Form and Response Options 

| Immunization status |  |
|-
| Influenza | &#9744; | 
| Pneumococcal | &#9744; | 
| BCG | &#9744; | 
| COVID-19 | &#9744; | 
| Other | &#9744; | 

---

This profile of a FHIR Immunization is closely aligned to the [Immunization-profile](https://simplifier.net/im1x0/kbvprmiovaccinationrecordaddendum) of the MIO Impfpass by Kassenärztliche Bundesvereinigung (KBV). 

Use the *Immunization.protocolApplied.targetDisease* element to code the response options. This is vaccine preventatable disease being targetted.

*Immunization.occurrence[x]* shall cover the date when the immunization was last administered.

*Immunization.vaccineCode* can contain a code for the vaccine product administered. In case there is no information on vaccinations or no vaccnations are known, use the options from the *absentOrUnknownImmunizations* slice.

SNOMED provides codes for Covid-19 vaccinations which are included in the MIO Impfpass ValueSet to be used on *Immunization.vaccineCode.coding:snomed*. Branded products are out of scope of the International Edition of SNOMED. Therefore, the vaccine products must be mapped to the abstract codes as below:

<br>

| Vaccine branded product | SNOMED |
|--------------|-----------|
| Co­mir­na­ty® BioNTech/Pfizer | `1119349007 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 messenger ribonucleic acid (medicinal product)|` | 
| COVID-19 Vaccine Moderna® | `1119349007 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 messenger ribonucleic acid (medicinal product)|` | 
| Va­x­ze­vria® Astra­Zene­ca | `29061000087103 |Vaccine product containing only recombinant non-replicating viral vector encoding Severe acute respiratory syndrome coronavirus 2 spike protein (medicinal product)|` | 
| Janssen® Johnson & Johnson | `29061000087103 |Vaccine product containing only recombinant non-replicating viral vector encoding Severe acute respiratory syndrome coronavirus 2 spike protein (medicinal product)|` |
| Nuvaxovid® Novavax | `1162643001 |Vaccine product containing only Severe acute respiratory syndrome coronavirus 2 recombinant spike protein antigen (medicinal product)|` |
| Sputnik V® / Gam-COVID-Vac® Gamaleya NRCEM | `29061000087103 |Vaccine product containing only recombinant non-replicating viral vector encoding Severe acute respiratory syndrome coronavirus 2 spike protein (medicinal product)|` |
| CoronaVac® SinoVac Biotech | `1157024006 |Vaccine product containing only inactivated whole Severe acute respiratory syndrome coronavirus 2 antigen (medicinal product)|` |

---

**Profile - Immunization**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/immunization

**Snapshot**

{{tree:ForschungsnetzCovid-19/Immunization, snapshot}}

---

**ValueSets**

The [targetDisease](https://simplifier.net/im1x0/kbvvsmiovaccinationtargetdisease) value set is defined by KBV as part of the [MIO Impfpass](https://simplifier.net/im1x0). The vaccine codes also originate from the MIO Impfpass: [vaccineCode](https://simplifier.net/im1x0/kbvvsmiovaccinationvaccinelist). Here a replica of the value set is used to add terminology server validation support for postcoordinated SNOMED expressions. The ATC vaccine codes below are identical to KBV MIO Impfpass but use an updated URL for the ATC code system. 

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/vaccines-atc

{{render:ForschungsnetzCovid-19/VaccinesATC}}

---

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/ValueSet/vaccines-snomed

{{render:ForschungsnetzCovid-19/gecco-valueset-vaccines-snomed}}

---

**Examples**

**Covid-19 Vaccination**
<br>
Example immunization

{{json:c17f192c-f765-4729-818a-4ee55be5c87b}}

---

**Pneumococcal Immunization**
<br>
Example immunization

{{json:ForschungsnetzCovid-19/Immunization-example-duplicate-2}} 

---

**No known Immunizations**
<br>
Example immunization

{{json:b7db30a0-4ffd-4dd6-b3e5-53e2730789e6}}

---