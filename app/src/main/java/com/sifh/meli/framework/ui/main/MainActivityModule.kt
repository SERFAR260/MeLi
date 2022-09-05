package com.sifh.meli.framework.ui.main

import com.sifh.meli.data.repository.ResultRepository
import com.sifh.meli.usecase.LoadResultsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class MainActivityModule {

    @Provides
    fun loadResultsProvider(repository: ResultRepository) : LoadResultsUseCase {
        return LoadResultsUseCase(repository)
    }
}