package com.example.frontend.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.frontend.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen() {
        CenterAlignedTopAppBar(title = { Text("About") })
    Column {
        Image(
            painter = painterResource(id = R.drawable.kucing),
            contentDescription = "Profil",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .offset(y = 15.dp)
                .requiredWidth(width = 450.dp)
                .requiredHeight(height = 370.dp)
        )
        Text("Nama: Ade Iryanto")
        Text("Email: adheiryanto3@gmail.com")
        Text("Asal Perguruan Tinggi: Universitas Papua")
        Text("Jurusan: Informatika")
    }
}