package xyz.schwaab.f1seats.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TeamDrivers(
    @SerialName("team") val team: Team,
    @SerialName("drivers") val drivers: List<Driver>
)
