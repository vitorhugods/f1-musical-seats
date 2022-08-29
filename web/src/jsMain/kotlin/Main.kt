import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import xyz.schwaab.f1seats.data.SeatRepository
import xyz.schwaab.f1seats.dto.Driver
import xyz.schwaab.f1seats.dto.Team
import xyz.schwaab.f1seats.dto.TeamDrivers

fun main() {
    var response: List<TeamDrivers> by mutableStateOf(listOf())

    GlobalScope.launch {
        val confirmedDrivers = SeatRepository().fetchConfirmedDrivers()
        println("confirmedDrivers = $confirmedDrivers")
        response = confirmedDrivers
    }

    renderComposable(rootElementId = "root") {
        screen(response)
    }
}

@Composable
private fun screen(response: List<TeamDrivers>) {
    response.forEach { teamInfo ->
        TeamInfo(teamInfo.team)
        Div({
            style {
                display(DisplayStyle.InlineBlock)
            }
        }) {
            teamInfo.drivers.forEach { driver ->
                DriverCard(driver)
            }
        }
    }
}

@Composable
private fun DriverCard(driver: Driver) {
    Div({ style { padding(25.px) } }) {
        Img(driver.photoUrl) {
            style {
                maxHeight(100.px)
            }
        }
        Span() {
            Text(driver.name)
        }
    }
}

@Composable
private fun TeamInfo(team: Team) {
    Div({
        style {
            padding(25.px)
            display(DisplayStyle.InlineBlock)
        }
    }) {
        Div({style {
            height(50.px)
            width(10.px)
            backgroundColor(Color("#${team.mainColorRGB}"))
        }})
        Span() {
            Text(team.name)
        }
        Img(team.logoUrl) {
            style {
                this.maxHeight(50.px)
            }
        }
    }
}
