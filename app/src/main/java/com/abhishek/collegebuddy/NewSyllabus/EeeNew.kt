package com.abhishek.collegebuddy.NewSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.NewSyllabus.FirstSem.EEE
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_eee__new.*

class EeeNew : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee__new)
        sem1.setOnClickListener{
            val intent = Intent(this, EEE::class.java)
            startActivity(intent)
        }
    }
}
