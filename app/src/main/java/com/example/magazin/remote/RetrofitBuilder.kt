package com.example.magazin.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    private var service : ShopService? = null
    fun getService():ShopService?{
        if (service == null) service = buildRetrofit()
        return service
    }

    private fun buildRetrofit(): ShopService {
       return Retrofit.Builder()
            .baseUrl("https://gorest.co.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ShopService::class.java)
        //https://gorest.co.in/public-api/products?page=1
    }
}