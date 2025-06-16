package com.cepkmp.cepkmp.domain.usecase

import com.cepkmp.cepkmp.domain.model.AddressResponse
import com.cepkmp.cepkmp.domain.model.PostalCode
import com.cepkmp.cepkmp.domain.model.ErrorCodeNotContainsNumbers
import com.cepkmp.cepkmp.domain.model.ErrorCodeLessThenEightDigits
import com.cepkmp.cepkmp.domain.model.ErrorUnknown
import com.cepkmp.cepkmp.domain.repository.CepRepository

internal class GetAddressUseCaseImpl(private val cepRepository: CepRepository) : GetAddressUseCase {
    override suspend fun invoke(postalCode: String): AddressResponse{

        return try {
            val postalCodeDomain = PostalCode(code = postalCode)
            val address = cepRepository.getCep(postalCodeDomain)
            AddressResponse(address = address, error = null)
        }catch (e: ErrorCodeNotContainsNumbers){
            AddressResponse(address = null, error = e)
        }catch (e: ErrorCodeLessThenEightDigits){
            AddressResponse(address = null, error = e)
        }catch (e: Exception){
            AddressResponse(address = null, error = ErrorUnknown(message = e.message))
        }
    }
}