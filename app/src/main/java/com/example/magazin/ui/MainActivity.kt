package com.example.magazin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.magazin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val loginOne = "tempuser@gmail.com"
    val passwordOne = "123456Qwer"

    val loginTwo = "newmain@mail.ru"
    val passwordTwo = "qwerty"

    val loginthree = "admin@admin.kg"
    val passwordthree = "123456"

    val loginfourth = "gotoisbad@dd.bb"
    val passwordfourth = "todo123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setuplisteners()

        logic()
    }

    private fun setuplisteners() {
        Btnsign.setOnClickListener {
            logic()

        }
    }

    private fun logic() {

        val login = log.text.toString()
        val passw= pass.text.toString()
        if (login == loginOne&& passw == passwordOne) {
            Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ListAndroid::class.java)
            startActivity(intent)

        }
        if(login == loginTwo && passw == passwordTwo){
            Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ListAndroid::class.java)
            startActivity(intent)
        }
        if(login == loginthree && passw == passwordthree){
            Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ListAndroid::class.java)
            startActivity(intent)
        }
        if(login == loginfourth && passw == passwordfourth){
            Toast.makeText(applicationContext, "data is correct", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ListAndroid::class.java)
            startActivity(intent)
        }


        else {
            Toast.makeText(applicationContext, "data is not correct", Toast.LENGTH_LONG).show()
        }
    }



}

