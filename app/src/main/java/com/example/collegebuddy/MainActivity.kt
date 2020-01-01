package com.example.collegebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnguest.setOnClickListener {
            val intent1 = Intent(this, dashboard::class.java)
            startActivity(intent1)
        }

        btnloginpage.setOnClickListener {
            val intent2 = Intent(this, login::class.java)
            startActivity(intent2)
        }

    }

}
