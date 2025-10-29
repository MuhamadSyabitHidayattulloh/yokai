
package eu.kanade.tachiyomi.data.translation.model

sealed class Translation {
    @Suppress("unused")
    enum class State {
        NOT_TRANSLATED,
        TRANSLATING,
        TRANSLATED,
        ERROR,
    }
}
