package com.example.uesanapp.presentation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil3.compose.AsyncImage
import com.example.uesanapp.data.model.CountryModel

val mockCountries = listOf<CountryModel>(
    CountryModel(
        "Colombia",
        5,
        "https://flagcdn.com/w320/co.png"
    ),
    CountryModel(
        "Francia",
        3,
        "https://flagcdn.com/w320/fr.png"
    ),
    CountryModel(
        "Brasil",
        8,
        "https://flagcdn.com/w320/br.png"
    ),
    CountryModel(
        "España",
        2,
        "https://flagcdn.com/w320/es.png"
    ),
    CountryModel(
        "Portugal",
        7,
        "https://flagcdn.com/w320/pt.png"
    ),
    CountryModel(
        "Argentina",
        1,
        "https://flagcdn.com/w320/ar.png"
    ),
    CountryModel(
        "Japon",
        10,
        "https://flagcdn.com/w320/jp.png"
    ),
    CountryModel(
        "Peru",
        50,
        "https://flagcdn.com/w320/pe.png"
    )
)

@Composable
fun HomeScreen(nav: NavHostController) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Ranking FIFA 2026")
        Spacer(Modifier.height(8.dp))
        LazyColumn {
            items(mockCountries) { country ->
                Card(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 16.dp)
                ) {
                    Row(modifier = Modifier.padding(12.dp)) {
                        AsyncImage(
                            model = country.imageUrl,
                            contentDescription = country.name,
                            modifier = Modifier.size(64.dp),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Column {
                            Text(country.name, style = MaterialTheme.typography.titleMedium)
                            Text("Ranking FIFA 2026: ${country.ranking}")
                        }
                    }
                }
            }
        }
    }
}