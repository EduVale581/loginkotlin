package com.evalenzuela.loginkotlin.ui.screens.user

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.evalenzuela.loginkotlin.data.model.SampleSongs
import com.evalenzuela.loginkotlin.ui.components.SongItem
import com.evalenzuela.loginkotlin.ui.theme.Black
import com.evalenzuela.loginkotlin.ui.theme.Gray
import com.evalenzuela.loginkotlin.ui.theme.White

@Composable
fun HomeScreen() {
    val songs = remember { SampleSongs.songs }
    Column(
        modifier = Modifier.fillMaxSize()
            .fillMaxSize().background(Black).padding(16.dp)
    ) {
        Text(
            text = "Inicio",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = White
        )
        Spacer(Modifier.height(16.dp))
// Song List
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(songs) { song ->
                SongItem(
                    song = song,
                    onClick = {
                        // onNavigateToDetail(song.id.toString())
                    },
                    onMenuClick = {
                        // Handle menu click
                    }
                )
            }
        }
    }
}
