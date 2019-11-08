package com.smartherd.msgshareapp.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.smartherd.msgshareapp.Constants
import com.smartherd.msgshareapp.R
import com.smartherd.msgshareapp.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG : String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShowToast.setOnClickListener {
            //Code
            Log.i(TAG, "Button was Clicked!")
            showToast(resources.getString(R.string.btn_is_clicked), Toast.LENGTH_LONG )
//            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_LONG).show()
        }

        btnSendMsgToNextActivity.setOnClickListener {
            val message: String = etUserMessage.text.toString()
            val intent = Intent(this, SecondAcitivity::class.java)

            intent.putExtra(Constants.USER_MSG_KEY, message)
            startActivity(intent)
        }

        btnShareToOtherApps.setOnClickListener {

            val message: String = etUserMessage.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Please select app: "))
        }

        btnRecyclerViewDemo.setOnClickListener {

            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)

        }

    }

}
