package com.pablisco.gradle.automodule

import org.gradle.api.logging.LogLevel

open class AutoModule(
    /**
     * Used to define the name of the generated file.
     */
    var modulesFileName: String = "modules",
    /**
     * Add the **absolute** path to any module that we want to ignore.
     *
     * @see [ignore]
     */
    var ignored: List<String> = emptyList(),
    /**
     * This is the entry point of the generated module graph.
     */
    var entryPointName: String = "local",
    /**
     * To change the level of logging of autoModule
     */
    var logLevel: LogLevel = LogLevel.INFO,

    /**
     * When enabled then autoModule doesn't generate a new graph if the source code hasn't changed.
     */
    var cacheEnabled: Boolean = true
) {

    /**
     * Adds the **absolute** path to any module that we want to ignore.
     *
     * @see [ignored]
     */
    @Suppress("MemberVisibilityCanBePrivate") // Api
    fun ignore(vararg modules: String) {
        ignored += modules
    }

}
