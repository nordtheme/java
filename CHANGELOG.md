<p align="center">
  <a href="https://www.nordtheme.com" target="_blank">
    <picture>
      <source srcset="https://raw.githubusercontent.com/nordtheme/assets/main/static/images/logos/heroes/logo-typography/dark/frostic/nord3/spaced.svg?sanitize=true" width="100%" media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)" />
      <source srcset="https://raw.githubusercontent.com/nordtheme/assets/main/static/images/logos/heroes/logo-typography/light/frostic/nord6/spaced.svg?sanitize=true" width="100%" media="(prefers-color-scheme: dark)" />
      <img src="https://raw.githubusercontent.com/nordtheme/assets/main/static/images/logos/heroes/logo-typography/dark/frostic/nord3/spaced.svg?sanitize=true" width="100%" />
    </picture>
  </a>
</p>

<p align="center"><img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> <a href="https://github.com/arcticicestudio/nord-java/releases/latest"><img src="https://img.shields.io/github/release/arcticicestudio/nord-java.svg"/></a> <a href="https://github.com/arcticicestudio/nord-java/releases/latest"><img src="https://img.shields.io/badge/pre--release---_-blue.svg"/></a> <a href="https://github.com/arcticicestudio/nord/releases/tag/v0.2.0"><img src="https://img.shields.io/badge/Nord-0.2.0-blue.svg"/></a> <img src="http://central.sonatype.org/favicon.ico" width=24 height=24/> <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22nord-java%22"><img src="https://img.shields.io/maven-central/v/com.arcticicestudio/nord-java.svg"/></a> <img src="https://oss.sonatype.org/favicon.ico"/> <a href="https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/nord-java"><img src="https://img.shields.io/badge/snapshot-0.2.0--SNAPSHOT-blue.svg"/></a> <img src="https://bintray.com/favicon.ico" width=24 height=24/> <a href='https://bintray.com/arcticicestudio/Nord/nord-java/_latestVersion'><img src='https://api.bintray.com/packages/arcticicestudio/Nord/nord-java/images/download.svg'></a> <img src="https://oss.jfrog.org/webapp/images/favicon.40285.ico" width=24 height=24/> <a href="https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/nord-java"><img src="https://img.shields.io/badge/artifactory-0.2.0--SNAPSHOT-green.svg"/></a></p>

# 0.2.0 (2016-12-03)

## Improvements

### Public API

