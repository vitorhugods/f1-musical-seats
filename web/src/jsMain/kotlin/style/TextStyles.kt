package style

import kotlinx.css.FontWeight
import org.jetbrains.compose.web.css.*


object TextStyle: StyleSheet(){

    val title1 by style {
        fontFamily("Titillium Web")
        fontSize(18.pt)
        fontWeight(FontWeight.bold.value)
    }

    val title2 by style {
        fontSize(16.pt)
        fontFamily("Titillium Web")
        fontWeight(FontWeight.bold.value)
    }
}
