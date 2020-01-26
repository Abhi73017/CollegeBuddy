package com.abhishek.collegebuddy.NewSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.NewSyllabus.FirstSem.civil_sem1_new
import com.abhishek.collegebuddy.NewSyllabus.FourthSem.civil_sem4_new
import com.abhishek.collegebuddy.NewSyllabus.SecondSem.civil_sem2_new
import com.abhishek.collegebuddy.NewSyllabus.ThirdSem.civil_sem3_new
import com.abhishek.collegebuddy.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_civil_new.*

class civilnew : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil_new)

        sem1.setOnClickListener {
            val intent = Intent(this, civil_sem1_new::class.java)
            startActivity(intent)
        }

        sem2.setOnClickListener {
            val intent = Intent(this, civil_sem2_new::class.java)
            startActivity(intent)
        }

        sem3.setOnClickListener {
            val intent = Intent(this, civil_sem3_new::class.java)
            startActivity(intent)
        }

        sem4.setOnClickListener {
            val intent = Intent(this, civil_sem4_new::class.java)
            startActivity(intent)
        }

        sem8.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }

        sem7.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }

        sem5.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }

        sem6.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }
    }
}
