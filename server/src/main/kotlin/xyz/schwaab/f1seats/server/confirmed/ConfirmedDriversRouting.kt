package xyz.schwaab.f1seats.server.confirmed

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.confirmedDriversRouting() = apply {

    routing {
        get("/confirmed-drivers") {
            val baseUrl = call.request.local.run { "$scheme://$host" }
            call.respond(HttpStatusCode.OK, getController(baseUrl).getConfirmedDrivers())
        }

        static(BASE_ASSETS_PATH) {
            resources(".")
        }
    }
}
const val BASE_ASSETS_PATH = "/assets"
private fun getController(baseUrl: String) = ConfirmedDriversController(baseUrl)
