package com.abhishek.collegebuddy.NewSyllabus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.NewSyllabus.FirstSem.EEE_1st_new
import com.abhishek.collegebuddy.NewSyllabus.FourthSem.eee_sem4_new
import com.abhishek.collegebuddy.NewSyllabus.SecondSem.eee_sem2_new
import com.abhishek.collegebuddy.NewSyllabus.ThirdSem.eee_sem3_new
import com.abhishek.collegebuddy.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_eee__new.*
import kotlinx.android.synthetic.main.fragment_contact_us.view.*

class EeeNew : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee__new)
        sem1.setOnClickListener{
            val intent = Intent(this, EEE_1st_new::class.java)
            startActivity(intent)
        }

        sem2.setOnClickListener{
            val intent = Intent(this, eee_sem2_new::class.java)
            startActivity(intent)
        }

        sem3.setOnClickListener{
            val intent = Intent(this, eee_sem3_new::class.java)
            startActivity(intent)
        }

        sem4.setOnClickListener{
            val intent = Intent(this, eee_sem4_new::class.java)
            startActivity(intent)
        }

        sem5.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }

        sem6.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }

        sem7.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }

        sem8.setOnClickListener { view ->

            Snackbar.make(view, "Coming Soon..", Snackbar.LENGTH_LONG).show()
        }
    }
}
