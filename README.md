# Jetpack Navigation Demo

A Kotlin-based Android application built with XML layouts and Fragments, demonstrating AndroidX Navigation, Data Binding, screen-to-screen data passing, animations, and back-stack navigation.

## Overview

This project demonstrates a structured multi-screen Android application using the Navigation Component and the traditional Views and Fragments approach. It includes a complete navigation flow from a splash screen to login, home, and animation screens, with Data Binding and XML-based UI throughout.

## Tech Stack

- Kotlin
- Android Gradle Plugin 9.4.0
- Gradle 9.6.0
- Android SDK 37
- Java 17
- AndroidX
- Jetpack Navigation 2.10.2
- Lifecycle 2.11.0
- Data Binding
- Material Components
- ConstraintLayout
- XML Layouts
- Fragments

## Key Features

- Splash screen navigation flow
- Login screen with input validation
- Navigation Component with navigation graph
- Fragment-to-fragment navigation
- Data passing between destinations
- XML Data Binding
- Fragment animations and transitions
- Back-stack navigation
- Material-based UI components
- AndroidX lifecycle integration

## Navigation Flow

Splash Screen -> Login -> Home -> Animation Fragment

Back Navigation: Animation Fragment -> Home

## Project Structure

```text
app/
├── src/main/java/com/sachin/jetpack_navigation_demo/
│   └── ui/
│       ├── MainActivity.kt
│       ├── splash/
│       ├── login/
│       ├── home/
│       └── animation/
│
├── src/main/res/
│   ├── layout/
│   ├── navigation/
│   ├── drawable/
│   └── values/
│
└── app/build.gradle
```

## What This Project Demonstrates

- Managing multiple screens with Android Fragments
- Defining navigation destinations and actions
- Passing user-entered data between fragments
- Connecting XML layouts with Data Binding
- Handling navigation history with the back stack
- Creating screen transitions and animations
- Building an Android application with AndroidX and Jetpack libraries

## Author

**Sachin Jangir**

A learning and development project focused on Android application development with Kotlin, AndroidX, Fragments, and Jetpack libraries.



