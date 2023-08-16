plugins {
    id("composeapplication.android.library.compose")
    id("composeapplication.android.feature")
}

android {
    namespace = "com.example.composeapplication.onboarding.presentation"
}

dependencies {
    implementation(project(":onboarding:onboarding_domain"))
    implementation(project(":core-ui"))
    implementation(project(":core"))
}