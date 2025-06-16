package com.cepkmp.cepkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform