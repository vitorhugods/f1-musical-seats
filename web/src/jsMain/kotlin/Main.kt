import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import component.Drivers
import component.TeamColourStripe
import component.TeamInfo
import kotlinx.browser.document
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.renderComposable
import style.ContainerStyle
import style.TextStyle
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
    document.bgColor = "#38383f"

    renderComposable(rootElementId = "root") {
        Style(ContainerStyle)
        Style(TextStyle)

        TeamsTable(response)
    }
}

@Composable
private fun TeamsTable(listOfTeamInfo: List<TeamDrivers>) {
    Div(
        {
            style {
                display(DisplayStyle.Flex)
                flexWrap(FlexWrap.Wrap)
            }
        }) {
        listOfTeamInfo.forEach { teamInfo ->
            TeamCard(teamInfo.team, teamInfo.drivers)
        }
    }
}

@Composable
private fun TeamCard(team: Team, drivers: List<Driver>) {
    Div({
        classes(ContainerStyle.card)
        style {
            margin(50.px)
            flexGrow(1)
            flexBasis(25.pc)
            padding(0.px)
            flexDirection(FlexDirection.Column)
            justifyContent(JustifyContent.SpaceEvenly)
            display(DisplayStyle.Flex)
        }
    }) {

        Div({
            style {
                flexGrow(1)
                padding(20.px)
                justifyContent(JustifyContent.SpaceEvenly)
                display(DisplayStyle.Flex)
                flexDirection(FlexDirection.Column)
            }
        }) {

            Drivers(drivers) {
            }

            TeamInfo(team) {
                justifySelf("stretch")
            }
        }

        TeamColourStripe(team) {
            flexShrink(0)
            height(15.px)
            justifySelf("stretch")
        }
    }
}

