# CepKMP

**CepKMP** is an asynchronous Kotlin Multiplatform library that retrieves address information based on a Brazilian postal code (CEP).

> ⚠️ This library currently supports only Brazilian postal codes.

---

## 🚀 Quick Start

First, add the dependency to your project:

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.alderfurtado:cepkmp:$cepkmp_version")
}
```

Then, use the library in your code:

```kotlin
import com.cepkmp.cepkmp.api.AddressResponse
import com.cepkmp.cepkmp.CepKMP

suspend fun getAddress(): AddressResponse {
    return CepKMP().getAddress("01310-000")
}
```

Address and CepError
The response will return either an Address object (on success) or a CepError (on failure).

### Address Model

```kotlin
data class Address(
    val zipCode: String,
    val street: String,
    val complement: String,
    val unit: String,
    val neighborhood: String,
    val city: String,
    val stateCode: String,
    val state: String,
    val region: String,
    val ibgeCode: String,
    val giaCode: String,
    val areaCode: String,
    val siafiCode: String
)
```

#### 🧾 Address Fields Explained

| Property       | Type   | Description                                                                 |
|----------------|--------|-----------------------------------------------------------------------------|
| `zipCode`      | String | The **postal code (CEP)**, e.g., `01310-000`.                               |
| `street`       | String | Street name, e.g., `Avenida Paulista`.                                      |
| `complement`   | String | Additional address info, such as `Apt 101` or `Back entrance`.              |
| `unit`         | String | Postal unit (rarely used). May include internal Correios codes.             |
| `neighborhood` | String | Neighborhood name, e.g., `Bela Vista`.                                      |
| `city`         | String | City name, e.g., `São Paulo`.                                               |
| `stateCode`    | String | State abbreviation, e.g., `SP`, `RJ`.                                       |
| `state`        | String | Full state name, e.g., `São Paulo`.                                         |
| `region`       | String | Geographic region in Brazil, e.g., `Southeast`, `Northeast`.               |
| `ibgeCode`     | String | IBGE code of the city — used for government statistics and systems.         |
| `giaCode`      | String | GIA code — used in São Paulo state for ICMS reporting.                      |
| `areaCode`     | String | Phone **area code (DDD)**, e.g., `11` for São Paulo.                        |
| `siafiCode`    | String | SIAFI code — used by Brazil’s federal financial management system.          |


## CepError

CepError only extends a Exception Class

---

# Usage Example

```Kotlin
import com.cepkmp.cepkmp.CepKMP
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

fun fetchAddress(postalCode: String) {
    CoroutineScope(Dispatchers.Main).launch {
        try {
            val address = withContext(Dispatchers.IO) {
                CepKMP().getAddress(postalCode)
            }
            println("Address found: $address")
        } catch (e: Exception) {
            println("Error fetching address: ${e.message}")
        }
    }
}
```

## License
This project is licensed under the MIT License.
