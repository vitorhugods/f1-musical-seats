package xyz.schwaab.f1seats.data

import io.ktor.client.engine.*
import io.ktor.client.engine.okhttp.*

actual fun provideEngine(): HttpClientEngine = OkHttpEngine(OkHttpConfig())
