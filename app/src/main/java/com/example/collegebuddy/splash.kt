package com.example.collegebuddy

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity


class splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

            Handler().postDelayed(
                {
                    Handler().postDelayed({
                        startActivity(Intent(this,MainActivity::class.java))
                        finish()
                    },500)
                },2500)}

    }
