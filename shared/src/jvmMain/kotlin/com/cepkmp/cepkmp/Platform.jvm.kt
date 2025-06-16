package com.cepkmp.cepkmp

class AndroidPlatform : Platform {
    override val name: String = "Android JVM"
}

actual fun getPlatform(): Platform {
    return AndroidPlatform()
}