package com.cepkmp.cepkmp.api

import com.cepkmp.cepkmp.domain.model.Address

interface AddressResponse {
    var address: Address?
    var error: CepError?
}