package xyz.schwaab.f1seats.server.confirmed

import xyz.schwaab.f1seats.dto.Driver
import xyz.schwaab.f1seats.dto.Team
import xyz.schwaab.f1seats.dto.TeamDrivers

class ConfirmedDriversController(baseUrl: String) {

    private val baseDriversPath = "$baseUrl/assets/driver/"
    private val baseTeamPath = "$baseUrl/assets/team/"

    fun getConfirmedDrivers(): List<TeamDrivers> = listOf(
        TeamDrivers(
            Team(name = "Ferrari", mainColorRGB = "D40000", logoUrl = teamPicture("ferrari.png")),
            listOf(
                Driver(
                    name = "Carlos Sainz Jr.",
                    photoUrl = driverPicture("sainz.png")
                ),
                Driver(
                    name = "Charles Leclerc",
                    photoUrl = driverPicture("leclerc.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Red Bull Racing", mainColorRGB = "3671c6", logoUrl = teamPicture("rbr.png")),
            listOf(
                Driver(
                    name = "Max Verstappen",
                    photoUrl = driverPicture("verstappen.png")
                ),
                Driver(
                    name = "Sergio Perez",
                    photoUrl = driverPicture("perez.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Red Bull Racing", mainColorRGB = "3671c6", logoUrl = teamPicture("rbr.png")),
            listOf(
                Driver(
                    name = "Max Verstappen",
                    photoUrl = driverPicture("verstappen.png")
                ),
                Driver(
                    name = "Sergio Perez",
                    photoUrl = driverPicture("perez.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Mercedes", mainColorRGB = "6cd3bf", logoUrl = teamPicture("mercedes.png")),
            listOf(
                Driver(
                    name = "George Russell",
                    photoUrl = driverPicture("russell.png")
                ),
                Driver(
                    name = "Lewis Hamilton",
                    photoUrl = driverPicture("hamilton.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Alpine", mainColorRGB = "2293d1", logoUrl = teamPicture("alpine.png")),
            listOf(
                Driver(
                    name = "Esteban Ocon",
                    photoUrl = driverPicture("ocon.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "McLaren", mainColorRGB = "f58020", logoUrl = teamPicture("mclaren.png")),
            listOf(
                Driver(
                    name = "Lando Norris",
                    photoUrl = driverPicture("norris.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Alfa Romeo", mainColorRGB = "c92d4b", logoUrl = teamPicture("alfaromeo.png")),
            listOf(
                Driver(
                    name = "Valteri Bottas",
                    photoUrl = driverPicture("bottas.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Haas", mainColorRGB = "b6babd", logoUrl = teamPicture("haas.png")),
            listOf(
                Driver(
                    name = "Kevin Magnussen",
                    photoUrl = driverPicture("magnussen.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Alpha Tauri", mainColorRGB = "5e8faa", logoUrl = teamPicture("alphatauri.png")),
            listOf(
                Driver(
                    name = "Pierre Gasly",
                    photoUrl = driverPicture("gasly.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Aston Martin", mainColorRGB = "358c75", logoUrl = teamPicture("astonmartin.png")),
            listOf(
                Driver(
                    name = "Lance Stroll",
                    photoUrl = driverPicture("stroll.png")
                ),
                Driver(
                    name = "Fernando Alonso",
                    photoUrl = driverPicture("alonso.png")
                )
            )
        ),
        TeamDrivers(
            Team(name = "Williams", mainColorRGB = "37bedd", logoUrl = teamPicture("williams.png")),
            listOf(
                Driver(
                    name = "Alex Albon",
                    photoUrl = driverPicture("albon.png")
                )
            )
        )
    )

    private fun driverPicture(relativePath: String) = baseDriversPath + relativePath
    private fun teamPicture(relativePath: String) = baseTeamPath + relativePath
}
