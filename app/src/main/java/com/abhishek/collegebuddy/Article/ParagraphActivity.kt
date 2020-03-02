package com.abhishek.collegebuddy.Article

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.abhishek.collegebuddy.R
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_paragraph.*

class ParagraphActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paragraph)

        val intent = intent
        val title = intent.getStringExtra("title")
        val image = intent.getStringExtra("image")
        val para = intent.getStringExtra("para")
        paraTitleText.text = title
        paraText.text = para

        Glide.with(applicationContext)
            .load(image)
            .placeholder(R.drawable.noimage)
            .into(paraImage)
    }
}
