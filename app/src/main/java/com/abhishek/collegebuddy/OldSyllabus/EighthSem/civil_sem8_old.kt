package com.abhishek.collegebuddy.OldSyllabus.EighthSem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import com.abhishek.collegebuddy.R
import kotlinx.android.synthetic.main.activity_civil_sem8_old.*

class civil_sem8_old : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_civil_sem8_old)

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

//        Button 5
        showbtn5.setOnClickListener {
            if (btn5layout.isVisible){
                btn5layout.visibility = View.GONE
            }
            else{
                btn5layout.visibility = View.VISIBLE

            }
        }

//        Button6
        showbtn6.setOnClickListener {
            if (btn6layout.isVisible){
                btn6layout.visibility = View.GONE
            }
            else{
                btn6layout.visibility = View.VISIBLE

            }
        }


//        Button 7

        showbtn7.setOnClickListener {
            if (btn7layout.isVisible){
                btn7layout.visibility = View.GONE
            }
            else{
                btn7layout.visibility = View.VISIBLE

            }
        }

//        Button 8
        showbtn8.setOnClickListener {
            if (btn8layout.isVisible){
                btn8layout.visibility = View.GONE
            }
            else{
                btn8layout.visibility = View.VISIBLE

            }
        }
//        Button9
        showbtn9.setOnClickListener {
            if (btn9layout.isVisible){
                btn9layout.visibility = View.GONE
            }
            else{
                btn9layout.visibility = View.VISIBLE

            }
        }
//        Button 10

        showbtn10.setOnClickListener {
            if (btn10layout.isVisible){
                btn10layout.visibility = View.GONE
            }
            else{
                btn10layout.visibility = View.VISIBLE

            }
        }
    }
}
