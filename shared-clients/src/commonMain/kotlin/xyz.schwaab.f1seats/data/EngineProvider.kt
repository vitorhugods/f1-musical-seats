package xyz.schwaab.f1seats.data

import io.ktor.client.engine.*

expect fun provideEngine(): HttpClientEngine
