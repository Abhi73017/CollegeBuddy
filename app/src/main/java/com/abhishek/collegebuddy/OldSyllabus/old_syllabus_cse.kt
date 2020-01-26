package com.abhishek.collegebuddy.OldSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.OldSyllabus.EighthSem.cse_sem8_old
import com.abhishek.collegebuddy.OldSyllabus.FifthSem.cse_sem5_old
import com.abhishek.collegebuddy.OldSyllabus.FirstSem.cse_sem1_old
import com.abhishek.collegebuddy.OldSyllabus.FourthSem.cse_sem4_old
import com.abhishek.collegebuddy.OldSyllabus.SecondSem.cse_sem2_old
import com.abhishek.collegebuddy.OldSyllabus.SeventhSem.cse_sem7_old
import com.abhishek.collegebuddy.OldSyllabus.SixthSem.cse_sem6_old
import com.abhishek.collegebuddy.OldSyllabus.ThirdSem.cse_sem3_old
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_cse_old.*

class old_syllabus_cse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse_old)

        sem1.setOnClickListener {
            val intent = Intent(this, cse_sem1_old::class.java)
            startActivity(intent)
        }

        sem2.setOnClickListener {
            val intent = Intent(this, cse_sem2_old::class.java)
            startActivity(intent)
        }

        sem3.setOnClickListener {
            val intent = Intent(this, cse_sem3_old::class.java)
            startActivity(intent)
        }

        sem4.setOnClickListener {
            val intent = Intent(this, cse_sem4_old::class.java)
            startActivity(intent)
        }

        sem5.setOnClickListener {
            val intent = Intent(this, cse_sem5_old::class.java)
            startActivity(intent)
        }

        sem6.setOnClickListener {
            val intent = Intent(this, cse_sem6_old::class.java)
            startActivity(intent)
        }

        sem7.setOnClickListener {
            val intent = Intent(this, cse_sem7_old::class.java)
            startActivity(intent)
        }

        sem8.setOnClickListener {
            val intent = Intent(this, cse_sem8_old::class.java)
            startActivity(intent)
        }
    }
}
