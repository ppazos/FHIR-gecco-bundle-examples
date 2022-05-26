## Introduction

The German Corona Consensus Data Set (GECCO) is a nationally uniform data set for the systematic collection of scientific data on COVID-19 in Germany.

Basis of the data set are both the [ISARIC protocol](https://isaric.tghn.org/clinical-characterisation-protocol-ccp/) of the WHO as well as the data concepts of the [LEOSS-Register](https://leoss.net/). The purpose of ISARIC is to prevent disease and death from outbreaks of infectious diseases such as COVID-19. ISARIC brings together clinical research networks worldwide to provide the fastest possible research response to an outbreak of an infectious disease.

Proposals and concepts for the data set were collected by members of an expert panel composed of specialists from university hospitals, professional associations, and other relevant organizations such as the interoperability working group of the [Medical Informatics Initiative](https://www.medizininformatik-initiative.de/en/start).

To ensure syntactic and semantic interoperability, the data elements are mapped to international standards and terminology. The data set and terminology mappings can be accessed via the [ART-DECOR® platform](https://art-decor.org/art-decor/decor-datasets--covid19f-). The FHIR® standard is used for syntactically standardized transmission. The FHIR profiles published in this guide define uniform data structures, which enable interoperable data exchange via different IT systems. The profiles rely heavily on preliminary work, especially the profiles of the [Medical Informatics Initiative](https://simplifier.net/organization/koordinationsstellemii), the base profiles of [HL7 Germany](https://simplifier.net/basisprofil-de-r4), and the profiles defined by the [Kassenärztliche Bundesvereinigung (KBV)](https://simplifier.net/organization/kassenrztlichebundesvereinigungkbv/~home). Furthermore, there is increased focus on alignment with international efforts like the [Logica Implementation Guide on Covid-19](https://covid-19-ig.logicahealth.org/index.html) and the [International Patient Summary](https://build.fhir.org/ig/HL7/fhir-ips/index.html).

---

**Must-support**

| Note | Elements flagged as 'must-support' |
|---------|---------------------|
| {{render:Warning}} | For mandatory elements or elements marked as must-support, please refer to the corresponding [IPS rules](https://build.fhir.org/ig/HL7/fhir-ips/design.html#must-support) which also apply to this ImplementationGuide. |

---