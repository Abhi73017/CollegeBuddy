package com.abhishek.collegebuddy.NewSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.NewSyllabus.FirstSem.cse_sem1_new
import com.abhishek.collegebuddy.NewSyllabus.FourthSem.cse_sem4_new
import com.abhishek.collegebuddy.NewSyllabus.SecondSem.cse_sem2_new
import com.abhishek.collegebuddy.NewSyllabus.ThirdSem.cse_sem3_new
import com.abhishek.collegebuddy.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_cse_new.*

class new_syllabus_cse : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse_new)

        sem1.setOnClickListener {
            val intent = Intent(this, cse_sem1_new::class.java)
            startActivity(intent)
        }

        sem2.setOnClickListener {
            val intent = Intent(this, cse_sem2_new::class.java)
            startActivity(intent)
        }

        sem3.setOnClickListener {
            val intent = Intent(this, cse_sem3_new::class.java)
            startActivity(intent)
        }

        sem4.setOnClickListener {
            val intent = Intent(this, cse_sem4_new::class.java)
            startActivity(intent)
        }

        sem7.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }

        sem8.setOnClickListener { view ->

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
