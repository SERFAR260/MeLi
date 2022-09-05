package com.sifh.meli.usecase

import com.sifh.meli.data.repository.ResultRepository
import com.sifh.meli.domain.Result

class LoadResultsUseCase(private val repository: ResultRepository) {
    suspend fun invoke() : List<Result> = repository.getResult()
}