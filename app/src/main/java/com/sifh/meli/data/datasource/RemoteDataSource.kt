package com.sifh.meli.data.datasource

import com.sifh.meli.domain.Result

interface RemoteDataSource {
    suspend fun getResults() : List<Result>
}
