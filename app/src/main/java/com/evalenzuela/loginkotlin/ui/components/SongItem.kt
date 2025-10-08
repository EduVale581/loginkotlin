package com.evalenzuela.loginkotlin.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.evalenzuela.loginkotlin.data.model.Song

@Composable
fun SongItem(
    song: Song,
    onClick: () -> Unit,
    onMenuClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .background(Color(0xFF121212))
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Album Art
        AsyncImage(
            model = song.albumArt,
            contentDescription = "Album art for ${song.title}",
            modifier = Modifier
                .size(56.dp)
                .clip(RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(12.dp))

        // Song Info
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = song.title,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = song.artist,
                color = Color(0xFFB3B3B3),
                fontSize = 14.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        // Menu Icon
        IconButton(
            onClick = onMenuClick,
            modifier = Modifier.size(40.dp)
        ) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "More options",
                tint = Color(0xFFB3B3B3)
            )
        }
    }
}
