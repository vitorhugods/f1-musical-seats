package xyz.schwaab.f1seats.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Driver(
    @SerialName("name") val name: String,
    @SerialName("photoUrl") val photoUrl: String
)
