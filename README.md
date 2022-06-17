# Serenity Test excercise

## Description

This Repo is part of a training exercise. I'm trying to create a repo with automatic reports. with Serenity, bdd and cucumber. For a report example go to the test-output folder

## Execute

To execute this repo you have to open a console and navigate to the project directory. Then execute it with Maven command

```sh
$ cd /project/Directory
$ mvn clean verify
```

There are also options to execute using the suite tags


```sh
$ cd /project/Directory
$ mvn clean verify -Dtag@login
$ mvn clean verify -Dtag@homePage
```

## The tecnologies used:

* Maven
* Java 8
* Serenity

## Design Patterns

* BDD
* Page Object Model

## Screenshots

![Screenshot](https://raw.githubusercontent.com/moisesGlb/SerenityBddExcercise/main/screenshots/serenityReport1.png)

![Screenshot](https://raw.githubusercontent.com/moisesGlb/SerenityBddExcercise/main/screenshots/serenityReport2.png)



## Links

To do this excercise i use the [Serenity Starter project](https://github.com/serenity-bdd/serenity-cucumber-starter).