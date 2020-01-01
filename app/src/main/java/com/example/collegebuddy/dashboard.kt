package com.example.collegebuddy

import android.content.Intent
import android.os.Bundle
import androidx.annotation.NonNull
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_dashboard.*

class dashboard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {

                }
                R.id.navigation_contact_us -> {

                    val intent1 = Intent(this, contact_us::class.java)
                    startActivity(intent1)
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
