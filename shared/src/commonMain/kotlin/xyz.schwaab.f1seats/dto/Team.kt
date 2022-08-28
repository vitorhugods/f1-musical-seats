package xyz.schwaab.f1seats.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Team(
    @SerialName("name") val name: String,
    @SerialName("mainColorRGB") val mainColorRGB: String,
    @SerialName("logoUrl") val logoUrl: String
)
