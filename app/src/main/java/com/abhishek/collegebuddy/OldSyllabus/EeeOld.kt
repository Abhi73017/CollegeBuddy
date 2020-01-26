package com.abhishek.collegebuddy.OldSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.OldSyllabus.EighthSem.eee_sem8_old
import com.abhishek.collegebuddy.OldSyllabus.FifthSem.eee_sem5_old
import com.abhishek.collegebuddy.OldSyllabus.FirstSem.eee_sem1_old
import com.abhishek.collegebuddy.OldSyllabus.FourthSem.eee_sem4_old
import com.abhishek.collegebuddy.OldSyllabus.SecondSem.eee_sem2_old
import com.abhishek.collegebuddy.OldSyllabus.SeventhSem.eee_sem7_old
import com.abhishek.collegebuddy.OldSyllabus.SixthSem.eee_sem6_old
import com.abhishek.collegebuddy.OldSyllabus.ThirdSem.eee_sem3_old
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_eee_old.*

class EeeOld : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee_old)
        sem1.setOnClickListener {
        val intent = Intent(this, eee_sem1_old::class.java)
        startActivity(intent)
        }

        sem2.setOnClickListener {
            val intent = Intent(this, eee_sem2_old::class.java)
            startActivity(intent)
        }

        sem3.setOnClickListener {
            val intent = Intent(this, eee_sem3_old::class.java)
            startActivity(intent)
        }

        sem4.setOnClickListener {
            val intent = Intent(this, eee_sem4_old::class.java)
            startActivity(intent)
        }

        sem5.setOnClickListener {
            val intent = Intent(this, eee_sem5_old::class.java)
            startActivity(intent)
        }

        sem6.setOnClickListener {
            val intent = Intent(this, eee_sem6_old::class.java)
            startActivity(intent)
        }

        sem7.setOnClickListener {
            val intent = Intent(this, eee_sem7_old::class.java)
            startActivity(intent)
        }

        sem8.setOnClickListener {
            val intent = Intent(this, eee_sem8_old::class.java)
            startActivity(intent)
        }
    }
}
