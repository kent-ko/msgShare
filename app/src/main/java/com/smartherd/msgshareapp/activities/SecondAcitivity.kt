package com.smartherd.msgshareapp.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.smartherd.msgshareapp.Constants
import com.smartherd.msgshareapp.R
import com.smartherd.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondAcitivity: AppCompatActivity(){

    companion object{
        val TAG : String = SecondAcitivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //Safe Call ?.
        //Safe Call with let ?.let{ }

        val bundle: Bundle? = intent.extras

        null?.let{
            val msg =  bundle!!.getString(Constants.USER_MSG_KEY)

            msg?.let { it1 -> showToast(it1) }

            txtUserMessage.text = msg
        }

//        Toast.makeText(this,  msg, Toast.LENGTH_SHORT).show()

    }
}