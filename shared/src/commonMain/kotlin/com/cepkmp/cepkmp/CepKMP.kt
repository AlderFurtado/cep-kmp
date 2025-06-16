package com.cepkmp.cepkmp

import com.cepkmp.cepkmp.api.AddressResponse

class CepKMP {
    suspend fun getAddress(postalCode: String):AddressResponse{
        return CepKMPFactory.getGetAddressUseCaseImpl.invoke(postalCode)
    }
}