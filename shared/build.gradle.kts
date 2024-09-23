plugins {
    kotlin("multiplatform") // No version specified, since it's already on the classpath
    id("com.android.library")
}

kotlin {
    androidTarget() // Use androidTarget() instead of android()

    // Define iOS targets with unique names
    iosX64("iosX64") // iOS simulator for X64
    iosArm64("iosArm64") // iOS device for ARM64
    iosSimulatorArm64("iosSimulatorArm64") // iOS simulator for ARM64

    sourceSets {
        val commonMain by getting {
            dependencies {
                // Shared dependencies
            }
        }
        val androidMain by getting {
            dependencies {
                // Android-specific dependencies
            }
        }
        val iosX64Main by getting {
            dependencies {
                // iOS X64-specific dependencies if any
            }
        }
        val iosArm64Main by getting {
            dependencies {
                // iOS ARM64-specific dependencies if any
            }
        }
        val iosSimulatorArm64Main by getting {
            dependencies {
                // iOS Simulator ARM64-specific dependencies if any
            }
        }
        val commonTest by getting
        val androidUnitTest by getting
        val androidInstrumentedTest by getting

        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
    }
}

android {
    namespace = "com.poc.calculator" // Make sure to replace with your own package

    compileSdk = 33
    defaultConfig {
        minSdk = 21
        targetSdk = 33
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

// Set the Kotlin options for the Android compilation tasks
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8" // or "17"
    }
}
