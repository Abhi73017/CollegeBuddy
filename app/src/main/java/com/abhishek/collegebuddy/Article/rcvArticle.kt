package com.abhishek.collegebuddy.Article

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.abhishek.collegebuddy.Adapters.ArticleAdapter
import com.abhishek.collegebuddy.Interface.ArticleInterface
import com.abhishek.collegebuddy.R
import com.abhishek.collegebuddy.model.Article
import kotlinx.android.synthetic.main.activity_rcv_article.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class rcvArticle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcv_article)


        ArticleInterface().getArticle().enqueue(object : Callback<List<Article>> {
            override fun onFailure(call: Call<List<Article>>, t: Throwable) {
                Toast.makeText(applicationContext,t.message, Toast.LENGTH_LONG).show()
                println(t.message)
            }

            override fun onResponse(call: Call<List<Article>>, response: Response<List<Article>>) {
                val article  = response.body()
                article?.let {
                    showArticle(it)
                }
            }

        })



    }

    private fun showArticle(it: List<Article>) {
        rvArticles.layoutManager = LinearLayoutManager(applicationContext)
        rvArticles.adapter  = ArticleAdapter(it)
    }


        // App Comp

}
