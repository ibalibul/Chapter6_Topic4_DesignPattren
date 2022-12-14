package com.iqbal.chapter6_topic4_designpattren.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.iqbal.chapter6_topic4_designpattren.databinding.ItemCarsBinding
import com.iqbal.chapter6_topic4_designpattren.model.GetAllCars
import com.iqbal.chapter6_topic4_designpattren.model.GetAllCarsItem

class AdapterCars (var listCars : List<GetAllCarsItem>) : RecyclerView.Adapter<AdapterCars.ViewHolder>(){
    class ViewHolder(var binding : ItemCarsBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = ItemCarsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.txtJudul.text = listCars[position].name
        holder.binding.txtDirector.text = listCars[position].category
        holder.binding.txtDeskripsi.text = listCars[position].createdAt
//        Glide.with(holder.itemView).load(listCars[position].image.into(holder.binding.imgFilm))

    }

    override fun getItemCount(): Int {
        return listCars.size
    }
}