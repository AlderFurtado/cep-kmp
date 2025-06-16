package com.cepkmp.cepkmp.infra

internal interface Http {
    suspend fun get(url: String): String
    suspend fun <I,O> post(url: String, body: I): O
}