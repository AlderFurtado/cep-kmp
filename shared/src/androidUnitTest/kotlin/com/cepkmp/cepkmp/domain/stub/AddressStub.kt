package com.cepkmp.cepkmp.domain.stub

import com.cepkmp.cepkmp.domain.model.Address

object AddressStub {

    fun stub(): Address {
        return Address(
            street = "Street fake",
            neighborhood = "Neighborhood fake",
            zipCode = "zipCode fake",
            complement = "complement fake",
            unit = "unit fake",
            city = "city fake",
            stateCode = "stateCode fake",
            state = "state fake",
            region = "region fake",
            ibgeCode = "ibgeCode fake",
            giaCode = "giaCode fake",
            areaCode = "areaCode fake",
            siafiCode = "siafiCode fake"
        )
    }
}