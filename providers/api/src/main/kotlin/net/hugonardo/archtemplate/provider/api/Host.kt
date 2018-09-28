package net.hugonardo.archtemplate.provider.api

enum class Host(val baseUrl: String) {
    DEBUG("https://api.github.com/"),
    RELEASE("https://api.github.com/");

    companion object {
        fun fromBuildType(buildType: String): Host {
            return Host.valueOf(buildType.toUpperCase())
        }
    }
}
