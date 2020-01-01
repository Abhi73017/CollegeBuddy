package com.example.collegebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class my_account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_account)

        nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent1 = Intent(this, dashboard::class.java)
                    startActivity(intent1)
                }
                R.id.navigation_contact_us -> {
                    val intent2 = Intent(this, contact_us::class.java)
                    startActivity(intent2)

                }
                R.id.navigation_my_account -> {

                }
                R.id.navigation_more -> {
                    val intent3 = Intent(this, more::class.java)
                    startActivity(intent3)
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
