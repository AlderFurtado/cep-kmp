package com.cepkmp.cepkmp.infra


import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.client.statement.bodyAsText
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json


@Serializable
data class Response<O>(val body: O)

class KtorAdapter : Http {
    private fun client(): HttpClient {
        val httpClient = getHttpClient()
        httpClient.config {
            install(ContentNegotiation) {
                json()
            }
        }
        return httpClient
    }

    override suspend fun get(url: String): String {
        val response = client().get(url)
        return response.bodyAsText()
    }


    override suspend fun <I, O> post(url: String, body: I): O {
        TODO("Not yet implemented")
    }
}