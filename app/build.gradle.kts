plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "pe.edu.upc.upet"
    compileSdk = 34

    defaultConfig {
        applicationId = "pe.edu.upc.upet"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.coil.compose)
    implementation(libs.androidx.material)
    implementation(libs.cloudinary.android)

    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    implementation(libs.landscapist.glide)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.material.icons.extended)
    implementation(libs.play.services.tagmanager.v4.impl)
    implementation(libs.play.services.fido)

    implementation(libs.java.jwt)



    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.maps.android:maps-compose:4.4.1")
    implementation("com.google.android.gms:play-services-location:21.2.0")
    implementation ("com.google.android.gms:play-services-maps:18.1.0")

}