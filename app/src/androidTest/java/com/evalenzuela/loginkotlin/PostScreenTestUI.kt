package com.evalenzuela.loginkotlin

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.*
import com.evalenzuela.loginkotlin.ui.screens.user.PostScreen
import org.junit.Rule
import org.junit.Test


class PostScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()
    @Test
    fun muestraElTituloYLosPosts() {
        composeTestRule.setContent {
            PostScreen()
        }
        // Verificar título principal
        composeTestRule.onNodeWithText("Listado de Posts").assertIsDisplayed()
    }

    @Test
    fun muestraTitulo() {
        composeTestRule.setContent {
            PostScreen()
        }
        // Verificar título principal
        composeTestRule.onNodeWithText("Titulo: Título 1").assertIsDisplayed()
        composeTestRule.onNodeWithText("Titulo: Título 2").assertIsDisplayed()
    }
}