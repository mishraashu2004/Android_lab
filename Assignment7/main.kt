package com.example.ashu

import android.os.Bundle
import android.util.Log
import android.widget.Switch
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
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
                    )
                    {
                        Ashu()
                        Ashu1()
                        Ashu3()
                        Ashu2()
                        Ashu4()
                        Ashu5()
                        Ashu6()
                        Ashu7()
                        Ashu8()
                    }
                }
            }
        }
    }
}

@Composable
fun Ashu() {
    Column {
        Button(shape = RectangleShape,onClick = { println( "Android")},
            colors = ButtonDefaults.buttonColors(Color.Green)

        ) {
            Text(text = "Hello user",color = Color.Blue)

        }
    }

}

@Composable
fun Ashu1() {
        Column {
            Button(shape = CircleShape  ,onClick = { println( "hello user")},
                colors = ButtonDefaults.buttonColors(Color.Magenta)

             ) {
                Text(text = "hello",color = Color.Cyan)

            }
        }

}
@Composable
fun Ashu3() {
    Column {
        Button(shape= RoundedCornerShape(5.dp),onClick = { println( "Good afternoon")},
            colors = ButtonDefaults.buttonColors(Color.Gray)
         
        ) {
            Icon(
                Icons.Rounded.ShoppingCart,
                contentDescription = "Add To Cart"
            )
            Text(text = "  Add To Cart",color = Color.Red)

        }
    }

}
@Composable
fun Ashu2() {
    Column {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.White

            ),
            modifier = Modifier
                .size(width = 100.dp, height = 100.dp),
            onClick = { println("Hello user i am a card") }) {
            Text(text = "Hello Good Morning to All", color = Color.Red)

       }


    }

}

@Composable
fun Ashu4() {
    Column {
        AssistChip(
            onClick = {
                println("Hello every one") },
            label = { Text("Settings") },
            leadingIcon = {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "Localized description",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            }
            )



    }

}
@Composable

fun Ashu5() {
    var value by remember { mutableFloatStateOf(0f) }
    Column {
        Slider(
            value = value,
            onValueChange = {value= it }
        )
        Text(text = value.toString())
        }


}

@Composable
fun Ashu6() {
    var checked by remember { mutableStateOf(true) }
    Column {
        Switch(
            checked = checked,
            onCheckedChange = { checked = it }
        )
    }

}
@Composable
fun Ashu7() {

    Column (
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text("Ashutosh Misra")
        HorizontalDivider(thickness = 2.dp)
        Text("Roll no 21")
    }

}
@Composable
fun Ashu8() {
    var loading by remember { mutableStateOf(false) }

    Button(onClick = { loading = true }, enabled = !loading) {
        Text("Start loading")
    }

    if (!loading) return

    CircularProgressIndicator(
        modifier = Modifier.width(64.dp),
        color = MaterialTheme.colorScheme.secondary,
        trackColor = MaterialTheme.colorScheme.surfaceVariant,
    )


}





