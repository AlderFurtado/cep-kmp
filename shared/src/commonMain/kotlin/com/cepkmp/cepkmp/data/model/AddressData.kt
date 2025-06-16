package com.cepkmp.cepkmp.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AddressData(
    @SerialName("cep") val zipCode: String,
    @SerialName("logradouro") val street: String,
    @SerialName("complemento") val complement: String,
    @SerialName("unidade") val unit: String,
    @SerialName("bairro") val neighborhood: String,
    @SerialName("localidade") val city: String,
    @SerialName("uf") val stateCode: String,
    @SerialName("estado") val state: String,
    @SerialName("regiao") val region: String,
    @SerialName("ibge") val ibgeCode: String,
    @SerialName("gia") val giaCode: String,
    @SerialName("ddd") val areaCode: String,
    @SerialName("siafi") val siafiCode: String
)