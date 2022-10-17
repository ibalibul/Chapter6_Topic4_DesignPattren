package com.iqbal.chapter6_topic4_designpattren.network

import com.iqbal.chapter6_topic4_designpattren.model.GetAllCarsItem
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {

    @GET("admin/car")
    fun getAllNews() : Call<List<GetAllCarsItem>>
}