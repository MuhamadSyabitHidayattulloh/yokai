
package yokai.presentation.settings.screen

import androidx.compose.runtime.Composable
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.compose.stringResource
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.persistentMapOf
import uy.kohesive.injekt.injectLazy
import yokai.domain.translation.TranslationPreferences
import yokai.i18n.MR
import yokai.presentation.component.preference.Preference

object SettingsTranslationsScreen : yokai.presentation.settings.ComposableSettings {
    @Composable
    override fun getTitleRes(): StringResource = MR.strings.translations

    @Composable
    override fun getPreferences(): List<Preference> {
        val translationPreferences: TranslationPreferences by injectLazy()

        return persistentListOf(
            getTranslationsGroup(translationPreferences = translationPreferences),
        )
    }

    @Composable
    private fun getTranslationsGroup(translationPreferences: TranslationPreferences): Preference.PreferenceGroup {
        return Preference.PreferenceGroup(
            title = stringResource(MR.strings.translations),
            preferenceItems = persistentListOf(
                Preference.PreferenceItem.ListPreference(
                    pref = translationPreferences.translateFrom(),
                    title = stringResource(MR.strings.translate_from),
                    entries = persistentMapOf(
                        "en" to "English",
                        "zh" to "Chinese",
                        "ja" to "Japanese",
                        "ko" to "Korean",
                    ),
                ),
                Preference.PreferenceItem.ListPreference(
                    pref = translationPreferences.translateTo(),
                    title = stringResource(MR.strings.translate_to),
                    entries = persistentMapOf(
                        "af" to "Afrikaans",
                        "sq" to "Albanian",
                        "ca" to "Catalan",
                        "zh" to "Chinese",
                        "hr" to "Croatian",
                        "cs" to "Czech",
                        "da" to "Danish",
                        "nl" to "Dutch",
                        "en" to "English",
                        "et" to "Estonian",
                        "fi" to "Finnish",
                        "fr" to "French",
                        "de" to "German",
                        "hu" to "Hungarian",
                        "is" to "Icelandic",
                        "id" to "Indonesian",
                        "it" to "Italian",
                        "ja" to "Japanese",
                        "ko" to "Korean",
                        "lv" to "Latvian",
                        "lt" to "Lithuanian",
                        "ms" to "Malay",
                        "no" to "Norwegian",
                        "pl" to "Polish",
                        "pt" to "Portuguese",
                        "ro" to "Romanian",
                        "sr" to "Serbian (Latin)",
                        "sk" to "Slovak",
                        "sl" to "Slovenian",
                        "es" to "Spanish",
                        "sv" to "Swedish",
                        "tr" to "Turkish",
                        "vi" to "Vietnamese",
                    ),
                ),
                Preference.PreferenceItem.ListPreference(
                    pref = translationPreferences.translationModels(),
                    title = stringResource(MR.strings.translation_models),
                    entries = persistentMapOf(
                        "ml-kit" to "ML-Kit",
                        "google-translate" to "Google Translate",
                    ),
                ),
                Preference.PreferenceItem.SwitchPreference(
                    pref = translationPreferences.translateAfterDownloading(),
                    title = stringResource(MR.strings.translate_after_downloading),
                ),
            ),
        )
    }
}
