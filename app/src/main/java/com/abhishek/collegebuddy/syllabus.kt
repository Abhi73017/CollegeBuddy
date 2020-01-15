package com.abhishek.collegebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.Adapters.SyllabusPagerAdapter

import kotlinx.android.synthetic.main.activity_syllabus.*

class syllabus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_syllabus)

        var fragmentAdapter = SyllabusPagerAdapter(supportFragmentManager)

        viewPagerSyllabus.adapter = fragmentAdapter

        tabs.setupWithViewPager(viewPagerSyllabus)

        back_btn.setOnClickListener {
            startActivity(Intent(this, dashboard::class.java))


        }
    }
}
