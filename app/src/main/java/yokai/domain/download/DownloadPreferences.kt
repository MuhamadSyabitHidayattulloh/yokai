package yokai.domain.download

import eu.kanade.tachiyomi.core.preference.PreferenceStore

class DownloadPreferences(
    private val preferenceStore: PreferenceStore,
) {
    fun downloadWithId() = preferenceStore.getBoolean("download_with_id", false)

    fun concurrentDownloadManga() = preferenceStore.getInt("concurrent_download_manga", 5)

    fun concurrentDownloadMangaPerSource() = preferenceStore.getInt("concurrent_download_manga_per_source", 5)
}
