import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}

group = "com.refanzzzz.waterquality"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")
        }
    }
}

kotlin {
    configAsKobwebApplication("water_quality")

    sourceSets {
        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            implementation(libs.kobwebx.markdown)
//            implementation(project(":worker"))

            // Ktor Client
            implementation("io.ktor:ktor-client-core:3.2.2")
            implementation("io.ktor:ktor-client-js:3.2.2")
            implementation("io.ktor:ktor-client-logging:3.2.2")
            implementation("io.ktor:ktor-client-content-negotiation:3.2.2")
            implementation("io.ktor:ktor-serialization-kotlinx-json:3.2.2")

            // Koin DI
            implementation("io.insert-koin:koin-core:4.0.3")
            implementation("io.insert-koin:koin-compose:4.0.3")
        }
    }
}
