plugins {
    id("composeapplication.android.library.compose")
    id("composeapplication.android.feature")
}

android {
    namespace = "com.example.composeapplication.onboarding.presentation"
}

dependencies {
    implementation(libs.androidx.compose.material3)
    implementation(project(":onboarding:onboarding_domain"))
}