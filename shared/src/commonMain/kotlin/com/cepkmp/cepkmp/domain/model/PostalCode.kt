package com.cepkmp.cepkmp.domain.model

import com.cepkmp.cepkmp.api.PostalCode

internal class PostalCode(override val code:String): PostalCode {
    init {
        validCep()
    }

    private fun validCep(){
        if(this.code.length <= 7) throw ErrorCodeLessThenEightDigits()
        val regex = Regex("^\\d+$")
        if(!regex.matches(code)) throw ErrorCodeNotContainsNumbers()
    }
}