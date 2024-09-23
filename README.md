# CalculatorLibrary

A Kotlin Multiplatform library that provides basic calculator functions: addition, subtraction, and multiplication. This library can be used in both Android and iOS applications.

## Getting Started

### Prerequisites

- **Kotlin**: Ensure you have Kotlin installed (version 2.0.0 or later).
- **Android Studio**: Required for building the Android part of the library.
- **Xcode**: Required for building the iOS part of the library (Mac only).

### Project Structure
### Building the Library

#### For Android

1. Open the project in **Android Studio**.
2. Sync the Gradle files by clicking on **"Sync Now"** if prompted.
3. To build the Android library (.aar file), run the following command in the terminal:

   ```bash
   ./gradlew assembleRelease

   The generated .aar file will be located in: build/outputs/aar/

#### For iOS
Note: The iOS framework can only be generated on a Mac.

Open the project in a terminal on your Mac.

### Run the following command to build the iOS framework: ./gradlew assemble
The generated .framework file will be located in one of the following directories, depending on the architecture you are targeting:

build/bin/iosX64/releaseFramework/
build/bin/iosArm64/releaseFramework/
build/bin/iosSimulatorArm64/releaseFramework/


### Usage

##### Android
You can add the generated .aar file to your Android project as a dependency.

##### iOS
Import the generated .framework file into your Xcode project.
