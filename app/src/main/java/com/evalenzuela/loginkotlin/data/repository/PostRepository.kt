package com.evalenzuela.loginkotlin.data.repository

import com.evalenzuela.loginkotlin.data.model.Post
import com.evalenzuela.loginkotlin.data.remote.RetrofitInstance

class PostRepository {
    suspend fun getPosts() : List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}