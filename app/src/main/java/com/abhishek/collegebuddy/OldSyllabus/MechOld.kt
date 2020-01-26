package com.abhishek.collegebuddy.OldSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.OldSyllabus.EighthSem.mech_sem8_old
import com.abhishek.collegebuddy.OldSyllabus.FifthSem.mech_sem5_old
import com.abhishek.collegebuddy.OldSyllabus.FirstSem.mech_sem1_old
import com.abhishek.collegebuddy.OldSyllabus.FourthSem.mech_sem4_old
import com.abhishek.collegebuddy.OldSyllabus.SecondSem.mech_sem2_old
import com.abhishek.collegebuddy.OldSyllabus.SeventhSem.mech_sem7_old
import com.abhishek.collegebuddy.OldSyllabus.SixthSem.mech_sem6_old
import com.abhishek.collegebuddy.OldSyllabus.ThirdSem.mech_sem3_old
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_mech_old.*

class MechOld : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mech_old)

        sem1.setOnClickListener {
            val intent = Intent(this, mech_sem1_old::class.java)
            startActivity(intent)
        }

        sem2.setOnClickListener {
            val intent = Intent(this, mech_sem2_old::class.java)
            startActivity(intent)
        }

        sem3.setOnClickListener {
            val intent = Intent(this, mech_sem3_old::class.java)
            startActivity(intent)
        }

        sem4.setOnClickListener {
            val intent = Intent(this, mech_sem4_old::class.java)
            startActivity(intent)
        }

        sem5.setOnClickListener {
            val intent = Intent(this, mech_sem5_old::class.java)
            startActivity(intent)
        }


        sem6.setOnClickListener {
            val intent = Intent(this, mech_sem6_old::class.java)
            startActivity(intent)
        }

        sem7.setOnClickListener {
            val intent = Intent(this, mech_sem7_old::class.java)
            startActivity(intent)
        }

        sem8.setOnClickListener {
            val intent = Intent(this, mech_sem8_old::class.java)
            startActivity(intent)
        }
    }


}
