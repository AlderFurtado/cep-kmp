package com.cepkmp.cepkmp.domain.model

import com.cepkmp.cepkmp.api.CepError

class ErrorUnknown(override val message: String? = "Erro desconhecido"): CepError()