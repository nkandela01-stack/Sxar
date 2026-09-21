package com.sxar.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Radio
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Track(val title: String, val artist: String)

private val demoTracks = listOf(
    Track("A Thousand Miles", "SXAR Demo"),
    Track("Checkmate", "SXAR Demo"),
    Track("Menace", "SXAR Demo")
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SXARApp()
        }
    }
}

@Composable
fun SXARApp() {
    var selected by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                val items = listOf(
                    "Home" to Icons.Default.Home,
                    "Search" to Icons.Default.Search,
                    "Radio" to Icons.Default.Radio,
                    "Profile" to Icons.Default.Person
                )

                items.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selected == index,
                        onClick = { selected = index },
                        icon = {
                            Icon(
                                item.second,
                                contentDescription = item.first
                            )
                        },
                        label = { Text(item.first) }
                    )
                }
            }
        }
    ) { padding ->
        when (selected) {
            0 -> HomeScreen(Modifier.padding(padding))
            1 -> SearchScreen(Modifier.padding(padding))
            2 -> RadioScreen(Modifier.padding(padding))
            else -> ProfileScreen(Modifier.padding(padding))
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        Text(
            "SXAR",
            style = MaterialTheme.typography.headlineLarge
        )

        Text(
            "Your music. Your sound.",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(Modifier.height(16.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(demoTracks) { track ->
                TrackCard(track)
            }
        }
    }
}

@Composable
fun TrackCard(track: Track) {
    Card(Modifier.fillMaxWidth()) {
        Row(
            Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.weight(1f)) {
                Text(
                    track.title,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    track.artist,
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Button(onClick = {}) {
                Text("Play")
            }
        }
    }
}

@Composable
fun SearchScreen(modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        Text(
            "Search",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(12.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text("Search music, artists or radio")
            }
        )
    }
}

@Composable
fun RadioScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "SXAR Radio",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(16.dp))

        Text("Live radio foundation")

        Spacer(Modifier.height(16.dp))

        Button(onClick = {}) {
            Text("Start Radio")
        }
    }
}

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(modifier.padding(16.dp)) {
        Text(
            "Profile",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(Modifier.height(12.dp))

        Text("Artist profile and premium features coming next.")
    }
}
