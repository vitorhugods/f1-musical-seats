package component

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import style.TextStyle
import xyz.schwaab.f1seats.dto.Team

@Composable
fun TeamInfo(team: Team, modifier: StyleScope.() -> Unit) {
    Div({
        style {
            display(DisplayStyle.Flex)
            flexDirection(FlexDirection.Row)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
            alignContent(AlignContent.Center)
            modifier()
        }
    }) {
        Img(team.logoUrl) {
            style {
                this.maxHeight(50.px)
            }
        }
        Span({
            classes(TextStyle.title1)
            style { marginLeft(25.px) }
        }) {
            Text(team.name)
        }
    }
}
