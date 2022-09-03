### Transaction Bundle

The bundle of type 'transaction' is used to collect the set of resources as part of the GECCO dataset into a single instance for data exchange.

---

**Profile - GECCO Bundle**

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/gecco-bundle

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Bundle-GeccoBundle.json, snapshot}}

---

**Profile - GECCO Bundle NUM-CODEX**

This is a GECCO-Bundle for the NUM-CODEX use case. The bundle requires that at least a consent for data sharing is included. It is intended to use this bundle internally in the Data Sharing Framework. In contrast to the previous bundle, the type is set to 'batch'.

Canonical: https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/gecco-bundle-codex

**Snapshot**

{{tree:de.gecco@1.0.5/package/Profile-Bundle-GeccoBundleCodex.json, snapshot}} 

---

**Examples**

**Bundle**
<br>
Example bundle shortened for display purposes (uses literal references)

{{json:de.gecco@1.0.5/package/examples/GECCO_bundle_short.json}}  

---

**Bundle**
<br>
Example bundle as used in NUM-CODEX (uses logical references)

{{json:de.gecco@1.0.5/package/examples/Bundle-example-num-codex.json}}