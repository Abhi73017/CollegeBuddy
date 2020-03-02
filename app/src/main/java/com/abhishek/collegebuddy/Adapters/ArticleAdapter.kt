package com.abhishek.collegebuddy.Adapters

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abhishek.collegebuddy.Article.ParagraphActivity
import com.abhishek.collegebuddy.R
import com.abhishek.collegebuddy.model.Article
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.rcv_single_item.view.*


class ArticleAdapter(val article : List<Article>) : RecyclerView.Adapter<ArticleAdapter.ArticleHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        return ArticleHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.rcv_single_item,parent , false)
        )
    }

    override fun getItemCount() = article.size

    override fun onBindViewHolder(holder: ArticleHolder, position: Int) {
        val article = article[position]
        holder.view.TitleTextview.text = article.title.toString()
        holder.view.setOnClickListener {
            Log.d("Postion : ",position.toString())

            val mintent = Intent(holder.view.context, ParagraphActivity::class.java).apply {
                putExtra("title", article.title)
                putExtra("image", article.image)
                putExtra("para", article.para)
            }
            holder.view.context.startActivity(mintent)

        }

        Glide.with(holder.view.context)
            .load(article.image)
            .placeholder(R.drawable.noimage)
            .into(holder.view.ImagePost)


    }
    class  ArticleHolder(var view: View) : RecyclerView.ViewHolder(view)
}