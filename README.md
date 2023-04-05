# Tervezési minták vizsgálata döntési szerkezet mentén

A projectek a **SonarSource** hivatalos **GitHub** oldalán elérhető [gradle-basic](https://github.com/SonarSource/sonar-scanning-examples/tree/master/sonarqube-scanner-gradle/gradle-basic) projectből építkezik.

## A Gradle-basic projekt dokumentációja

This example demonstrates how to analyze a simple project built with [Gradle](https://gradle.org/).

## Prerequisites

- [SonarQube](http://www.sonarqube.org/downloads/) 9.9 LTS or Latest

- A gradle wrapper is included that bundles gradle. All other required plugins will be pulled by gradle as needed.

## Usage

Run the following command (updating the sonar.host.url property as appropriate):

- On Unix-like systems:

`./gradlew -Dsonar.host.url=http://myhost:9000 sonar`

- On Windows:

`.\gradlew.bat -D'sonar.host.url=http://myhost:9000' sonar`

## Coverage

To get the project [test coverage](https://community.sonarsource.com/t/coverage-test-data-importing-jacoco-coverage-report-in-xml-format) computed, add gradle task `jacocoTestReport` to your command line.

# Projekt struktúra

A projekt a következő könyvtár nevek szerint lett strukturálva:

- 0-RAW CODE
- 1-CHAIN OF RESPONSIBILITY
- 2-COMMAND
- 3-INTERPRETTER
- 4-ITERATOR
- 5-MEDIATOR
- 6-MEMENTO
- 7-OBSERVER
- 8-STATE
- 9-STRATEGY
- 10-TEMPLATE

## 0-RAW CODE

A kód kiindulási állapota a refaktorálandó struktúrával.

## 1 - CHAIN OF RESPONSIBILITY

Újratervezett kód a felelősséglánc programtervezési minta felhasználásával.

## 2 - COMMAND

Újratervezett kód a parancs programtervezési minta felhasználásával.

## 3 - INTERPRETTER

Újratervezett kód az értelmező programtervezési minta felhasználásával.

## 4 - ITERATOR

Újratervezett kód az iterátor programtervezési minta felhasználásával.

## 5 - MEDIATOR

Újratervezett kód a közvetítő programtervezési minta felhasználásával.

## 6 - MEMENTO

Újratervezett kód a mementó programtervezési minta felhasználásával.

## 7 - OBSERVER

Újratervezett kód a megfigyelő programtervezési minta felhasználásával.

## 8 - STATE

Újratervezett kód a állapot programtervezési minta felhasználásával.

## 9 - STRATEGY

Újratervezett kód a stratégia programtervezési minta felhasználásával.

## 10 - TEMPLATE

Újratervezett kód a sablon programtervezési minta felhasználásával.
