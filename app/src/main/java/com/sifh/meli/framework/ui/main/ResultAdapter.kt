package com.sifh.meli.framework.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sifh.meli.R
import com.sifh.meli.databinding.ItemBinding
import com.sifh.meli.domain.Result
import com.sifh.meli.framework.ui.common.basicDiffUtil

class ResultAdapter() : RecyclerView.Adapter<ResultAdapter.ViewHolder>() {

    var results: List<Result> by basicDiffUtil(
        emptyList(),
        areItemsTheSame = { old, new -> old.id == new.id }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val result = results.get(position)
        holder.bind(result)
    }

    override fun getItemCount(): Int = results.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemBinding.bind(view)
        fun bind(result: Result?) = with(binding) {
            txtTitle.text = result?.title
            txtCondition.text = result?.condition
            txtPrice.text = result?.price.toString()
        }
    }
}