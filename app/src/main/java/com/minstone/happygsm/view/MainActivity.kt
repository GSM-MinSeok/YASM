package com.minstone.happygsm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.minstone.happygsm.R
import com.minstone.happygsm.databinding.ActivityMainBinding
import com.minstone.happygsm.model.Menu
import com.minstone.happygsm.model.api.Api
import com.minstone.happygsm.model.api.ApiBuilder.api
import retrofit2.Call
import retrofit2.Response
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.security.auth.callback.Callback

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val current = LocalDateTime.now()
        val formatterDate = DateTimeFormatter.ofPattern("yyyyMMdd")
        val formattedDate = current.format(formatterDate)
        Log.d(":testt",formattedDate)

        val call = api.getMenu(date = formattedDate)
        call.enqueue(object : retrofit2.Callback<Menu>{
            override fun onResponse(call: Call<Menu>, response: Response<Menu>) {
                TODO("Not yet implemented")
                Log.d(":testt","success")
                if(response.body() != null){
                    Log.d("testt",response.body().toString())
                }
            }

            override fun onFailure(call: Call<Menu>, t: Throwable) {
                TODO("Not yet implemented")
                Log.d("testt","Fail")
            }

        })
    }
}

