package com.evalenzuela.loginkotlin.data.model
data class Song(
    val id: Int,
    val title: String,
    val artist: String,
    val albumArt: String // URL o placeholder
)

// Datos precargados de ejemplo
object SampleSongs {
    val songs = listOf(
        Song(1, "Breakaway", "Glassio", "https://picsum.photos/200?random=1"),
        Song(2, "Blinding Lights", "The Weeknd", "https://picsum.photos/200?random=2"),
        Song(3, "Shape of You", "Ed Sheeran", "https://picsum.photos/200?random=3"),
        Song(4, "Levitating", "Dua Lipa", "https://picsum.photos/200?random=4"),
        Song(5, "Starboy", "The Weeknd", "https://picsum.photos/200?random=5"),
        Song(6, "Perfect", "Ed Sheeran", "https://picsum.photos/200?random=6"),
        Song(7, "Don't Start Now", "Dua Lipa", "https://picsum.photos/200?random=7"),
        Song(8, "Save Your Tears", "The Weeknd", "https://picsum.photos/200?random=8"),
        Song(9, "Bad Habits", "Ed Sheeran", "https://picsum.photos/200?random=9"),
        Song(10, "Physical", "Dua Lipa", "https://picsum.photos/200?random=10")
    )
}
