package com.evalenzuela.loginkotlin

import com.evalenzuela.loginkotlin.ui.screens.user.AddScreen
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.*
import org.junit.Rule
import org.junit.Test

class AddScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun muestraTituloYCampos() {
        composeTestRule.setContent {
            AddScreen()
        }

        // Verificar título
        composeTestRule.onNodeWithText("Agregar nuevo").assertIsDisplayed()

        // Verificar campo "Nombre"
        composeTestRule.onNodeWithText("Nombre").assertIsDisplayed()

        // Escribir texto en el TextField
        composeTestRule.onNodeWithText("Nombre").performTextInput("Juan Pérez")

        // Verificar que el texto se escribió correctamente
        composeTestRule.onNodeWithText("Juan Pérez").assertIsDisplayed()

        // Verificar que el botón "Guardar" aparece y se puede clickear
        composeTestRule.onNodeWithText("Guardar").assertIsDisplayed()
        composeTestRule.onNodeWithText("Guardar").performClick()
    }
}
