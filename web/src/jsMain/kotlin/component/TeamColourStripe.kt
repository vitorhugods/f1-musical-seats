package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import style.ContainerStyle
import xyz.schwaab.f1seats.dto.Team

@Composable
fun TeamColourStripe(team: Team, modifier: StyleScope.() -> Unit) {
    Div({
        classes(ContainerStyle.roundedBottom)
        style {
            height(20.px)
            backgroundColor(Color("#${team.mainColorRGB}"))
            modifier()
        }
    })
}
