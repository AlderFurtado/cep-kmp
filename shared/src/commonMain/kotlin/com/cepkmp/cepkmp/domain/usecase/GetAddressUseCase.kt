package com.cepkmp.cepkmp.domain.usecase

import com.cepkmp.cepkmp.domain.model.AddressResponse

internal interface GetAddressUseCase {

    suspend fun invoke(postalCode: String): AddressResponse
}