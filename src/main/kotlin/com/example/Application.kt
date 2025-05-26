package com.example

import com.example.config.DatabaseConfig
import com.example.di.DaggerAppComponent
import com.example.exception.AppException
import com.example.exception.DatabaseException
import com.example.routes.employeeRoutes
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.callloging.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.slf4j.event.Level

fun main() {
    // Initialize Dagger
    val appComponent = DaggerAppComponent.factory().create()

    // Initialize database
    DatabaseConfig.init()

    embeddedServer(Netty, port = 8085) {
        // Install features
        install(ContentNegotiation) {
            json()
        }

        install(CallLogging) {
            level = Level.INFO
        }

        install(StatusPages) {
            exception<AppException> { call, cause ->
                when (cause) {
                    is DatabaseException -> {
                        call.respond(HttpStatusCode.InternalServerError, cause.message ?: "Database error occurred")
                    }
                    else -> {
                        call.respond(HttpStatusCode.BadRequest, cause.message ?: "An error occurred")
                    }
                }
            }
            
            exception<Throwable> { call, cause ->
                call.respond(
                    HttpStatusCode.InternalServerError,
                    "An internal server error occurred: ${cause.message}"
                )
            }
        }

        // Configure routing
        routing {
            get("/") {
                call.respondText("Employee Management API")
            }
            employeeRoutes(appComponent.employeeService())
        }
    }.start(wait = true)
} 