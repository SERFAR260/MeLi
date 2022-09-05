package com.sifh.meli.data

import com.sifh.meli.data.datasource.RemoteDataSource
import com.sifh.meli.data.repository.ResultRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    fun resultRepositoryProvider(remoteDataSource: RemoteDataSource) : ResultRepository {
        return ResultRepository(remoteDataSource)
    }
}