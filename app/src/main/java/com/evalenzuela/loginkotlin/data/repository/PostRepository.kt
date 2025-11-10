package com.evalenzuela.loginkotlin.data.repository

import com.evalenzuela.loginkotlin.data.model.Post
import com.evalenzuela.loginkotlin.data.remote.RetrofitInstance


interface PostRepositoryInterface {
    suspend fun getPosts(): List<Post>
}
class PostRepository : PostRepositoryInterface {
    override suspend fun getPosts() : List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}


