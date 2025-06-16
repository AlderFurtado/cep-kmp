package com.cepkmp.cepkmp.domain.model

import com.cepkmp.cepkmp.api.CepError

class ErrorCodeLessThenEightDigits(override val message: String? = "Cep contém menos de 8 digítos"):
    CepError()
