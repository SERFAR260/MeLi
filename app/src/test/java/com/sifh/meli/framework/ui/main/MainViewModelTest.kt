package com.sifh.meli.framework.ui.main

import com.sifh.meli.domain.Result
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.sifh.meli.data.datasource.RemoteDataSource
import com.sifh.meli.data.repository.ResultRepository
import com.sifh.meli.usecase.LoadResultsUseCase
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.verify
import org.mockito.kotlin.whenever


@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {

    @MockK
    private lateinit var remoteDataSource: RemoteDataSource
    private val repository: ResultRepository = ResultRepository(remoteDataSource)
    private var loadResultsUseCase =  LoadResultsUseCase(repository)

    private lateinit var viewModel: MainViewModel

    @Mock
    lateinit var observer: Observer<List<Result>>

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val dispatcher = TestCoroutineDispatcher()

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel(loadResultsUseCase)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        dispatcher.cleanupTestCoroutines()
    }

    @Test
    fun `onCreate loads results`()  {

    }
}