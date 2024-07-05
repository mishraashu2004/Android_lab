package com.example.ashu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ashu.ui.theme.AshuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AshuTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.Cyan)
                            .padding(30.dp)
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Ashu1()
                        Ashu2()
                    }
                }
            }
        }
    }
}


@Composable
fun Ashu1() {
    Box(
        modifier = Modifier
            .border(7.dp, Color.DarkGray)
            .background(Color.Cyan)
            .padding(10.dp)
    ) {
        Column {
            Text(
                text = "Hello Android User",
                color = Color.Blue,
                fontStyle = FontStyle.Italic
            )
            Text(
                text = "Hello My Name Is Ashu",
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Good Morning to Everyone",
                color = Color.Magenta)
        }
    }
}

@Composable
fun Ashu2() {
    Row(
        modifier = Modifier
            .background(Color.Cyan)
            .padding(10.dp)
            .border(7.dp, Color.DarkGray)
            .padding(10.dp)
    ) {
        Text(
            text = "I AM A STUDENT OF SILICON UNIVERSITY ",
            color = Color.Blue,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "FROM B_TECh ",
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Batch(2024)", color = Color.Magenta)
    }
}

