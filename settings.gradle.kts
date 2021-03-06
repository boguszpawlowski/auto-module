rootProject.name = "auto-module"

apply(from = "gradle/include.settings.gradle.kts")

pluginManagement {
    repositories {
        // load self from last build
        maven(url = rootDir.resolve("repo"))
        gradlePluginPortal()
    }
}

plugins {
    id("com.pablisco.gradle.automodule") version "0.13"
}

autoModule {
    // Ignore tests cases and build folder
    ignore(":plugin:build")
    ignore(":demos")
    ignore(":gradle")
    ignore(":plugin:src:test:resources")
    ignore(":plugin:out")
    ignore(":plugin:src")

    pluginRepository(rootDir.resolve("repo"))
}
