<p align="center">
  <a href="https://www.nordtheme.com/ports/java" target="_blank">
    <picture>
      <source srcset="https://raw.githubusercontent.com/nordtheme/java/develop/src/main/assets/nord-java-banner.svg?sanitize=true" width="100%" media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)" />
      <img srcset="https://raw.githubusercontent.com/nordtheme/java/develop/src/main/assets/nord-java-banner.svg?sanitize=true" width="100%" />
    </picture>
  </a>
</p>

<p align="center">
  <a href="https://github.com/nordtheme/java/releases/latest" target="_blank">
    <img src="https://img.shields.io/github/release/nordtheme/java.svg?style=flat-square&label=Release&logo=github&logoColor=eceff4&colorA=4c566a&colorB=88c0d0"/>
  </a>
  <a href="https://www.nordtheme.com/docs/ports/java" target="_blank">
    <img src="https://img.shields.io/github/release/nordtheme/java.svg?style=flat-square&label=Docs&colorA=4c566a&colorB=88c0d0&logo=data%3Aimage%2Fsvg%2Bxml%3Bbase64%2CPHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxNiIgaGVpZ2h0PSIxNiI%2BCiAgICA8cGF0aCBmaWxsPSIjZDhkZWU5IiBkPSJNMTMuNzQ2IDIuODEzYS42Ny42NyAwIDAgMC0uNTU5LS4xMzNMOCAzLjg0OGwtNS4xODgtMS4xOGEuNjY5LjY2OSAwIDAgMC0uNTcuMTMzLjY3Ny42NzcgMCAwIDAtLjI0Mi41MzF2OC4xMzNjLS4wMDguMzIuMjEuNTk4LjUyLjY2OGw1LjMzMiAxLjE5OWguMjk2bDUuMzMyLTEuMmEuNjY4LjY2OCAwIDAgMCAuNTItLjY2N1YzLjMzMmEuNjU5LjY1OSAwIDAgMC0uMjU0LS41MnpNMy4zMzIgNC4xNjhsNCAuODk4djYuNzY2bC00LS44OTh6bTkuMzM2IDYuNzY2bC00IC44OThWNS4wNjZsNC0uODk4em0wIDAiLz4KPC9zdmc%2BCg%3D%3D"/>
  </a>
</p>

<p align="center">
  <a href="https://github.com/nordtheme/nord/releases/tag/v0.2.0" target="_blank">
    <img src="https://img.shields.io/static/v1.svg?style=flat-square&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAABmJLR0QA/wD/AP+gvaeTAAACUklEQVRIibXUQUiTcRjH8e+zvaO0AgPd1mDmNvFVI+ng1UNU1wiDoEIIoUNUdOkQUkER1KWTnRJCLyZBIdEhQvAWQVp5KN9X3bskmHunYbeZbu/TaWXRdOLrc3ue5/f/f/6nP+xwycy8m6y0LGqg0N7UsLB+9jmdbQwZQaNawPBKpCstA3g/7fRCl5k68P7PLNjplRgBQtUAYjmuCriqDP690RqQK8A3WSt1mmZsqbyyM+4pVc5tcvdxYD+W46qVdif/l7Ac95bluGo57piqBqt58e+zaXfSclwNbBQyE+F7KKPAMTuzeGcrQLk2BEREV41dvYAD2jeddrt9BQA6DtYtC3QDKyIM2pmlVl+Bublc2ExGpgS9BuxTLT2byuX2+AYUJTAyPq6GmYwOIPoEOLy7IAO+AYgejTW5dwF2UbiM8kGVs9NO/qo/AGRV5Ybl5E4mEokVT0rdwHdBH9pOvmvbgCd6GlgDGZqddVPtydg8aC9gKDqybaA9EX2nyHWgrhTkxUQ2W9uajL4U0QdAbNsAQFsy3C8wBHTsXQk+BmhpitwE3vgCANSGVi8pfATO207uooh4hqc9vgHxeLzgeXIG+KFIv5Ve7GxujuZ9AwAONYfnVLUHCCHec9vO1vsKALSloq9A7gONhILDm/2yWwYAzETDbeC1wgk7k+/bKCuW4yqwDIxtGBSGzURktNzbdrZeQ8EJIA76CJXCP/kLCpEyUE2VVLWnLRV9Wh7MZPJHPNW3QE2lQ0YgSKpKgLWiV1zftyTCn758XUwZ4lUEdrx+ASW88rx2UJY8AAAAAElFTkSuQmCC&label=Nord&message=v0.2.0&colorA=4c566a&colorB=88c0d0"/>
  </a>
