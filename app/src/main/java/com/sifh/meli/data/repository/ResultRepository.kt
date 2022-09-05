package com.sifh.meli.data.repository

import com.sifh.meli.data.datasource.RemoteDataSource

class ResultRepository (private val remoteDataSource: RemoteDataSource) {
    suspend fun getResult() = remoteDataSource.getResults()
}
