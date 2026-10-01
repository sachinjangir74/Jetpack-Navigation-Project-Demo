# Jetpack Navigation Demo

A modern Android application demonstrating Jetpack Navigation, Fragments, Data Binding, Safe Args, MVVM architecture, and XML-based UI development.

## Tech Stack
- Kotlin 2.4.20
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
- Kotlin Coroutines

## Features
- Splash screen navigation
- Login screen with validation
- Fragment-based navigation
- Navigation Component
- Safe Args
- Data passing between fragments
- Data Binding
- MVVM-oriented project structure
- Custom fragment transitions and animations
- Back-stack navigation

## Navigation Flow
Splash Screen -> Login -> Home -> Animation Fragment

Back navigation:
Animation Fragment -> Home

## Modernization
This project was upgraded from its original legacy Android configuration to a current Android development stack.

- AGP 8.13.2 -> 9.4.0
- Gradle 8.13 -> 9.6.0
- Kotlin 2.3.0 -> 2.4.20-compatible AGP 9 setup
- compileSdk 36 -> 37
- targetSdk 32 -> 37
- Java/JVM 8 -> 17
- Navigation 2.4.2 -> 2.10.2
- Lifecycle 2.4.x -> 2.11.0
- Removed deprecated Jetifier configuration
- Replaced deprecated bundleOf() usage
- Updated Gradle property assignment syntax
- Preserved Data Binding and navigation functionality
- Verified build, installation, launch, navigation, and back-stack behavior on an Android emulator

## Build
On Windows:

.\gradlew.bat assembleDebug

## Package
com.sachin.jetpack_navigation_demo

## Author
Sachin Jangir
