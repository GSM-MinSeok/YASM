package com.minstone.happygsm.model.api


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val KEY = "e8db1c860a2e42958b0f2bf47dc51162"
private val BASE_URL = "https://open.neis.go.kr/hub/mealServiceDietInfo"
private val ATPT_OFCDC_SC_CODE = "F10"
private val SD_SCHUL_CODE = "7380292"

object ApiBuilder {
    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api = retrofit.create(Api::class.java)
}