package xyz.schwaab.f1seats.data

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
import xyz.schwaab.f1seats.dto.TeamDrivers

class SeatRepository (engine: HttpClientEngine = provideEngine()) {

    private val httpClient: HttpClient = HttpClient(engine).config {
        install(ContentNegotiation){
            json(Json)
        }
        defaultRequest {
            url(BASE_URL)
        }
    }

    suspend fun fetchConfirmedDrivers(): List<TeamDrivers> {
        return httpClient.get("/confirmed-drivers").body()
    }
}

private const val BASE_URL = "https://f1seats.schwaab.xyz"
