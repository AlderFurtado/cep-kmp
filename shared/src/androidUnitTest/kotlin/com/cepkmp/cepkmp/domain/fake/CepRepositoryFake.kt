package com.cepkmp.cepkmp.domain.fake

import com.cepkmp.cepkmp.api.PostalCode
import com.cepkmp.cepkmp.domain.model.Address
import com.cepkmp.cepkmp.domain.repository.CepRepository
import com.cepkmp.cepkmp.domain.stub.AddressStub
import kotlinx.coroutines.delay

class CepRepositoryFake: CepRepository {
    override suspend fun getCep(postalCode: PostalCode): Address{
        delay(1000)
        return AddressStub.stub()
    }
}
