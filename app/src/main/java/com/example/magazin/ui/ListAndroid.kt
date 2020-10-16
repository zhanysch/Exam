package com.example.magazin.ui

import Main_Data
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.magazin.R
import com.example.magazin.dataClass.DataClassOne
import com.example.magazin.remote.RetrofitBuilder
import kotlinx.android.synthetic.main.activity_list_android.*
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class ListAndroid : AppCompatActivity(), ItemListener {
    private val adapter = RvAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_android)
        requestNEt()


    }



    private fun requestNEt() {
        RetrofitBuilder.getService()?.getShow("1",)?.
        enqueue(object : retrofit2.Callback<Main_Data>{
            override fun onResponse(call: Call<Main_Data>, response: Response<Main_Data>) {
                if (response.isSuccessful && response.body() != null)
                    adapter.update(response.body()?.data)
            }

            override fun onFailure(call: Call<Main_Data>, t: Throwable) {
                Log.d("gdgdgdsg","dsgsdg")
            }

        })
    }

    override fun itemsClick(item: Main_Data) {
        val intent = Intent(this,Sache_Activity::class.java)
        //intent.putExtra("gdsgds",item)
        startActivity(intent)
    }
}