package com.abhishek.collegebuddy.NewSyllabus.FirstSem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.R
import androidx.core.view.isVisible
import android.view.View
import kotlinx.android.synthetic.main.activity_civil_sem1_new.*


class civil_sem1_new : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil_sem1_new)

        showbtn.setOnClickListener {
            if (btn1layout.isVisible){
                btn1layout.visibility = View.GONE

            }
            else{
                btn1layout.visibility = View.VISIBLE


            }
        }

//        Button2
        showbtn2.setOnClickListener {
            if (btn2layout.isVisible){
                btn2layout.visibility = View.GONE
            }
            else{
                btn2layout.visibility = View.VISIBLE

            }
        }

//        Button3
        showbtn3.setOnClickListener {
            if (btn3layout.isVisible){
                btn3layout.visibility = View.GONE
            }
            else{
                btn3layout.visibility = View.VISIBLE

            }
        }

//        Button4
        showbtn4.setOnClickListener {
            if (btn4layout.isVisible){
                btn4layout.visibility = View.GONE
            }
            else{
                btn4layout.visibility = View.VISIBLE

            }
        }

    }
}
