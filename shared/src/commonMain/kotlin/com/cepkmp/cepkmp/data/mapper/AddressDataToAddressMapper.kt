package com.cepkmp.cepkmp.data.mapper

import com.cepkmp.cepkmp.data.model.AddressData
import com.cepkmp.cepkmp.domain.model.Address

internal object AddressDataToAddressMapper: Mapper<AddressData,Address> {
    override fun map(input: AddressData): Address {
        return  Address(
            neighborhood = input.neighborhood,
            street = input.street,
            city = input.city,
            unit = input.unit,
            state = input.state,
            region = input.region,
            areaCode = input.areaCode,
            ibgeCode = input.ibgeCode,
            giaCode = input.giaCode,
            zipCode = input.zipCode,
            siafiCode = input.siafiCode,
            stateCode = input.stateCode,
            complement = input.complement
            )
    }

}