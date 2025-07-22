package com.refanzzzz.waterquality.data.network

import io.ktor.client.*
import io.ktor.client.engine.js.*
import io.ktor.client.plugins.HttpTimeout
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.accept
import io.ktor.http.ContentType
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

object HttpClientFactory {
    fun createClient(): HttpClient {
        val client = HttpClient(Js) {

            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }

            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.INFO
            }


            install(HttpTimeout) {
                requestTimeoutMillis = NetworkConfig.TIMEOUT_MILLIS
                connectTimeoutMillis = NetworkConfig.TIMEOUT_MILLIS
                socketTimeoutMillis = NetworkConfig.TIMEOUT_MILLIS
            }

            defaultRequest {
                contentType(ContentType.Application.Json)
                accept(ContentType.Application.Json)
                url(NetworkConfig.BASE_URL)
                headers.append("x-api-key", NetworkConfig.API_KEY)
            }
        }

        return client
    }
}