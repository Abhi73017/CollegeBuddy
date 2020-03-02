package com.abhishek.collegebuddy.Interface

import com.abhishek.collegebuddy.model.Article
import retrofit2.Call


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

const val  BASE_URL = "https://cbdapi.herokuapp.com/"
interface ArticleInterface {

    @GET("articles")
    fun getArticle(): Call<List<Article>>


    companion object{
        operator fun invoke():ArticleInterface{
            return  Retrofit.Builder()
                .baseUrl( BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ArticleInterface::class.java)
        }
    }
}