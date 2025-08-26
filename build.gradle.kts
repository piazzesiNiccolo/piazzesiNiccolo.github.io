import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalDistributionDsl

plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinMultiplatform)
}
val distributions = extensions.getByType<BasePluginExtension>().distsDirectory

kotlin {
    js(IR) {
        browser {
            @OptIn(ExperimentalDistributionDsl::class)
            distribution {
                outputDirectory = distributions
            }
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