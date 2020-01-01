package com.example.collegebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class contact_us : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent1 = Intent(this, dashboard::class.java)
                    startActivity(intent1)
                }
                R.id.navigation_contact_us -> {

                }
                R.id.navigation_my_account -> {
                    val intent2 = Intent(this, my_account::class.java)
                    startActivity(intent2)
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
