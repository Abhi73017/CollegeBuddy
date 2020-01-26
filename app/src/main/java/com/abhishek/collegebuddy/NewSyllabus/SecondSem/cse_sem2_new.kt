package com.abhishek.collegebuddy.NewSyllabus.SecondSem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_cse_sem2_new.*


class cse_sem2_new : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cse_sem2_new)

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
