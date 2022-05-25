### Transaction Bundle

The bundle of type 'transaction' is used to collect the set of resources as part of the GECCO dataset into a single instance for data exchange.

---

**Profile - GECCO Bundle**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/gecco-bundle

**Snapshot**

{{tree:ForschungsnetzCovid-19/GeccoBundle, snapshot}}

---

**Profile - GECCO Bundle NUM-CODEX**

This is a GECCO-Bundle for the NUM-CODEX use case. The bundle requires that at least a consent for data sharing is included. It is intended to use this bundle internally in the Data Sharing Framework. In contrast to the previous bundle, the type is set to 'batch'.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/gecco-bundle-codex

**Snapshot**

{{tree:ForschungsnetzCovid-19/GeccoBundleCodex, snapshot}}

---

**Examples**

**Bundle**
<br>
Example bundle shortened for display purposes (uses literal references)

{{json:ForschungsnetzCovid-19/Bundle-example}} 

---

**Bundle**
<br>
Example bundle as used in NUM-CODEX (uses logical references)

{{json:ForschungsnetzCovid-19/bundle-num-codex-example}} 