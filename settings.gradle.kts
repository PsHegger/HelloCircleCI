rootProject.buildFileName = "build.gradle.kts"

include(":app")

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}
