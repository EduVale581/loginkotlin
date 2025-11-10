package com.evalenzuela.loginkotlin


import androidx.test.ext.junit.runners.AndroidJUnit4
import com.evalenzuela.loginkotlin.data.repository.PostRepository
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class PostRepositoryInstrumentedTest {

    @Test
    fun test_real_api_response() = runBlocking {
        // GIVEN
        val repo = PostRepository()

        // WHEN
        val posts = repo.getPosts()

        // THEN
        assertTrue(posts.isNotEmpty())
        assertNotNull(posts.first().title)
    }
}

