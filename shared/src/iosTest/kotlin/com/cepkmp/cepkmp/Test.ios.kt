package com.cepkmp.cepkmp

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class IosGreetingTest {

    @Test
    fun testExample() = runBlocking {
       val result = CepKMP().getAddress("66083130")
       println(result)
    }
}