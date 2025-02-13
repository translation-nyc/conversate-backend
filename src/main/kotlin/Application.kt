package com.heyenaws.conversate.backend

import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    configureCors()
    configureSerialization()
    configureRouting()
}
