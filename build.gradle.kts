// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.1.3")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
        // Hilt DI
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
        //Google Service
        classpath ("com.google.gms:google-services:4.3.15")
//        classpath ("com.google.firebase:firebase-crashlytics-gradle:2.9.4")
    }
}
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}