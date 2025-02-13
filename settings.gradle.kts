pluginManagement {
    fun PluginResolveDetails.applyPluginVersion(property: String) {
        gradle.rootProject.extra[property]?.let {
            useVersion(it as String)
        }
    }

    resolutionStrategy {
        eachPlugin {
            val pluginId = requested.id.id
            if (pluginId == "io.ktor.plugin") {
                applyPluginVersion("ktor_version")
            } else if (pluginId.startsWith("org.jetbrains.kotlin")) {
                applyPluginVersion("kotlin_version")
            }
        }
    }
}

rootProject.name = "Conversate Backend"
