package com.minstone.happygsm.model.api

import com.minstone.happygsm.model.Menu
import retrofit2.http.GET
import retrofit2.http.Path

interface Api {
    @GET("MMEAL_SC_CODE=1&MLSV_YMD={date}")
    fun getMenu(@Path("date")date:String):retrofit2.Call<Menu>
}