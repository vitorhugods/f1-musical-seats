package xyz.schwaab.f1seats.server.confirmed

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import xyz.schwaab.f1seats.server.HOST

fun Application.confirmedDriversRouting() = apply {

    routing {
        get("/confirmed-drivers") {
            val currentHost = call.request.headers[HttpHeaders.Host] ?: HOST
            call.respond(HttpStatusCode.OK, getController(currentHost).getConfirmedDrivers())
        }

        static(BASE_ASSETS_PATH) {
            resources(".")
        }
    }
}
const val BASE_ASSETS_PATH = "/assets"
private fun getController(currentHost: String) = ConfirmedDriversController(currentHost)
