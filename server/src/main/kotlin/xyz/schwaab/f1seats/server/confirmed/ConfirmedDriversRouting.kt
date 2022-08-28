package xyz.schwaab.f1seats.server.confirmed

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.confirmedDriversRouting() = apply {

    routing {
        get("/confirmed-drivers") {
            call.respond(HttpStatusCode.OK, getController().getConfirmedDrivers())
        }

        static(BASE_ASSETS_PATH) {
            resources(".")
//            static("driver") {
//                resources("driver")
//            }
//            static("team") {
//                resources("team")
//            }
        }
    }
}
const val BASE_ASSETS_PATH = "/assets"
private fun getController() = ConfirmedDriversController()
