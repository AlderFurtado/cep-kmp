package com.cepkmp.cepkmp.domain.repository

import com.cepkmp.cepkmp.api.PostalCode
import com.cepkmp.cepkmp.domain.model.Address

internal interface CepRepository {
    suspend fun getCep(postalCode: PostalCode): Address
}