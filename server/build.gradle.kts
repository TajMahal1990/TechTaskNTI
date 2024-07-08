plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    "koin:koin.gradle.plugin:3.1.5"
}

android {
    namespace = "com.example.server"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.ui.desktop)
    implementation(project(":ui"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.compose.ui:ui:1.1.1")
    implementation ("androidx.compose.material:material:1.1.1")
    implementation ("androidx.compose.ui:ui-tooling-preview:1.1.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation ("androidx.activity:activity-compose:1.4.0")
    implementation ("io.ktor:ktor-server-core:2.0.1")
    implementation ("io.ktor:ktor-server-netty:2.0.1")
    implementation ("io.ktor:ktor-server-websockets:2.0.1")
    implementation ("org.koin:koin-android:3.1.5")
    implementation ("org.koin:koin-androidx-viewmodel:3.1.5")
    implementation ("io.insert-koin:koin-android:3.1.5")
    implementation ("io.insert-koin:koin-core:3.1.5")
    implementation ("androidx.room:room-runtime:2.4.2")


}