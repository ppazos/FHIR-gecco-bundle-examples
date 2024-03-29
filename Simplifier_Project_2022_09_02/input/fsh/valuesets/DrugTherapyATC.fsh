ValueSet: DrugTherapyATC
Id: pharmacological-therapy-atc
Title: "Pharmacological Therapy ATC"
Description: "Pharmacological therapy in the context of Covid-19"
* insert Metadata
* ^meta.profile = "http://hl7.org/fhir/StructureDefinition/shareablevalueset"
* ^extension.url = "http://hl7.org/fhir/StructureDefinition/resource-effectivePeriod"
* ^extension.valuePeriod.start = "2020-05-04T20:17:42+02:00"
* ^identifier.use = #official
* ^identifier.system = "http://art-decor.org/ns/oids/vs"
* ^identifier.value = "1.2.276.0.76.11.494"
* ^immutable = false
//2020
* include codes from system $atc|2020
    where concept is-a #N02B
* include codes from system $atc|2020
    where concept is-a #G01B
* include codes from system $atc|2020
    where concept is-a #H02
* include codes from system $atc|2020
    where concept is-a #M01BA
* include codes from system $atc|2020
    where concept is-a #R03AK
* include codes from system $atc|2020
    where concept is-a #R03AL
* include codes from system $atc|2020
    where concept is-a #S02B
* include codes from system $atc|2020
    where concept is-a #L04AD
* include codes from system $atc|2020
    where concept is-a #L04AB
* include codes from system $atc|2020
    where concept is-a #L04AC
* include codes from system $atc|2020
    where concept is-a #L03AB
* include codes from system $atc|2020
    where concept is-a #A12CB
