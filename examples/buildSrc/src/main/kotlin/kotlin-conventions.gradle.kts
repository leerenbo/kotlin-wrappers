import org.jetbrains.kotlin.gradle.tasks.Kotlin2JsCompile
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

plugins {
    kotlin("multiplatform")
    kotlin("plugin.js-plain-objects")
    id("io.github.turansky.seskar")
    id("kotlin-test-conventions")
}

kotlin.js {
    moduleName = project.name

    browser {
        commonWebpackConfig {
            outputFileName = "index.js"
        }
    }

    binaries.executable()
}

tasks.withType<KotlinCompilationTask<*>>().configureEach {
    compilerOptions {
        allWarningsAsErrors = true

        freeCompilerArgs.addAll(
            "-opt-in=kotlin.js.ExperimentalJsExport",
        )
    }
}

tasks.withType<Kotlin2JsCompile>().configureEach {
    compilerOptions {
        target = "es2015"
    }
}
