package com.evalenzuela.loginkotlin.data.remote

import com.evalenzuela.loginkotlin.data.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}