package com.cepkmp.cepkmp.domain.model

import com.cepkmp.cepkmp.api.AddressResponse
import com.cepkmp.cepkmp.api.CepError

internal class AddressResponse(override var address: Address?, override var error: CepError?):
    AddressResponse
