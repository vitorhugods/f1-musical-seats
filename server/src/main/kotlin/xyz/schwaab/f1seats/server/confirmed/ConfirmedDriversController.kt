package xyz.schwaab.f1seats.server.confirmed

import xyz.schwaab.f1seats.dto.Driver
import xyz.schwaab.f1seats.dto.Team
import xyz.schwaab.f1seats.dto.TeamDrivers
import xyz.schwaab.f1seats.server.URL

class ConfirmedDriversController {

    fun getConfirmedDrivers(): List<TeamDrivers> = listOf(
        TeamDrivers(
            Team(name = "Ferrari", mainColorRGB = "D40000", logoUrl = "heheh.jpg"),
            listOf(
                Driver(
                    name = "Carlos Sainz Jr.",
                    photoUrl = driverPicture("sainz.png")
                ),
                Driver(
                    name = "Charles Leclerc",
                    photoUrl = driverPicture("charles.png")
                )
            )
        )
    )

    private fun driverPicture(relativePath: String) = BASE_DRIVERS_PATH + relativePath

    private companion object {
        const val BASE_DRIVERS_PATH = "$URL/assets/driver/"
    }
}
