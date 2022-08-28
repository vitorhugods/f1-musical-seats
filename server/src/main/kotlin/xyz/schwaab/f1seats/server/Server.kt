package xyz.schwaab.f1seats.server

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.cors.routing.*
import kotlinx.serialization.json.Json
import org.slf4j.event.Level
import xyz.schwaab.f1seats.server.confirmed.confirmedDriversRouting

const val HOST = "0.0.0.0"
const val PORT = 8088
const val URL = "$HOST:$PORT"

fun main() {
    embeddedServer(Netty, port = PORT, host = HOST) {
        install(CallLogging) {
            level = Level.DEBUG
        }
        install(CORS) {
            anyHost()
        }
        install(ContentNegotiation) {
            json(Json {
                isLenient = true
                prettyPrint = true
            })
        }
        confirmedDriversRouting()
    }.start(wait = true)
}
