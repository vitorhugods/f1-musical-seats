package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import style.TextStyle
import xyz.schwaab.f1seats.dto.Driver

@Composable
fun DriverProfile(driver: Driver, modifier: StyleScope.() -> Unit) {
    Div({
        style {
            padding(10.px)
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Column)
            alignItems(AlignItems.Center)
            justifyContent(JustifyContent.Center)
            justifyItems("center")
            modifier()
        }
    }) {
        Img(driver.photoUrl) {
            style {
                maxHeight(100.px)
            }
        }
        Span({
            classes(TextStyle.title2)
        }) {
            Text(driver.name)
        }
    }
}
