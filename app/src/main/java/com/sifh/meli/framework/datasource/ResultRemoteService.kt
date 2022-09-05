package com.sifh.meli.framework.datasource

import com.sifh.meli.framework.data.ApiResult
import retrofit2.http.GET

interface ResultRemoteService {

    @GET("https://api.mercadolibre.com/sites/MLA/search?q=Motorola%20G6")
    suspend fun listResults() : ApiResult
}