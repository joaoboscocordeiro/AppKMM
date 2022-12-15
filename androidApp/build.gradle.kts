plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = Namespaces.namespace
    compileSdk = Playstore.compileSdk
    defaultConfig {
        applicationId = Playstore.applicationId
        minSdk = Playstore.minSdk
        targetSdk = Playstore.targetSdk
        versionCode = Playstore.versionCode
        versionName = Playstore.versionName
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))

    // CORE
    implementation(Androidx.core)
    implementation(Androidx.lifecycleRuntime)

    // CORE COMPOSE
    implementation(Compose.ui)
    implementation(Compose.toolingPreview)
    implementation(Compose.foundation)
    implementation(Compose.material)
    implementation(Compose.layout)
    implementation(Compose.themeAdapter)
    implementation(Compose.runtime)
    implementation(Compose.activity)
    implementation(Compose.materialIconsExtended)
    implementation(Compose.shimmer)

    // DEBUGGING
    debugImplementation(Compose.tooling)

    // TESTING
    testImplementation(Test.junit)
    androidTestImplementation(TestUi.extJunit)
}