plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.atek"
version = "1.0-SNAPSHOT"

// For Download application's libraries.
repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

// Configure the Kotlin Plugin.
kotlin {
    // jvm {} Each block configures one platform.We only has 1 because our application runs on the JVM.
    jvm {
        //Use JDK 11 to compile this project.
        jvmToolchain(11)
        //Gradle also compiles Java source files.
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {

                implementation(compose.desktop.currentOs)

            }
        }
    }
}

//Configure the Compose Desktop Plugin.
compose.desktop {
    application {
        mainClass = "MainKt"
        /*nativeDistributions {
            targetFormats(TargetFormat.Deb)
            packageName = "AtekGate"
            packageVersion = "1.0.0"
        }*/
    }
}