* $atc|2020#D01AC20 "Imidazole/Triazole in Kombination mit Corticosteroiden"
* $atc|2020#J05AE08 "Atazanavir"
* $atc|2020#J05AR15 "Atazanavir und Cobicistat"
* $atc|2020#J05AR23 "Atazanavir und Ritonavir"
* $atc|2020#J05AE10 "Darunavir"
* $atc|2020#J05AR14 "Darunavir und Cobicistat"
* $atc|2020#J05AR22 "Emtricitabin, Tenofoviralafenamid, Darunavir und Cobicistat"
* $atc|2020#P01BA01 "Chloroquin"
* $atc|2020#P01BA02 "Hydroxychloroquin"
* $atc|2020#P02CF01 "Ivermectin"
* $atc|2020#D11AX22 "Ivermectin"
* $atc|2020#J05AR10 "Lopinavir und Ritonavir"
* $atc|2020#J05AB06 "Ganciclovir"
* $atc|2020#S01AD09 "Ganciclovir"
* $atc|2020#J05AH02 "Oseltamivir"
* $atc|2020#J05AP01 "Ribavirin"
* $atc|2020#B02AB04 "Camostat"
* $atc|2020#J05AX27 "Favipiravir"
* $atc|2020#S01XA18 "Ciclosporin"
* $atc|2020#D11AH01 "Tacrolimus"
* $atc|2020#L04AA10 "Sirolimus"
* $atc|2020#L04AA18 "Everolimus"
* $atc|2020#L01XE10 "Everolimus"
* $atc|2020#L01XE18 "Ruxolitinib"
* $atc|2020#M04AC01 "Colchicin"
* $atc|2020#S01AD05 "Interferon"
* $atc|2020#A11CC06 "Calcifediol"
//2021
* $atc|2021#N02B "ANDERE ANALGETIKA UND ANTIPYRETIKA"
* $atc|2021#N02BA "Salicylsäure und Derivate"
* $atc|2021#N02BA01 "Acetylsalicylsäure"
* $atc|2021#N02BA02 "Aloxiprin"
* $atc|2021#N02BA03 "Cholinsalicylat"
* $atc|2021#N02BA04 "Natriumsalicylat"
* $atc|2021#N02BA05 "Salicylamid"
* $atc|2021#N02BA06 "Salsalat"
* $atc|2021#N02BA07 "Ethenzamid"
* $atc|2021#N02BA08 "Morpholinsalicylat"
* $atc|2021#N02BA09 "Dipyrocetyl"
* $atc|2021#N02BA10 "Benorilat"
* $atc|2021#N02BA11 "Diflunisal"
* $atc|2021#N02BA12 "Kaliumsalicylat"
* $atc|2021#N02BA13 "Lysin-Acetylsalicylat"
* $atc|2021#N02BA14 "Guacetisal"
* $atc|2021#N02BA15 "Carbasalat calcium"
* $atc|2021#N02BA16 "Imidazolsalicylat"
* $atc|2021#N02BA19 "Cholin-Magnesium-Tris-Salicylat"
* $atc|2021#N02BA20 "Kombinationen"
* $atc|2021#N02BA51 "Acetylsalicylsäure, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BA55 "Salicylamid, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BA57 "Ethenzamid, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BA59 "Dipyrocetyl, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BA65 "Carbasalat calcium, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BA71 "Acetylsalicylsäure, Kombinationen mit Psycholeptika"
* $atc|2021#N02BA75 "Salicylamid, Kombinationen mit Psycholeptika"
* $atc|2021#N02BA77 "Ethenzamid, Kombinationen mit Psycholeptika"
* $atc|2021#N02BA79 "Dipyrocetyl, Kombinationen mit Psycholeptika"
* $atc|2021#N02BB "Pyrazolone"
* $atc|2021#N02BB01 "Phenazon"
* $atc|2021#N02BB02 "Metamizol-Natrium"
* $atc|2021#N02BB03 "Aminophenazon"
* $atc|2021#N02BB04 "Propyphenazon"
* $atc|2021#N02BB05 "Nifenazon"
* $atc|2021#N02BB06 "Phenazonsalicylat"
* $atc|2021#N02BB51 "Phenazon, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BB52 "Metamizol-Natrium, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BB53 "Aminophenazon, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BB54 "Propyphenazon, Kombinationen exkl. Psycholeptika**"
* $atc|2021#N02BB56 "Phenazonsalicylat, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BB71 "Phenazon, Kombinationen mit Psycholeptika"
* $atc|2021#N02BB72 "Metamizol-Natrium, Kombinationen mit Psycholeptika"
* $atc|2021#N02BB73 "Aminophenazon, Kombinationen mit Psycholeptika"
* $atc|2021#N02BB74 "Propyphenazon, Kombinationen mit Psycholeptika"
* $atc|2021#N02BB76 "Phenazonsalicylat, Kombinationen mit Psycholeptika"
* $atc|2021#N02BE "Anilide"
* $atc|2021#N02BE01 "Paracetamol"
* $atc|2021#N02BE03 "Phenacetin"
* $atc|2021#N02BE04 "Bucetin"
* $atc|2021#N02BE05 "Propacetamol"
* $atc|2021#N02BE51 "Paracetamol, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BE53 "Phenacetin, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BE54 "Bucetin, Kombinationen exkl. Psycholeptika"
* $atc|2021#N02BE61 "Paracetamol, Kombinationen mit Coffein"
* $atc|2021#N02BE71 "Paracetamol, Kombinationen mit Psycholeptika"
* $atc|2021#N02BE73 "Phenacetin, Kombinationen mit Psycholeptika"
* $atc|2021#N02BE74 "Bucetin, Kombinationen mit Psycholeptika"
* $atc|2021#N02BG "Andere Analgetika und Antipyretika"
* $atc|2021#N02BG02 "Rimazolium"
* $atc|2021#N02BG03 "Glafenin"
* $atc|2021#N02BG04 "Floctafenin"
* $atc|2021#N02BG05 "Viminol"
* $atc|2021#N02BG06 "Nefopam"
* $atc|2021#N02BG07 "Flupirtin"
* $atc|2021#N02BG08 "Ziconotid"
* $atc|2021#N02BG09 "Methoxyfluran"
* $atc|2021#N02BG10 "Cannabinoide"
* $atc|2021#N02BG11 "Mirogabalin"
* $atc|2021#N02BG12 "Tanezumab"
* $atc|2021#N02BH "Homöopathische und anthroposophische Analgetika und Antipyretika"
* $atc|2021#N02BH01 "Aconitum"
* $atc|2021#N02BH10 "Verschiedene"
* $atc|2021#N02BH20 "Kombinationen"
* $atc|2021#N02BP "Pflanzliche Analgetika und Antipyretika"
* $atc|2021#N02BP01 "Blauer Eisenhut"
* $atc|2021#N02BP02 "Lindenblüten"
* $atc|2021#G01B "ANTIINFEKTIVA/ANTISEPTIKA IN KOMBINATION MIT CORTICOSTEROIDEN"
* $atc|2021#G01BA "Antibiotika und Corticosteroide"
* $atc|2021#G01BA01 "Antibiotika und Corticosteroide"
* $atc|2021#G01BC "Chinolin-Derivate und Corticosteroide"
* $atc|2021#G01BD "Antiseptika und Corticosteroide"
* $atc|2021#G01BD01 "Antiseptika und Corticosteroide"
* $atc|2021#G01BE "Sulfonamide und Corticosteroide"
* $atc|2021#G01BE50 "Sulfonamide und Corticosteroide, Kombinationen mit Antibiotika"
* $atc|2021#G01BF "Imidazol-Derivate und Corticosteroide"
* $atc|2021#H02 "CORTICOSTEROIDE ZUR SYSTEMISCHEN ANWENDUNG"
* $atc|2021#H02A "CORTICOSTEROIDE ZUR SYSTEMISCHEN ANWENDUNG, REIN"
* $atc|2021#H02AA "Mineralocorticoide"
* $atc|2021#H02AA01 "Aldosteron"
* $atc|2021#H02AA02 "Fludrocortison"
* $atc|2021#H02AA03 "Desoxycorton"
* $atc|2021#H02AB "Glucocorticoide"
* $atc|2021#H02AB01 "Betamethason"
* $atc|2021#H02AB02 "Dexamethason"
* $atc|2021#H02AB03 "Fluocortolon"
* $atc|2021#H02AB04 "Methylprednisolon"
* $atc|2021#H02AB05 "Paramethason"
* $atc|2021#H02AB06 "Prednisolon"
* $atc|2021#H02AB07 "Prednison"
* $atc|2021#H02AB08 "Triamcinolon"
* $atc|2021#H02AB09 "Hydrocortison"
* $atc|2021#H02AB10 "Cortison"
* $atc|2021#H02AB11 "Prednyliden"
* $atc|2021#H02AB12 "Rimexolon"
* $atc|2021#H02AB13 "Deflazacort"
* $atc|2021#H02AB14 "Cloprednol"
* $atc|2021#H02AB15 "Meprednison"
* $atc|2021#H02AB17 "Cortivazol"
* $atc|2021#H02AB51 "Betamethason-Depot"
* $atc|2021#H02AB54 "Methylprednisolon-Depot"
* $atc|2021#H02AB56 "Prednisolon-Depot"
* $atc|2021#H02AB58 "Triamcinolon-Depot"
* $atc|2021#H02B "CORTICOSTEROIDE ZUR SYSTEMISCHEN ANWENDUNG, KOMBINATIONEN"
* $atc|2021#H02BX "Corticosteroide zur systemischen Anwendung, Kombinationen"
* $atc|2021#H02BX01 "Methylprednisolon, Kombinationen"
* $atc|2021#H02BX02 "Dexamethason, Kombinationen"
* $atc|2021#H02BX06 "Prednisolon, Kombinationen"
* $atc|2021#H02BX08 "Triamcinolon, Kombinationen"
* $atc|2021#H02BX09 "Betamethason, Kombinationen"
* $atc|2021#H02BX20 "Kombinationen"
* $atc|2021#H02BX21 "Desoxycorton, Kombinationen"
* $atc|2021#H02C "NEBENNIERENHEMMSTOFFE"
* $atc|2021#H02CA "Anticorticosteroide"
* $atc|2021#H02CA01 "Trilostan"
* $atc|2021#H02CA02 "Osilodrostat"
* $atc|2021#H02CA03 "Ketoconazol"
* $atc|2021#M01BA "Antiphlogistika/Antirheumatika in Kombination mit Corticosteroiden"
* $atc|2021#M01BA01 "Phenylbutazon und Corticosteroide"
* $atc|2021#M01BA02 "Dipyrocetyl und Corticosteroide"
* $atc|2021#M01BA03 "Acetylsalicylsäure und Corticosteroide"
* $atc|2021#M01BA04 "Mofebutazon und Corticosteroide"
* $atc|2021#M01BA05 "Oxyphenbutazon und Corticosteroide"
* $atc|2021#M01BA06 "Salicylamid und Corticosteroide"
* $atc|2021#M01BA07 "Metamizol und Corticosteroide"
* $atc|2021#M01BA08 "Kebuzon und Corticosteroide"
* $atc|2021#R03AK "Sympathomimetika in Kombination mit Corticosteroiden oder anderen Mitteln, exkl. Anticholinergika"
* $atc|2021#R03AK01 "Epinephrin und andere Mittel bei obstruktiven Atemwegserkrankungen"
* $atc|2021#R03AK02 "Isoprenalin und andere Mittel bei obstruktiven Atemwegserkrankungen"
* $atc|2021#R03AK03 "Fenoterol und Cromoglicinsäure, Dinatriumsalz"
* $atc|2021#R03AK04 "Salbutamol und Cromoglicinsäure, Dinatriumsalz"
* $atc|2021#R03AK05 "Reproterol und Cromoglicinsäure, Dinatriumsalz"
* $atc|2021#R03AK06 "Salmeterol und Fluticason"
* $atc|2021#R03AK07 "Formoterol und Budesonid"
* $atc|2021#R03AK08 "Formoterol und Beclometason"
* $atc|2021#R03AK09 "Formoterol und Mometason"
* $atc|2021#R03AK10 "Vilanterol und Fluticasonfuroat"
* $atc|2021#R03AK11 "Formoterol und Fluticason"
* $atc|2021#R03AK12 "Salmeterol und Budesonid"
* $atc|2021#R03AK13 "Salbutamol und Beclometason"
* $atc|2021#R03AK14 "Indacaterol und Mometason"
* $atc|2021#R03AL "Sympathomimetika in Kombination mit Anticholinergika inkl. Dreifachkombinationen mit Corticosteroiden"
* $atc|2021#R03AL01 "Fenoterol und Ipratropiumbromid"
* $atc|2021#R03AL02 "Salbutamol und Ipratropiumbromid"
* $atc|2021#R03AL03 "Vilanterol und Umeclidiniumbromid"
* $atc|2021#R03AL04 "Indacaterol und Glycopyrroniumbromid"
* $atc|2021#R03AL05 "Formoterol und Aclidiniumbromid"
* $atc|2021#R03AL06 "Olodaterol und Tiotropiumbromid"
* $atc|2021#R03AL07 "Formoterol und Glycopyrroniumbromid"
* $atc|2021#R03AL08 "Vilanterol, Umeclidiniumbromid und Fluticasonfuroat"
* $atc|2021#R03AL09 "Formoterol, Glycopyrroniumbromid und Beclometason"
* $atc|2021#S02B "CORTICOSTEROIDE"
* $atc|2021#S02BA "Corticosteroide"
* $atc|2021#S02BA01 "Hydrocortison"
* $atc|2021#S02BA03 "Prednisolon"
* $atc|2021#S02BA06 "Dexamethason"
* $atc|2021#S02BA07 "Betamethason"
* $atc|2021#S02BA08 "Fluocinolonacetonid"
* $atc|2021#S02BA56 "Dexamethason, Kombinationen"
* $atc|2021#L04AD "Calcineurin-Inhibitoren"
* $atc|2021#L04AD01 "Ciclosporin"
* $atc|2021#L04AD02 "Tacrolimus"
* $atc|2021#L04AD03 "Voclosporin"
* $atc|2021#L04AB "Tumornekrosefaktor alpha(TNF-alpha)-Inhibitoren"
* $atc|2021#L04AB01 "Etanercept"
* $atc|2021#L04AB02 "Infliximab"
* $atc|2021#L04AB03 "Afelimomab"
* $atc|2021#L04AB04 "Adalimumab"
* $atc|2021#L04AB05 "Certolizumab pegol"
* $atc|2021#L04AB06 "Golimumab"
* $atc|2021#L04AB07 "Opinercept"
* $atc|2021#L04AC "Interleukin-Inhibitoren"
* $atc|2021#L04AC01 "Daclizumab"
* $atc|2021#L04AC02 "Basiliximab"
* $atc|2021#L04AC03 "Anakinra"
* $atc|2021#L04AC04 "Rilonacept"
* $atc|2021#L04AC05 "Ustekinumab"
* $atc|2021#L04AC07 "Tocilizumab"
* $atc|2021#L04AC08 "Canakinumab"
* $atc|2021#L04AC09 "Briakinumab"
* $atc|2021#L04AC10 "Secukinumab"
* $atc|2021#L04AC11 "Siltuximab"
* $atc|2021#L04AC12 "Brodalumab"
* $atc|2021#L04AC13 "Ixekizumab"
* $atc|2021#L04AC14 "Sarilumab"
* $atc|2021#L04AC15 "Sirukumab"
* $atc|2021#L04AC16 "Guselkumab"
* $atc|2021#L04AC17 "Tildrakizumab"
* $atc|2021#L04AC18 "Risankizumab"
* $atc|2021#L04AC19 "Satralizumab"
* $atc|2021#L04AC20 "Netakimab"
* $atc|2021#L04AC21 "Bimekizumab"
* $atc|2021#L03AB "Interferone"
* $atc|2021#L03AB01 "Interferon alfa, natürlich"
* $atc|2021#L03AB02 "Interferon beta, natürlich"
* $atc|2021#L03AB03 "Interferon gamma"
* $atc|2021#L03AB04 "Interferon alfa-2a"
* $atc|2021#L03AB05 "Interferon alfa-2b"
* $atc|2021#L03AB06 "Interferon alfa-n1"
* $atc|2021#L03AB07 "Interferon beta-1a"
* $atc|2021#L03AB08 "Interferon beta-1b"
* $atc|2021#L03AB09 "Interferon alfacon-1"
* $atc|2021#L03AB10 "Peginterferon alfa-2b"
* $atc|2021#L03AB11 "Peginterferon alfa-2a"
* $atc|2021#L03AB12 "Albinterferon alfa-2b"
* $atc|2021#L03AB13 "Peginterferon beta-1a"
* $atc|2021#L03AB14 "Cepeginterferon alfa-2b"
* $atc|2021#L03AB15 "Ropeginterferon alfa-2b"
* $atc|2021#L03AB18 "Interferon gamma-1b"
* $atc|2021#L03AB60 "Peginterferon alfa-2b, Kombinationen"
* $atc|2021#L03AB61 "Peginterferon alfa-2a, Kombinationen"
* $atc|2021#A12CB "Zink"
* $atc|2021#A12CB01 "Zinksulfat"
* $atc|2021#A12CB02 "Zinkgluconat"
* $atc|2021#A12CB03 "Zinkprotein-Komplex"
* $atc|2021#A12CB05 "Zinkhydrogenaspartat"
* $atc|2021#A12CB06 "Zinkorotat"
* $atc|2021#D01AC20 "Imidazole/Triazole in Kombination mit Corticosteroiden"
* $atc|2021#J05AE08 "Atazanavir"
* $atc|2021#J05AR15 "Atazanavir und Cobicistat"
* $atc|2021#J05AR23 "Atazanavir und Ritonavir"
* $atc|2021#J05AE10 "Darunavir"
* $atc|2021#J05AR14 "Darunavir und Cobicistat"
* $atc|2021#J05AR22 "Emtricitabin, Tenofoviralafenamid, Darunavir und Cobicistat"
* $atc|2021#P01BA01 "Chloroquin"
* $atc|2021#P01BA02 "Hydroxychloroquin"
* $atc|2021#P02CF01 "Ivermectin"
* $atc|2021#D11AX22 "Ivermectin"
* $atc|2021#J05AR10 "Lopinavir und Ritonavir"
* $atc|2021#J05AB06 "Ganciclovir"
* $atc|2021#S01AD09 "Ganciclovir"
* $atc|2021#J05AH02 "Oseltamivir"
* $atc|2021#J05AP01 "Ribavirin"
* $atc|2021#B02AB04 "Camostat"
* $atc|2021#J05AX27 "Favipiravir"
* $atc|2021#S01XA18 "Ciclosporin"
* $atc|2021#D11AH01 "Tacrolimus"
* $atc|2021#L04AA10 "Sirolimus"
* $atc|2021#L04AA18 "Everolimus"
* $atc|2021#L01XE10 "Everolimus"
* $atc|2021#L01XE18 "Ruxolitinib"
* $atc|2021#M04AC01 "Colchicin"
* $atc|2021#S01AD05 "Interferon"
* $atc|2021#A11CC06 "Calcifediol"
//2022
* include codes from system $atc|2022
    where concept is-a #N02B
