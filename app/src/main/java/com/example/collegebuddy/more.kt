package com.example.collegebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class more : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more)

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
                    val intent3 = Intent(this, my_account::class.java)
                    startActivity(intent3)
                }
                R.id.navigation_more -> {

                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}
