package com.example.magazin.dataClass

data class DataClassTwo(
    val id : Int,
    val name : String,
    val description: String,
    val image: String,
    val price : String,
    val dicount_amount:String,
    val categories : List<DataClassThree>

)