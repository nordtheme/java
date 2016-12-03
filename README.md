<p align="center"><img src="https://cdn.rawgit.com/arcticicestudio/nord-java/develop/src/main/assets/nord-java-banner.svg"/></p>

<p align="center"><img src="https://cdn.travis-ci.org/images/favicon-c566132d45ab1a9bcae64d8d90e4378a.svg" width=24 height=24/> <a href="https://travis-ci.org/arcticicestudio/nord-java"><img src="https://img.shields.io/travis/arcticicestudio/nord-java/develop.svg"/></a> <img src="https://circleci.com/favicon.ico" width=24 height=24/> <a href="https://circleci.com/gh/arcticicestudio/nord-java"><img src="https://circleci.com/gh/arcticicestudio/nord-java.svg?style=shield&circle-token=d2d78e04b95f505e0c6a870913f96ee9912bb4c0"/></a> <img src="https://codecov.io/favicon.ico" width=24 height=24/> <a href="https://codecov.io/gh/arcticicestudio/nord-java"><img src="https://codecov.io/gh/arcticicestudio/nord-java/branch/develop/graph/badge.svg"/></a> <img src="https://assets-cdn.github.com/favicon.ico" width=24 height=24/> <a href="https://github.com/arcticicestudio/nord-java/releases/latest"><img src="https://img.shields.io/github/release/arcticicestudio/nord-java.svg"/></a> <a href="https://github.com/arcticicestudio/nord-java/releases/latest"><img src="https://img.shields.io/badge/pre--release---_-blue.svg"/></a> <a href="https://github.com/arcticicestudio/nord/releases/tag/v0.2.0"><img src="https://img.shields.io/badge/Nord-0.2.0-blue.svg"/></a> <img src="http://central.sonatype.org/favicon.ico" width=24 height=24/> <a href="http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.arcticicestudio%22%20AND%20a%3A%22nord-java%22"><img src="https://img.shields.io/maven-central/v/com.arcticicestudio/nord-java.svg"/></a> <img src="https://oss.sonatype.org/favicon.ico"/> <a href="https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/nord-java"><img src="https://img.shields.io/badge/snapshot---_-blue.svg"/></a> <img src="https://bintray.com/favicon.ico" width=24 height=24/> <a href='https://bintray.com/arcticicestudio/Nord/nord-java/_latestVersion'><img src='https://api.bintray.com/packages/arcticicestudio/Nord/nord-java/images/download.svg'></a> <img src="https://oss.jfrog.org/webapp/images/favicon.40285.ico" width=24 height=24/> <a href="https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/nord-java"><img src="https://img.shields.io/badge/artifactory---_-green.svg"/></a></p>

<p align="center">A arctic, north-bluish color palette Java library.<br>
Implementation of the <a href="https://github.com/arcticicestudio/nord">Nord</a> project.</p>

---

## Getting started
### Setup
To use nord-java, it must be available on your classpath.  
You can get it from the <img src="http://central.sonatype.org/favicon.ico" width=16 height=16/> <a href="https://search.maven.org">Central Repository</a> as a dependency for your favorite build tool or [download the latest version](https://github.com/arcticicestudio/nord-java/releases/latest).

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://maven.apache.org">Apache Maven</a>
```xml
<dependency>
  <groupId>com.arcticicestudio</groupId>
  <artifactId>nord-java</artifactId>
  <version>0.2.0</version>
</dependency>
```

<img src="https://gradle.org/wp-content/uploads/fbrfg/favicon.ico" width=16 height=16/> <a href="https://gradle.org">Gradle</a>
```java
compile(group: 'com.arcticicestudio', name: 'nord-java', version: '0.2.0')
```

<img src="http://apache.org/favicons/favicon.ico" width=16 height=16/> <a href="https://ant.apache.org/ivy">Apache Ivy</a>
```xml
<dependency org="com.arcticicestudio" name="nord-java" rev="0.2.0" />
```

Development snapshots are available via [OSS Sonatype](https://oss.sonatype.org/content/repositories/snapshots/com/arcticicestudio/nord-java) and [JFrog Artifactory](https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/arcticicestudio/nord-java).

### Build
Build and install nord-java into your local repository without GPG signing:  
```
mvn clean install
```

Signed artifacts may be build by using the `sign-gpg` profile with a provided `gpg.keyname` property:
```
mvn clean install -Dgpg.keyname=YourGPGKeyId
```

Continuous integration builds are running at [Travis-CI](https://travis-ci.org/arcticicestudio/nord-java) and [Circle CI](https://circleci.com/bb/arcticicestudio/nord-java).

## Usage Guide
This is a basic guide to show the common usage of the nord-java API.  
The API documentation can be found in the JavaDoc.

The class `Nord` is the entrypoint to the nord-java API, use it to generate the HEX and RGB color codes.
  1. [Generate color code strings](#generate-color-code-strings)
  2. [Obtaining the Public API version](#obtaining-the-public-api-version)

### Generate color code strings
Color code strings can be generated from all `Nord` enum constants by using the static methods `hex(Color)` and `rgb(Color)`.  
The `Color` object can be obtained from a `Nord` enum variable via the `get()` method.  
```java
String hex = Nord.hex(Nord.NORD0.get()); // "#2E3440"
String rgb = Nord.rgb(Nord.NORD8.get()); // "rgb(136, 192, 208)"
```

### Obtaining the Public API version
The `getVersion()` method returns the [ArcVer](https://github.com/arcticicestudio/arcver) version of the public API.
```java
String version = Nord.getVersion(); // "0.2.0"
```

## Development
[![](https://img.shields.io/badge/Changelog-0.2.0-blue.svg)](https://github.com/arcticicestudio/nord-java/blob/v0.2.0/CHANGELOG.md) [![](https://img.shields.io/badge/Workflow-gitflow_Branching_Model-blue.svg)](http://nvie.com/posts/a-successful-git-branching-model) [![](https://img.shields.io/badge/Versioning-ArcVer_0.8.0-blue.svg)](https://github.com/arcticicestudio/arcver)

### Contribution
Please report issues/bugs, feature requests and suggestions for improvements to the [issue tracker](https://github.com/arcticicestudio/nord-java/issues).

<p align="center"><img src="https://cdn.rawgit.com/arcticicestudio/nord/develop/src/assets/banner-footer-mountains.svg"/></p>

<p align="center"> <img src="http://arcticicestudio.com/favicon.ico" width=16 height=16/> Copyright &copy; 2016 Arctic Ice Studio</p>

<p align="center"><a href="http://www.apache.org/licenses/LICENSE-2.0"><img src="https://img.shields.io/badge/License-Apache_2.0-blue.svg"/></a></p>
