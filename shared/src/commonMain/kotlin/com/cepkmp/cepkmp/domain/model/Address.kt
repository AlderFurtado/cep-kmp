package com.cepkmp.cepkmp.domain.model

data class Address(
    val zipCode: String,
    val street: String,
    val complement: String,
    val unit: String,
    val neighborhood: String,
    val city: String,
    val stateCode: String,
    val state: String,
    val region: String,
    val ibgeCode: String,
    val giaCode: String,
    val areaCode: String,
    val siafiCode: String
){
    companion object {
        val initEmpty = Address(
            zipCode = "",
            street = "",
            complement = "",
            unit = "",
            neighborhood = "",
            city = "",
            stateCode = "",
            state = "",
            region = "",
            ibgeCode = "",
            giaCode = "",
            areaCode = "",
            siafiCode = ""
        )
    }
}