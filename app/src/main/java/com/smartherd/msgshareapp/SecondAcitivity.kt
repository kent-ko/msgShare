package com.smartherd.msgshareapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondAcitivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg =  bundle!!.getString("user_message")

        Toast.makeText(this,  msg, Toast.LENGTH_SHORT).show()

        txtUserMessage.text = msg
    }
}