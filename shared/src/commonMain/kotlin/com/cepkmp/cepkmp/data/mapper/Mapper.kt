package com.cepkmp.cepkmp.data.mapper

internal interface Mapper<I,O> {
    fun  map(input:I): O
}