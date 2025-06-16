package com.cepkmp.cepkmp.infra

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO

actual fun getHttpClient(): HttpClient =  HttpClient(CIO) {}