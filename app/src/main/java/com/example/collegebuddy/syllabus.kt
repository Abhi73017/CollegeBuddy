package com.example.collegebuddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.collegebuddy.Adapters.SyllabusPagerAdapter

import kotlinx.android.synthetic.main.activity_syllabus.*

class syllabus : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_syllabus)

        var fragmentAdapter = SyllabusPagerAdapter(supportFragmentManager)

        viewPagerSyllabus.adapter = fragmentAdapter

        tabs.setupWithViewPager(viewPagerSyllabus)

        back_btn.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)
        }
    }
}
