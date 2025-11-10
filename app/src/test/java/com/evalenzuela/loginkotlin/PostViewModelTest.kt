package com.evalenzuela.loginkotlin

import com.evalenzuela.loginkotlin.data.model.Post
import com.evalenzuela.loginkotlin.data.repository.PostRepositoryInterface
import com.evalenzuela.loginkotlin.viewmodel.PostViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.flow.first
import org.junit.Assert.*
import org.junit.Test

// Mock simple del repositorio
class FakePostRepository : PostRepositoryInterface {
    override suspend fun getPosts(): List<Post> {
        return listOf(
            Post(1, 1, "Título 1", "Cuerpo 1"),
            Post(2, 2, "Título 2", "Cuerpo 2")
        )
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
class PostViewModelTest {

    @Test
    fun `cuando se inicializa el ViewModel carga los posts correctamente`() = runTest {
        // GIVEN: un repositorio falso con datos estáticos
        val fakeRepository = FakePostRepository()

        // WHEN: se crea el ViewModel con el repositorio falso
        val viewModel = PostViewModel(fakeRepository)

        // THEN: el flujo postList contiene los datos esperados
        val posts = viewModel.postList.first()

        assertEquals(2, posts.size)
        assertEquals("Título de prueba 1", posts.first().title)
    }
}
