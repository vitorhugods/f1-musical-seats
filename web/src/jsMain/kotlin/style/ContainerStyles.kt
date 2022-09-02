package style

import org.jetbrains.compose.web.css.*


object ContainerStyle: StyleSheet(){

    val card by style {
        backgroundColor(Color("white"))
        borderRadius(20.px)
        padding(25.px)
        property("box-shadow", "0px 4px 4px rgba(0, 0, 0, 0.25)")
    }

    val roundedBottom by style {
        borderRadius(0.px, 0.px, 20.px, 20.px)
    }
}
