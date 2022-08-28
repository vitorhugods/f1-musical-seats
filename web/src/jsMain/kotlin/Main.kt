import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import xyz.schwaab.f1seats.data.SeatRepository
import xyz.schwaab.f1seats.dto.Driver
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
    response.flatMap { it.drivers }.forEach { driver ->
        DriverCard(driver)
    }
}

@Composable
private fun DriverCard(driver: Driver){
    Div({ style { padding(25.px) } }) {
        Img("http://${driver.photoUrl}")
        Span() {
            Text(driver.name)
        }
    }
}

