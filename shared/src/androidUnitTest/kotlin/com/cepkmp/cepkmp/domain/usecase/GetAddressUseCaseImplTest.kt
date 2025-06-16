package com.cepkmp.cepkmp.domain.usecase

import com.cepkmp.cepkmp.domain.fake.CepRepositoryFake
import com.cepkmp.cepkmp.domain.model.AddressResponse
import com.cepkmp.cepkmp.domain.model.ErrorCodeNotContainsNumbers
import com.cepkmp.cepkmp.domain.model.ErrorCodeLessThenEightDigits
import com.cepkmp.cepkmp.domain.stub.AddressStub
import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test

class GetAddressUseCaseImplTest{

    @Test
    fun `given code valid when invoke should return a address`() = runBlocking {
        val cepRepositoryFake = CepRepositoryFake()
        val getAddressUseCaseImpl = GetAddressUseCaseImpl(cepRepositoryFake)
        val output = getAddressUseCaseImpl.invoke("12345678")
        Assert.assertEquals(AddressStub.stub().street,output.address?.street)
        Assert.assertEquals(AddressStub.stub().neighborhood,output.address?.neighborhood)
        Assert.assertEquals(AddressStub.stub().siafiCode,output.address?.siafiCode)
        Assert.assertEquals(AddressStub.stub().stateCode,output.address?.stateCode)
        Assert.assertEquals(AddressStub.stub().giaCode,output.address?.giaCode)
        Assert.assertEquals(AddressStub.stub().ibgeCode,output.address?.ibgeCode)
        Assert.assertEquals(AddressStub.stub().state,output.address?.state)
        Assert.assertEquals(AddressStub.stub().city,output.address?.city)
        Assert.assertEquals(AddressStub.stub().complement,output.address?.complement)
        Assert.assertEquals(AddressStub.stub().unit,output.address?.unit)
        Assert.assertEquals(AddressStub.stub().zipCode,output.address?.zipCode)
        Assert.assertEquals(AddressStub.stub().areaCode,output.address?.areaCode)
        Assert.assertEquals(AddressStub.stub().region,output.address?.region)
    }

    @Test
    fun `given code less than 8 digits when invoke should return a address`() = runBlocking {
        val cepRepositoryFake = CepRepositoryFake()
        val getAddressUseCaseImpl = GetAddressUseCaseImpl(cepRepositoryFake)
        val output = getAddressUseCaseImpl.invoke("1234567")

            Assert.assertEquals(ErrorCodeLessThenEightDigits().message,output.error?.message)
    }

    @Test
    fun `given code with letter when invoke should return a address`() = runBlocking {
        val cepRepositoryFake = CepRepositoryFake()
        val getAddressUseCaseImpl = GetAddressUseCaseImpl(cepRepositoryFake)
        val output = getAddressUseCaseImpl.invoke("1234567b")
            Assert.assertEquals(ErrorCodeNotContainsNumbers().message,output.error?.message)
    }

}