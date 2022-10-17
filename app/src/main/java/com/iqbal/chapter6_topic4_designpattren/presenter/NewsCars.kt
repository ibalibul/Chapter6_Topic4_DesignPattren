package com.iqbal.chapter6_topic4_designpattren.presenter

import com.iqbal.chapter6_topic4_designpattren.model.GetAllCarsItem

interface NewsCars {

    fun onSuccess(pesan : String, News : List<GetAllCarsItem>)
    fun onError(pesan: String)
}