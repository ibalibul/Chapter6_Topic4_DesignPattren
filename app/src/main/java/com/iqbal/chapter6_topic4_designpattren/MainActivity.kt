package com.iqbal.chapter6_topic4_designpattren

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.iqbal.chapter6_topic4_designpattren.databinding.ActivityMainBinding
import com.iqbal.chapter6_topic4_designpattren.model.GetAllCarsItem
import com.iqbal.chapter6_topic4_designpattren.presenter.NewsCars
import com.iqbal.chapter6_topic4_designpattren.presenter.NewsPresnterCars
import com.iqbal.chapter6_topic4_designpattren.view.AdapterCars

class MainActivity : AppCompatActivity(), NewsCars {

    lateinit var binding: ActivityMainBinding
    lateinit var presternews: NewsPresnterCars


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presternews = NewsPresnterCars(this)
        presternews.getDataCar()
    }

    override fun onSuccess(pesan: String, News: List<GetAllCarsItem>) {
        binding.rvListCars.layoutManager = LinearLayoutManager(this)
        binding.rvListCars.adapter = AdapterCars(News)
    }

    override fun onError(pesan: String) {
        Toast.makeText(this,pesan, Toast.LENGTH_SHORT).show()
    }


}