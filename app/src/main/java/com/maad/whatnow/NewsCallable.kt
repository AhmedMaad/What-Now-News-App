package com.maad.whatnow

import retrofit2.Call
import retrofit2.http.GET

interface NewsCallable {

    @GET("/v2/top-headlines?country=us&category=general&apiKey=5c8346c243284b72bac7c40bc2731bc0&pageSize=30")
    fun getNews(): Call<News>

}