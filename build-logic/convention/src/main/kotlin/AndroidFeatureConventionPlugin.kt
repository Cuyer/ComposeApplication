
import com.example.composeapplication.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class AndroidFeatureConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("composeapplication.android.library")
                apply("composeapplication.android.hilt")
            }

            dependencies {
                add("implementation", project(":core"))
                add("implementation", libs.findLibrary("coil.kt").get())
                add("implementation", libs.findLibrary("coil.kt.compose").get())
                add("implementation", libs.findLibrary("androidx.hilt.navigation.compose").get())
                add("implementation", libs.findLibrary("androidx.lifecycle.runtimeCompose").get())
                add("implementation", libs.findLibrary("androidx.lifecycle.viewModelCompose").get())
                add("implementation", libs.findLibrary("kotlinx.coroutines.android").get())

                add("api", libs.findLibrary("junit4").get())
                add("api", libs.findLibrary("androidx.compose.ui.test").get())
                add("api", libs.findLibrary("mockk").get())
                add("api", libs.findLibrary("mockk-android").get())
                add("api", libs.findLibrary("truth").get())
                add("api", libs.findLibrary("androidx.test.core").get())
                add("api", libs.findLibrary("androidx.test.espresso.core").get())
                add("api", libs.findLibrary("androidx.test.rules").get())
                add("api", libs.findLibrary("androidx.test.runner").get())
                add("api", libs.findLibrary("hilt.android.testing").get())
                add("api", libs.findLibrary("kotlinx.coroutines.test").get())
                add("api", libs.findLibrary("turbine").get())
            }
        }
    }
}