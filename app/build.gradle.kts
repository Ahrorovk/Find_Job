plugins {
    id(GradlePlugin.ANDROID_APPLICATION)
    id(GradlePlugin.KOTLIN_ANDROID)
    id(GradlePlugin.KAPT)
    id(GradlePlugin.DAGGER_HILT)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.ahrorovkspace.afkorhackathon"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ahrorovkspace.afkorhackathon"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }
    kotlinOptions {
        jvmTarget = "18"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
dependencies {

    //Lottie
    implementation ("com.airbnb.android:lottie-compose:5.2.0")
    // Android
    implementation(Dependencies.android.lifecycleRuntime)
    implementation(Dependencies.android.navigationRuntime)
    implementation(Dependencies.android.dataStore)
    implementation(Dependencies.android.lifecycleViewmodel)
    implementation(Dependencies.android.ktx)
    implementation(Dependencies.android.material3)
    implementation("io.coil-kt:coil-compose:2.4.0")
    //Coroutines
    implementation(Dependencies.coroutines.android)
    implementation(Dependencies.coroutines.core)
    implementation(Dependencies.coroutines.test)
    // Hilt
    implementation(Dependencies.android.hilt.android)
    kapt(Dependencies.android.hilt.androidCompiler)
    kapt(Dependencies.android.hilt.compiler)
    implementation(Dependencies.android.hilt.navigation)
    // Room
    implementation(Dependencies.android.room.ktx)
    implementation(Dependencies.android.room.runtime)
    kapt(Dependencies.android.room.compiler)
    implementation(Dependencies.android.room.paging)
    // Paging
    implementation(Dependencies.paging.compose)
    implementation(Dependencies.paging.runtime)
    // Retrofit
    implementation(Dependencies.network.retrofit.base)
    implementation(Dependencies.network.retrofit.gsonConverter)
    implementation(Dependencies.network.okHttp.base)
    implementation(Dependencies.network.okHttp.interceptor)
    // Compose
    implementation(Dependencies.compose.icons)
    implementation(Dependencies.compose.material)
    implementation(Dependencies.compose.activity)
    implementation(Dependencies.compose.navigation)
    implementation(Dependencies.compose.constraintLayout)
    implementation(Dependencies.compose.uiToolingPreview)
    implementation(Dependencies.compose.ui)
    implementation(Dependencies.compose.uiTest)
    implementation(Dependencies.compose.junit4)
    // Test
    implementation(Dependencies.test.core)
    implementation(Dependencies.test.coreKtx)
    implementation(Dependencies.test.junit)
    // Accompanist
    implementation(Dependencies.accompanist.animation)
    implementation(Dependencies.accompanist.flowRow)
    implementation(Dependencies.accompanist.systemUiController)
    // Pretty time
    implementation(Dependencies.android.prettyTime)
    implementation(Dependencies.android.dataStore)
    implementation ("com.google.accompanist:accompanist-navigation-material:0.30.0")
    // WorkManager with Coroutines
    implementation("androidx.work:work-runtime-ktx:2.7.1")

    //
    implementation ("com.maxkeppeler.sheets-compose-dialogs:core:1.0.2")
    implementation ("com.maxkeppeler.sheets-compose-dialogs:calendar:1.0.2")
    implementation ("com.maxkeppeler.sheets-compose-dialogs:clock:1.0.2")
    //
    implementation ("com.google.accompanist:accompanist-permissions:0.28.0")
}