plugins {
    id("composeapplication.android.library.compose")
    id("composeapplication.android.library")
}

android {
    namespace = "com.example.composeapplication.core.ui"
}

dependencies {
    implementation(libs.androidx.ui.unit.android)
    implementation(libs.androidx.compose.runtime)
}

