package com.example.googleplay.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay.databinding.CategoryItemBinding
import com.example.googleplay.modal.ApplicationAdapter
import com.example.googleplay.modal.ApplicationData
import com.example.googleplay.modal.CategoryData

class RVWSuperAdapter(private val list : ArrayList<CategoryData>) : RecyclerView.Adapter<RVWSuperAdapter.ViewHolder>() {

    inner class ViewHolder(val categoryItemBinding: CategoryItemBinding) :
    RecyclerView.ViewHolder(categoryItemBinding.root){

        fun onBind(categoryData: CategoryData, position : Int){
            val applicationAdapter = ApplicationAdapter(list[position].items)
            categoryItemBinding.categoryName.text = categoryData.categoryName
            categoryItemBinding.applicationRv.adapter = applicationAdapter
        }

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item = CategoryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size
}