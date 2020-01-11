package com.abhishek.collegebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.loginsignup.login
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnguest.setOnClickListener {
            val intent1 = Intent(this, dashboard::class.java)
            startActivity(intent1)
            finish()
        }

        btnloginpage.setOnClickListener {
            val intent2 = Intent(this, login::class.java)
            startActivity(intent2)
            
        }

    }

    override fun onStart() {

        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser: FirebaseUser? = FirebaseAuth.getInstance().currentUser
        if (currentUser != null) {
            val intent = Intent(this@MainActivity, dashboard::class.java)
            startActivity(intent)
            finish()
        }
        super.onStart()
    }

}
