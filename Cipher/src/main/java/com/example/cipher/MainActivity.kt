package com.example.cipher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cipher.ui.theme.CipherTheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CipherTheme {
                Greeting("Android")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CipherTheme {
        Greeting("Android")
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = painterResource(id = R.drawable.galaxy),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.cipher),
                contentDescription = "Logo do app",
                modifier = Modifier
                    .size(250.dp)
                    .padding(16.dp)
            )

            Row {
                Text(text = "Remember!", color = Color.White)
            }

            Row {
                Text(text = "Reality's an illusion,", color = Color.White)
            }

            Row {
                Text(text = "the universe is a hologram,", color = Color.White)
            }

            Row {
                Text(text = "buy gold!", color = Color.White)
            }

            Row {
                Text(text = "Byeeee!", color = Color.White)
            }
        }
    }
}