* include codes from system $atc|2022
    where concept is-a #G01B
* include codes from system $atc|2022
    where concept is-a #H02
* include codes from system $atc|2022
    where concept is-a #M01BA
* include codes from system $atc|2022
    where concept is-a #R03AK
* include codes from system $atc|2022
    where concept is-a #R03AL
* include codes from system $atc|2022
    where concept is-a #S02B
* include codes from system $atc|2022
    where concept is-a #L04AD
* include codes from system $atc|2022
    where concept is-a #L04AB
* include codes from system $atc|2022
    where concept is-a #L04AC
* include codes from system $atc|2022
    where concept is-a #L03AB
* include codes from system $atc|2022
    where concept is-a #A12CB
* $atc|2022#D01AC20 "Imidazole/Triazole in Kombination mit Corticosteroiden"
* $atc|2022#J05AE08 "Atazanavir"
* $atc|2022#J05AR15 "Atazanavir und Cobicistat"
* $atc|2022#J05AR23 "Atazanavir und Ritonavir"
* $atc|2022#J05AE10 "Darunavir"
* $atc|2022#J05AR14 "Darunavir und Cobicistat"
* $atc|2022#J05AR22 "Emtricitabin, Tenofoviralafenamid, Darunavir und Cobicistat"
* $atc|2022#P01BA01 "Chloroquin"
* $atc|2022#P01BA02 "Hydroxychloroquin"
* $atc|2022#P02CF01 "Ivermectin"
* $atc|2022#D11AX22 "Ivermectin"
* $atc|2022#J05AR10 "Lopinavir und Ritonavir"
* $atc|2022#J05AB06 "Ganciclovir"
* $atc|2022#S01AD09 "Ganciclovir"
* $atc|2022#J05AH02 "Oseltamivir"
* $atc|2022#J05AP01 "Ribavirin"
* $atc|2022#B02AB04 "Camostat"
* $atc|2022#J05AX27 "Favipiravir"
* $atc|2022#S01XA18 "Ciclosporin"
* $atc|2022#D11AH01 "Tacrolimus"
* $atc|2022#L04AA10 "Sirolimus"
* $atc|2022#L04AA18 "Everolimus"
* $atc|2022#L01EG02 "Everolimus"
* $atc|2022#L01EJ01 "Ruxolitinib"
* $atc|2022#M04AC01 "Colchicin"
* $atc|2022#S01AD05 "Interferon"
* $atc|2022#A11CC06 "Calcifediol"
* $atc|2022#J06BD07	"Casirivimab und Imdevimab"