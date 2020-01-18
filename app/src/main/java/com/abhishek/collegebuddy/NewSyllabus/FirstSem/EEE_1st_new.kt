package com.abhishek.collegebuddy.NewSyllabus.FirstSem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_eee_sem1_new.*

class EEE_1st_new : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eee_sem1_new)
        showbtn.setOnClickListener {
            if (customtxt.isVisible){
                customtxt.visibility = View.GONE
            }
            else{
                customtxt.visibility = View.VISIBLE

            }
        }
        showbtn2.setOnClickListener {
            if (customtxt2.isVisible){
                customtxt2.visibility = View.GONE
            }
            else{
                customtxt2.visibility = View.VISIBLE

            }
        }
    }
}
