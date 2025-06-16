package com.cepkmp.cepkmp.infra

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin

actual fun getHttpClient(): HttpClient = HttpClient(Darwin) {}