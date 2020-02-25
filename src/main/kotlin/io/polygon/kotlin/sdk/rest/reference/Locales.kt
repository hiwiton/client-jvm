package io.polygon.kotlin.sdk.rest.reference

import kotlinx.serialization.Serializable

/** See [PolygonReferenceRestClient.getSupportedMarketsBlocking] */
suspend fun PolygonReferenceRestClient.getSupportedLocales(): LocalesDTO =
    polygonClient.fetchResult {
        path("v2", "reference", "locales")
    }

@Serializable
data class LocalesDTO(
    val status: String? = null,
    val results: List<LocaleDTO> = emptyList()
)

@Serializable
data class LocaleDTO(
    val locale: String? = null,
    val name: String? = null
)