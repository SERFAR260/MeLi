package com.sifh.meli.framework.datasource

import android.util.Log
import com.sifh.meli.data.datasource.RemoteDataSource
import com.sifh.meli.domain.Result

class ServerResultDataSource(private val resultRemoteService: ResultRemoteService) : RemoteDataSource {
    override suspend fun getResults(): List<Result> {
        val mResult = resultRemoteService.listResults()
        Log.d("Sergio", mResult.results.toString())
        return mResult.results.map { result ->
            Result(
                result.id, result.title, result.price, result.condition
            )
        }
    }

}