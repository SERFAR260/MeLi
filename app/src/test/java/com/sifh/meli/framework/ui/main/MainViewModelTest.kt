package com.sifh.meli.framework.ui.main

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Observer
import com.sifh.meli.domain.Result
import com.sifh.meli.usecase.LoadResultsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
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

@OptIn(ExperimentalCoroutinesApi::class)
@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {

    @Mock
    lateinit var loadResultsUseCase: LoadResultsUseCase

    @Mock
    lateinit var observer: Observer<List<Result>>

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private val dispatcher = TestCoroutineDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(dispatcher)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
        dispatcher.cleanupTestCoroutines()
    }



    @Test
    fun `onCreate loads results`() = runBlocking {
        val fakeList = emptyList<Result>()
        whenever (loadResultsUseCase.invoke()).thenReturn(emptyList())
        val vm = MainViewModel(loadResultsUseCase)
        vm.results.observeForever(observer)

        vm.onCreate()

        verify(observer).onChanged(fakeList)
    }
}