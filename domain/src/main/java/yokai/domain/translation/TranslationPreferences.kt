
package yokai.domain.translation

import uy.kohesive.injekt.api.InjektModule
import uy.kohesive.injekt.api.InjektRegistrar
import uy.kohesive.injekt.api.addSingleton
import yokai.domain.base.BasePreferences
import yokai.domain.base.PreferenceStore

class TranslationPreferences(
    private val preferenceStore: PreferenceStore,
) : BasePreferences {
    fun translateFrom() = preferenceStore.getString("translate_from", "en")
    fun translateTo() = preferenceStore.getString("translate_to", "en")
    fun translationModels() = preferenceStore.getString("translation_models", "ml-kit")
    fun translateAfterDownloading() = preferenceStore.getBoolean("translate_after_downloading", false)
}

class TranslationModule : InjektModule {
    override fun InjektRegistrar.registerInjectables() {
        addSingleton(::TranslationPreferences)
    }
}
