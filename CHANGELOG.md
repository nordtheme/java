<p align="center"><img src="https://cdn.rawgit.com/arcticicestudio/nord-java/develop/src/main/assets/nord-java-banner.svg"/></p>

<p align="center"><img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> <a href="https://github.com/arcticicestudio/nord-java/releases/latest"><img src="https://img.shields.io/github/release/arcticicestudio/nord-java.svg"/></a> <a href="https://github.com/arcticicestudio/nord-java/releases/latest"><img src="https://img.shields.io/badge/pre--release---_-blue.svg"/></a> <a href="https://github.com/arcticicestudio/nord/releases/tag/v0.2.0"><img src="https://img.shields.io/badge/Nord-0.2.0-blue.svg"/></a> <img src="http://central.sonatype.org/favicon.ico" width=24 height=24/> <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22nord-java%22"><img src="https://img.shields.io/maven-central/v/com.arcticicestudio/nord-java.svg"/></a> <img src="https://oss.sonatype.org/favicon.ico"/> <a href="https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/nord-java"><img src="https://img.shields.io/badge/snapshot-0.2.0--SNAPSHOT-blue.svg"/></a> <img src="https://bintray.com/favicon.ico" width=24 height=24/> <a href='https://bintray.com/arcticicestudio/Nord/nord-java/_latestVersion'><img src='https://api.bintray.com/packages/arcticicestudio/Nord/nord-java/images/download.svg'></a> <img src="https://oss.jfrog.org/webapp/images/favicon.40285.ico" width=24 height=24/> <a href="https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/nord-java"><img src="https://img.shields.io/badge/artifactory-0.2.0--SNAPSHOT-green.svg"/></a></p>

---

# 0.1.0 (2016-09-26)
## Features
Implemented the public API (@arcticicestudio, #1, 8949a9baa7adf73be66b7ac8e15dfa2b57b0ac92)  
A basic usage guide for the public API can be found in the [README](https://github.com/arcticicestudio/nord-java/blob/develop/README.md#usage-guide) section.

### API
The entrypoint is the `com.arcticicestudio.nord.Nord` enum.  
Every enum constant represents a color as `Color` object.

The API provides static methods to get the HEX and RGB color code string as well as the `Color` object itself.

| Package | Entity | Modifier | Method | Description |
| ------------ | -------- | ------------ | ----------- |
| `com.arcticicestudio.nord` | `Nord` | static | `+ hex(Color) : String` | Converts the `color` to the HEX identifier. |
| `com.arcticicestudio.nord` | `Nord` | static | `+ rgb(Color) : String` | Converts the `color` to the RGB identifier. |
| `com.arcticicestudio.nord` | `Nord` | - | `+ get() : Color` | Returns the color object. |
