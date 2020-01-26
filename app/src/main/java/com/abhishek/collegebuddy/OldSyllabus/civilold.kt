package com.abhishek.collegebuddy.OldSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.OldSyllabus.EighthSem.civil_sem8_old
import com.abhishek.collegebuddy.OldSyllabus.FifthSem.civil_sem5_old
import com.abhishek.collegebuddy.OldSyllabus.FirstSem.civil_sem1_old
import com.abhishek.collegebuddy.OldSyllabus.FourthSem.civil_sem4_old
import com.abhishek.collegebuddy.OldSyllabus.SecondSem.civil_sem2_old
import com.abhishek.collegebuddy.OldSyllabus.SeventhSem.civil_sem7_old
import com.abhishek.collegebuddy.OldSyllabus.SixthSem.civil_sem6_old
import com.abhishek.collegebuddy.OldSyllabus.ThirdSem.civil_sem3_old
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_civil_old.*

class civilold : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil_old)

        sem1.setOnClickListener {
            val intent = Intent(this, civil_sem1_old::class.java)
            startActivity(intent)
        }

        sem2.setOnClickListener {
            val intent = Intent(this, civil_sem2_old::class.java)
            startActivity(intent)
        }

        sem3.setOnClickListener {
            val intent = Intent(this, civil_sem3_old::class.java)
            startActivity(intent)
        }

        sem4.setOnClickListener {
            val intent = Intent(this, civil_sem4_old::class.java)
            startActivity(intent)
        }

        sem5.setOnClickListener {
            val intent = Intent(this, civil_sem5_old::class.java)
            startActivity(intent)
        }

        sem6.setOnClickListener {
            val intent = Intent(this, civil_sem6_old::class.java)
            startActivity(intent)
        }

        sem7.setOnClickListener {
            val intent = Intent(this, civil_sem7_old::class.java)
            startActivity(intent)
        }

        sem8.setOnClickListener {
            val intent = Intent(this, civil_sem8_old::class.java)
            startActivity(intent)
        }
    }
}
