package com.evalenzuela.loginkotlin.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evalenzuela.loginkotlin.data.model.Post
import com.evalenzuela.loginkotlin.data.repository.PostRepository
import com.evalenzuela.loginkotlin.data.repository.PostRepositoryInterface
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PostViewModel(
    private val repository: PostRepositoryInterface = PostRepository()
) : ViewModel() {

    protected val _postList = MutableStateFlow<List<Post>>(emptyList())
    open val postList: StateFlow<List<Post>> = _postList

    init {
        fetchPosts()
    }

    private fun fetchPosts() {
        viewModelScope.launch {
            try {
                _postList.value = repository.getPosts()
            } catch (e: Exception) {
                println("Error al obtener los datos: ${e.localizedMessage}")
            }
        }
    }

}


