package com.cepkmp.cepkmp.domain.model

import com.cepkmp.cepkmp.api.CepError

class ErrorCodeNotContainsNumbers(override val message: String? = "Cep deve conter apenas números") : CepError()
