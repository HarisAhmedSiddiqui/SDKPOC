plugins {
    kotlin("multiplatform") version "1.9.0" // Specify Kotlin version
    id("com.android.library")
}

kotlin {
    androidTarget() // Use androidTarget() for Android

    // Use the ios() DSL which covers all iOS targets
    ios {
        binaries {
            framework {
                baseName = "PocSDKCalculator"
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                // Shared dependencies for Android and iOS
            }
        }
        val androidMain by getting {
            dependencies {
                // Android-specific dependencies
            }
        }
        val iosMain by getting {
            dependencies {
                // iOS-specific dependencies
            }
        }

        // Tests
        val commonTest by getting
        val androidUnitTest by getting
        val iosTest by getting
    }
}

android {
    namespace = "com.poc.calculator" // Replace with your package name

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

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
