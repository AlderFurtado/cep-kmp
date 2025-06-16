package com.cepkmp.cepkmp

import com.cepkmp.cepkmp.domain.model.Address
import kotlinx.coroutines.runBlocking
import org.junit.Test

class CepKMPTest {

  @Test
  fun `given a postalCode valid when getAddress should return address valid`(): Unit = runBlocking {
      var address: Address = Address.initEmpty
     val result = CepKMP().getAddress("01001000")

      result.address?.let {
          address = it
      }
  }
}