The public API method `getVersion() : String` is now static and returns the `String` constant `VERSION` to adapt to the SonarQube minor rule [squid:S3400](https://sonarqube.com/coding_rules#q=squid%3AS3400).
The associated unit test has been refactored to test against the [ArcVer](https://github.com/arcticicestudio/arcver) library [arcver-java](https://github.com/arcticicestudio/arcver). (@arcticicestudio, #8, 7efc44cc)

The attribute

```java
private final Color COLOR;
```

conflicted with the SonarQube rule [squid:S00116](https://sonarqube.com/coding_rules#q=squid%3AS00116) and has been adapted to the Arctic Ice Studio Java code style. (@arcticicestudio, #9, 8eb03e63)

### Toolbox

Fixed the deprecated POM variable `${inceptionYear}` and replaced it with `${project.inceptionYear}`. (@arcticicestudio, #3, 1a02e6d2)

Added POM profiles for [JFrog Bintray](https://bintray.com) to deploy Maven artifacts to the [jCenter](https://bintray.com/bintray/jcenter) and snapshots to the [OSS JFrog](https://oss.jfrog.org) repository. (@arcticicestudio, #4, f74c7a57)

### Public API Documentation

Adapted the documentation style of the Nord color palette project to the JavaDoc. (@arcticicestudio, #7, 9eab5800)

## Bug Fixes

### Public API Documentation

Fixed malformed JavaDoc to prevent compilation errors caused by the new JavaDoc linter rules introduced JDK 8u92 by adding the `summary` attribute to `table` tags. (@arcticicestudio, #3, 1a02e6d2)

## Tasks

### Toolbox

Created a `circle.yml` configuration file to add [Circle CI](https://circleci.com) build integration. (@arcticicestudio, #6, f241e8de)

Added the `maven-assembly-plugin` as `assemble` POM profile (@arcticicestudio, #5, 9f6e438d)

# 0.1.0 (2016-09-26)

## Features

Implemented the public API (@arcticicestudio, #1, 8949a9baa7adf73be66b7ac8e15dfa2b57b0ac92)  
A basic usage guide for the public API can be found in the [README](https://github.com/arcticicestudio/nord-java/blob/develop/README.md#usage-guide) section.

### API

The entrypoint is the `com.arcticicestudio.nord.Nord` enum.  
Every enum constant represents a color as `Color` object.

The API provides static methods to get the HEX and RGB color code string as well as the `Color` object itself.

| Package                    | Entity | Modifier | Method                  | Description                                 |
| -------------------------- | ------ | -------- | ----------------------- | ------------------------------------------- |
| `com.arcticicestudio.nord` | `Nord` | static   | `+ hex(Color) : String` | Converts the `color` to the HEX identifier. |
| `com.arcticicestudio.nord` | `Nord` | static   | `+ rgb(Color) : String` | Converts the `color` to the RGB identifier. |
| `com.arcticicestudio.nord` | `Nord` | -        | `+ get() : Color`       | Returns the color object.                   |

<p align="center">
  <picture>
    <source srcset="https://raw.githubusercontent.com/nordtheme/assets/main/static/images/elements/separators/iceberg/footer/dark/spaced.svg?sanitize=true" width="100%" media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)" />
    <source srcset="https://raw.githubusercontent.com/nordtheme/assets/main/static/images/elements/separators/iceberg/footer/light/spaced.svg?sanitize=true" width="100%" media="(prefers-color-scheme: dark)" />
    <img src="https://raw.githubusercontent.com/nordtheme/assets/main/static/images/elements/separators/iceberg/footer/dark/spaced.svg?sanitize=true" width="100%" />
  </picture>
</p>

<p align="center">
  Copyright &copy; 2016-present <a href="https://www.svengreb.de" target="_blank">Sven Greb</a>
</p>

<p align="center">
  <a href="https://github.com/nordtheme/java/blob/main/license" target="_blank">
    <img src="https://img.shields.io/static/v1.svg?style=flat-square&label=License&message=MIT&logoColor=eceff4&logo=creativecommons&colorA=4c566a&colorB=88c0d0"/>
  </a>
  <a href="https://www.svengreb.de">
    <img src="https://img.shields.io/static/v1.svg?style=flat-square&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABmJLR0QA/wD/AP+gvaeTAAABMklEQVQ4jcWQvUoDQRRGz52s5IfVIiDWPkGKFFaCIVaGdIagjcFAwICFb7DvIK6QQlNpY2UQLMQVBbEQ0SewFkGbKCQmOzaTJay7/lR+zTAf9xwuF/47Mv45rdezqWEq72v/RWZnHgqOMwDwHMfSj085JSqb6Pu38we7r18E3nqzhmYbsE11rxKsAvhDfQiSM30XYbOw57YDwfnaRl6U3ABWaMNn806H+oGPzBX3d+4UgChZiYBHYBgGsBLoKoAyhR0x9G20Zmpc4P1ZoMQDcwMNclFrdhBKv6M5WWi7ZQGtjEUn35IV4OwnVjSX/WGmKqCDDUa5rmyle3bvGFiMg3WGUsF1u0EXHoqTRMGRgkAy2eugKZrqijRLYThWANBpNDL2h3UE0J0YLJdbrfe42f/NJ0wqY7/KcXKPAAAAAElFTkSuQmCC&label=lovely%20crafted%20in&message=Germany&colorA=4c566a&colorB=88c0d0"/>
  </a>
</p>
