package com.robertruzsa

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.robertruzsa.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureMonitoring()
        configureRouting()
    }.start(wait = true)
}
