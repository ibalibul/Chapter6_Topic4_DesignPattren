package com.iqbal.chapter6_topic4_designpattren.presenter

import com.iqbal.chapter6_topic4_designpattren.MainActivity
import com.iqbal.chapter6_topic4_designpattren.model.GetAllCarsItem
import com.iqbal.chapter6_topic4_designpattren.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsPresnterCars(val viewCars: NewsCars) {

    fun getDataCar(){
        ApiClient.instance.getAllNews()
            .enqueue(object : Callback<List<GetAllCarsItem>>{
                override fun onResponse(
                    call: Call<List<GetAllCarsItem>>,
                    response: Response<List<GetAllCarsItem>>
                ) {
                    if(response.isSuccessful){
                        viewCars.onSuccess(response.message(),response.body()!!)
                    }else{
                        viewCars.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<GetAllCarsItem>>, t: Throwable) {
                    viewCars.onError(t.message!!)
                }

            })
    }
}