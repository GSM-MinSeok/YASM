package com.minstone.happygsm.view


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.minstone.happygsm.databinding.ActivityMainBinding
import com.minstone.happygsm.model.DTO.MenuInfoModel
import com.minstone.happygsm.model.api.ApiBuilder.api
import retrofit2.Call
import retrofit2.Response
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val current = LocalDateTime.now()
        val formatterDate = DateTimeFormatter.ofPattern("yyyyMMdd")
        val formattedDate = current.format(formatterDate)
        Log.d(":testt",formattedDate.toString())

        val call = api.getMenu(date = formattedDate.toString())
        call.enqueue(object : retrofit2.Callback<MenuInfoModel>{
            override fun onResponse(call: Call<MenuInfoModel>, response: Response<MenuInfoModel>){
                Log.d(":testt","success")
                if(response.body() != null){
                    Log.d("testt",response.body().toString())
                }
            }

            override fun onFailure(call: Call<MenuInfoModel>, t: Throwable) {
                Log.d("testt","Fail")
            }

        })
    }
}

