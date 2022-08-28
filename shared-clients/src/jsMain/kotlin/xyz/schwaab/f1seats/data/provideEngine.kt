package xyz.schwaab.f1seats.data

import io.ktor.client.engine.*
import io.ktor.client.engine.js.*

actual fun provideEngine(): HttpClientEngine = Js.create {}
