# Home 

| Note | Under Construction! |
|---------|---------------------|
| {{render:Warning}} | This implementation guide is the current build and is under construction. Check out the Simplifier project page for other versions of this guide under: https://simplifier.net/ForschungsnetzCovid-19 |

---

This specification describes the FHIR representation of the core GECCO data set in form of FHIR profiles and terminology resources.

| Release   |   |
|---------|---|
| Date   | current |
| Version | current       |
| Status  | Active      |
| Realm   | DE          | 

## Table of contents

{{index:root}}

## Imprint
This implementation guide was created as part of the Nationales Forschungsnetzwerk der Universitätsmedizin (NFN) funded by the Federal Ministry of Education and Research (BMBF) and is subject to the ballot procedure of the Interoperability Forum and the governance process of the Technical Committees of HL7 Germany e.V..

## Contact persons

* Alexander Bartschke, Charité Universitätsmedizin Berlin
* Andrea Essenwanger, Berlin Institute of Health (BIH)
* Julian Saß, Berlin Institute of Health (BIH)
* Sylvia Thun, Charité Universitätsmedizin Berlin

Feel free to ask questions regarding this publication and discuss GECCO via [chat.fhir.org](https://chat.fhir.org/#narrow/stream/179183-german-.28d-a-ch.29/topic/GECCO-Datensatz) within the stream 'german (d-a-ch)/GECCO-Datensatz'.

Issues can be submitted through this Simplifier-project or the [github repository](https://github.com/hl7germany/forschungsnetz-covid19).

Further requests can be made via email through gecco@charite.de.


## Authors (in alphabetical order)

* Alexander Bartschke (Charité Universitätsmedizin Berlin)
* Andrea Essenwanger (Berlin Institute of Health (BIH))
* Moritz Lehne (Berlin Institute of Health (BIH))
* Eugenia Rinaldi (Charité Universitätsmedizin Berlin)
* Julian Saß (Berlin Institute of Health (BIH))
* Sylvia Thun (Charité Universitätsmedizin Berlin)

with support from:
* Noemi Deppenwiese (Friedrich-Alexander-Universität Erlangen-Nürnberg)
* Cora Drenkhahn (Universität zu Lübeck)
* Cornelius Erbelding (Universitätsklinikum Tübingen)
* Simone Heckmann (Gefyra GmbH)
* Kai U. Heitmann (hih - Health Innovation Hub des Bundesgesundheitsministeriums)
* Christof von Kalle (Charité Universitätsmedizin Berlin)
* Lisa Pilgram (Universitätsklinikum Frankfurt)
* Stefanie Rudolph (Charité Universitätsmedizin Berlin)
* Josefin Sachau (Peter L. Reichertz Institut für Medizinische Informatik)
* Patrick Werner (MOLIT Institut gGmbH)
* Joshua Wiedekopf (Universität zu Lübeck)
* Alexander Zautke (Firely)

Editorial team:
* Thomas Bahmer (Universitätsklinikum Schleswig-Holstein Kiel)
* Michael von Bergwelt (Klinikum der Universität München)
* Marie von Lilienfeld-Toal (Universitätsklinikum Jena)
* Patrick Meybohm (Universitätsklinikum Würzburg)
* Ulrich Sax (Universitätsmedizin Göttingen)
* Jörg Janne Vehreschild (Uniklinik Köln)

## Copyright notice, Terms of use
Copyright © 2020+: Berlin Institute of Health, Anna-Louisa-Karsch-Str. 2, 10178 Berlin
<br>
![BIH-logo](https://raw.githubusercontent.com/hl7germany/forschungsnetz-covid19/master/ig-images/BIH_Logo.jpg "BIH-Logo") ![Charite-logo](https://raw.githubusercontent.com/hl7germany/forschungsnetz-covid19/master/ig-images/Charite_Logo.png "Charite-logo")

The content of this specification is public. Reuse or publication claims are not limited.

For the rights of use of the underlying FHIR technology see the FHIR Base Specification.

Some code systems in use are issued and maintained by other organizations. The copyright of the respective publishers listed there is applicable.

## Disclaimer
The content of this document is public. Please note that parts of this document are based on FHIR version R4, which is under copyright of HL7 International.

* Although the greatest care has been taken in the preparation of this publication, the authors cannot accept any liability for direct or indirect damage that may arise from the content of this specification.

---