package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import xyz.schwaab.f1seats.dto.Driver

@Composable
fun Drivers(drivers: List<Driver>, modifier: StyleScope.() -> Unit) {
    Div({
        style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Row)
            alignItems(AlignItems.Stretch)
            alignContent(AlignContent.SpaceEvenly)
            modifier()
        }
    }) {
        drivers.forEach { driver ->
            DriverProfile(driver){
                flexGrow(1)
            }
        }
    }
}

