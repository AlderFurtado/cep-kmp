package com.cepkmp.cepkmp.data.repository

import com.cepkmp.cepkmp.api.PostalCode
import com.cepkmp.cepkmp.data.mapper.AddressDataToAddressMapper
import com.cepkmp.cepkmp.data.model.AddressData
import com.cepkmp.cepkmp.domain.model.Address
import com.cepkmp.cepkmp.domain.repository.CepRepository
import com.cepkmp.cepkmp.infra.Http
import kotlinx.serialization.json.Json

internal class CepRepositoryImpl(private val http: Http) : CepRepository {
    override suspend fun getCep(postalCode: PostalCode): Address {
        val response = http.get("https://viacep.com.br/ws/${postalCode.code}/json")
        val addressData = Json.decodeFromString<AddressData>(response)
        return AddressDataToAddressMapper.map(addressData)
    }
}