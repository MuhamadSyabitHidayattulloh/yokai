
package eu.kanade.tachiyomi.ui.setting.controllers

import eu.kanade.tachiyomi.ui.setting.SettingsComposeController
import yokai.presentation.settings.ComposableSettings
import yokai.presentation.settings.screen.SettingsTranslationsScreen

class SettingsTranslationsController : SettingsComposeController() {
    override fun getComposableSettings(): ComposableSettings = SettingsTranslationsScreen
}