</p>

# 0.2.0 (2016-12-03)

## Improvements

### Public API

The public API method `getVersion() : String` is now static and returns the `String` constant `VERSION` to adapt to the SonarQube minor rule [squid:S3400](https://sonarqube.com/coding_rules#q=squid%3AS3400).
The associated unit test has been refactored to test against the [ArcVer](https://github.com/arcticicestudio/arcver) library [arcver-java](https://github.com/arcticicestudio/arcver). (@svengreb, #8, 7efc44cc)

The attribute

```java
private final Color COLOR;
```

conflicted with the SonarQube rule [squid:S00116](https://sonarqube.com/coding_rules#q=squid%3AS00116) and has been adapted to the Arctic Ice Studio Java code style. (@svengreb, #9, 8eb03e63)

### Toolbox

Fixed the deprecated POM variable `${inceptionYear}` and replaced it with `${project.inceptionYear}`. (@svengreb, #3, 1a02e6d2)

Added POM profiles for [JFrog Bintray](https://bintray.com) to deploy Maven artifacts to the [jCenter](https://bintray.com/bintray/jcenter) and snapshots to the [OSS JFrog](https://oss.jfrog.org) repository. (@svengreb, #4, f74c7a57)

### Public API Documentation

Adapted the documentation style of the Nord color palette project to the JavaDoc. (@svengreb, #7, 9eab5800)

## Bug Fixes

<!--lint ignore no-duplicate-headings-->

### Public API Documentation

Fixed malformed JavaDoc to prevent compilation errors caused by the new JavaDoc linter rules introduced JDK 8u92 by adding the `summary` attribute to `table` tags. (@svengreb, #3, 1a02e6d2)

## Tasks

<!--lint ignore no-duplicate-headings-->

### Toolbox

Created a `circle.yml` configuration file to add [Circle CI](https://circleci.com) build integration. (@svengreb, #6, f241e8de)

Added the `maven-assembly-plugin` as `assemble` POM profile (@svengreb, #5, 9f6e438d)

# 0.1.0 (2016-09-26)

## Features

Implemented the public API (@svengreb, #1, 8949a9baa7adf73be66b7ac8e15dfa2b57b0ac92)  
A basic usage guide for the public API can be found in the [README](https://github.com/nordtheme/java/blob/develop/README.md#usage-guide) section.

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
  <a href="https://github.com/nordtheme/java/blob/develop/license" target="_blank">
    <img src="https://img.shields.io/static/v1.svg?style=flat-square&label=License&message=MIT&logoColor=eceff4&logo=creativecommons&colorA=4c566a&colorB=88c0d0"/>
  </a>
  <a href="https://www.svengreb.de">
    <img src="https://img.shields.io/static/v1.svg?style=flat-square&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAABmJLR0QA/wD/AP+gvaeTAAABMklEQVQ4jcWQvUoDQRRGz52s5IfVIiDWPkGKFFaCIVaGdIagjcFAwICFb7DvIK6QQlNpY2UQLMQVBbEQ0SewFkGbKCQmOzaTJay7/lR+zTAf9xwuF/47Mv45rdezqWEq72v/RWZnHgqOMwDwHMfSj085JSqb6Pu38we7r18E3nqzhmYbsE11rxKsAvhDfQiSM30XYbOw57YDwfnaRl6U3ABWaMNn806H+oGPzBX3d+4UgChZiYBHYBgGsBLoKoAyhR0x9G20Zmpc4P1ZoMQDcwMNclFrdhBKv6M5WWi7ZQGtjEUn35IV4OwnVjSX/WGmKqCDDUa5rmyle3bvGFiMg3WGUsF1u0EXHoqTRMGRgkAy2eugKZrqijRLYThWANBpNDL2h3UE0J0YLJdbrfe42f/NJ0wqY7/KcXKPAAAAAElFTkSuQmCC&label=lovely%20crafted%20in&message=Germany&colorA=4c566a&colorB=88c0d0"/>
  </a>
</p>
