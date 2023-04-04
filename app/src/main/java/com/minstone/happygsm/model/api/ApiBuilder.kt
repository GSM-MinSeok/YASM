package com.minstone.happygsm.model.api


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


private val BASE_URL = "https://open.neis.go.kr/hub/mealServiceDietInfo?/"

object ApiBuilder {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = retrofit.create(Api::class.java)
}