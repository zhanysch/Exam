package com.example.magazin.remote

import Main_Data
import android.telecom.Call
import com.example.magazin.dataClass.DataClassOne
import retrofit2.http.GET
import retrofit2.http.Query

interface ShopService {
    @GET("public-api/products")
    fun getShow(
        @Query("1") page :String,
    ): retrofit2.Call<Main_Data>

    ////https://gorest.co.in/public-api/products?page=1
 }