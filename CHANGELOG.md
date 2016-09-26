<p align="center"><img src="https://cdn.rawgit.com/arcticicestudio/nord-java/develop/src/main/assets/nord-java-banner.svg"/></p>

<p align="center"><img src="https://cdn.travis-ci.org/images/favicon-c566132d45ab1a9bcae64d8d90e4378a.svg" width=24 height=24/> <a href="https://travis-ci.org/arcticicestudio/nord-java"><img src="https://img.shields.io/travis/arcticicestudio/nord-java/develop.svg"/></a> <img src="https://codecov.io/favicon.ico" width=24 height=24/> <a href="https://codecov.io/gh/arcticicestudio/nord-java"><img src="https://codecov.io/gh/arcticicestudio/nord-java/branch/develop/graph/badge.svg"/></a> <img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> <a href="https://github.com/arcticicestudio/nord-java/releases/latest"><img src="https://img.shields.io/github/release/arcticicestudio/nord-java.svg"/></a> <a href="https://github.com/arcticicestudio/nord/releases/tag/v0.2.0"><img src="https://img.shields.io/badge/Nord-0.2.0-blue.svg"/></a> <img src="http://central.sonatype.org/favicon.ico" width=24 height=24/> <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22nord-java%22"><img src="https://img.shields.io/maven-central/v/com.arcticicestudio/nord-java.svg"/></a> <img src="https://oss.sonatype.org/favicon.ico"/> <a href="https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/nord-java"><img src="https://img.shields.io/badge/snapshot----blue.svg"/></a></p>

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
