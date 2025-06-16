package com.cepkmp.cepkmp

import com.cepkmp.cepkmp.data.repository.CepRepositoryImpl
import com.cepkmp.cepkmp.domain.repository.CepRepository
import com.cepkmp.cepkmp.domain.usecase.GetAddressUseCase
import com.cepkmp.cepkmp.domain.usecase.GetAddressUseCaseImpl
import com.cepkmp.cepkmp.infra.Http
import com.cepkmp.cepkmp.infra.KtorAdapter

internal object CepKMPFactory {
    private val getKtorAdapter: Http = KtorAdapter()
    private val getCepRepositoryImpl: CepRepository = CepRepositoryImpl(http = getKtorAdapter)
    val getGetAddressUseCaseImpl: GetAddressUseCase = GetAddressUseCaseImpl(cepRepository =  getCepRepositoryImpl)
}