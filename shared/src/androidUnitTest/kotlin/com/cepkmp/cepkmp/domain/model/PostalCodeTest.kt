package com.cepkmp.cepkmp.domain.model

import org.junit.Assert
import org.junit.Test

class PostalCodeTest(){

    @Test
    fun `given code with less than 8 digit when create then should throw a ErrorCodeLessThenSevenDigit`(){
      val error = Assert.assertThrows(ErrorCodeLessThenEightDigits::class.java){
        PostalCode("1234567")
      }
      Assert.assertEquals(ErrorCodeLessThenEightDigits().message, error.message)
    }

    @Test
    fun `given code with letter digit when create then should throw a ErrorCodeLessThenSevenDigit`(){
    val error = Assert.assertThrows(ErrorCodeNotContainsNumbers::class.java){
      PostalCode("abcdefgh")
    }
    Assert.assertEquals(ErrorCodeNotContainsNumbers().message, error.message)
    }

    @Test
    fun `given code valid when create then return the same code`(){
        val input = "12345678"
        val postalCode = PostalCode("12345678")
        Assert.assertEquals(postalCode.code, input)
    }
}