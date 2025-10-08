package com.evalenzuela.loginkotlin.ui.screens.user

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.evalenzuela.loginkotlin.ui.components.TextFieldModificado
import com.evalenzuela.loginkotlin.ui.theme.Black
import com.evalenzuela.loginkotlin.ui.theme.Green
import com.evalenzuela.loginkotlin.ui.theme.White

@Composable
fun AddScreen() {
    var nombre by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Black)
            .padding(16.dp)
    ) {
        Text(
            text = "Agregar nuevo",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = White
        )
        Spacer(Modifier.height(16.dp))

        TextFieldModificado(nombre, {
            nombre = it
        }, false, "Nombre")


        Spacer(Modifier.height(16.dp))
        Button(
            onClick = { /* Guardar en Firebase */ },
            colors = ButtonDefaults.buttonColors(containerColor = Green),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Guardar", color = White)
        }
    }
}
