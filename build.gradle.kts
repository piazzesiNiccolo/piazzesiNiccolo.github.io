import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalDistributionDsl

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.spotless)
}

val distributions = extensions.getByType<BasePluginExtension>().distsDirectory

kotlin {
    js(IR) {
        browser {
            @OptIn(ExperimentalDistributionDsl::class)
            distribution { outputDirectory = distributions }
        }
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.html.core)
                implementation(compose.html.svg)
            }
        }
    }
}

spotless {
    kotlin {
        ktlint()
            .editorConfigOverride(
                mapOf("ktlint_function_naming_ignore_when_annotated_with" to "Composable"),
            )

        endWithNewline()
        trimTrailingWhitespace()
        target("**/*.kt")
    }
    kotlinGradle {
        target("**/*.gradle.kts")
        ktlint()
        endWithNewline()
        trimTrailingWhitespace()
    }
}
