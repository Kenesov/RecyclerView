package com.example.googleplay.modal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.googleplay.databinding.ApplicationItemBinding

class ApplicationAdapter(var applications : ArrayList<ApplicationData>) :
    RecyclerView.Adapter<ApplicationAdapter.ViewHolder>() {

    class ViewHolder(private val applicationItemBinding: ApplicationItemBinding) : RecyclerView.ViewHolder(applicationItemBinding.root) {

        fun onBind(applicationData: ApplicationData) {
            applicationItemBinding.appName.text = applicationData.name
            applicationItemBinding.appSize.text = applicationData.Size
            applicationItemBinding.image.setImageResource(applicationData.imageResId)

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemBinding = ApplicationItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(applications[position])
    }

    override fun getItemCount(): Int = applications.size
}