package com.sifh.meli.framework.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import android.os.Bundle
import com.sifh.meli.data.repository.ResultRepository
import com.sifh.meli.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    @Inject lateinit var resultRepository: ResultRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val resultAdapter = ResultAdapter()
        binding.recycler.adapter = resultAdapter
        mainViewModel.results.observe(this) { resultsList ->
            resultAdapter.results = resultsList
        }
        mainViewModel.onCreate()
    }

}