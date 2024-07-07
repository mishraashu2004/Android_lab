package com.example.ashu

import android.os.Bundle
import android.util.Log
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.Navigator
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
                            .background(Color.White)
                            .padding(30.dp)
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Center
                    )
                    {
                      LoginScreen()
                        register()

                    }
                }
            }
        }
    }
}
@Composable
fun LoginScreen() {
    var emailOrMobile by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column {


        Card(
            modifier = Modifier
                .height(650.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Jetpack Compose" ,color= Color.Blue,style = MaterialTheme.typography.headlineSmall)
                Image(painterResource (R.drawable.jetpack_compose_icon_rgb), contentDescription ="jetpack compose logo", modifier = Modifier.size(250.dp) )
                Text(
                    text = "Login",
                    color = Color.Green,
                    fontSize = 35.sp,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(10.dp)
                        )

                OutlinedTextField(
                    value = emailOrMobile,
                    onValueChange = { emailOrMobile = it },
                    label = { Text("Email ID or Mobile Number") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)

                )
                Spacer(modifier = Modifier.height(1.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    visualTransformation = PasswordVisualTransformation()
                )
                Text(
                    text = "Forgot Password ?",
                    color = Color.Green,
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(10.dp)


                )
                Spacer(modifier = Modifier.height(1.dp))
                Button(
                    onClick = { /*TODO: Login logic */ },
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(10.dp)

                ) {
                    Text(text = "Login")
                }
            }


            }
        }
    }

@Composable
fun register()
{
    Spacer(modifier = Modifier.height(16.dp))
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement  = Arrangement.Center
    ) {
        Text(text = "Don't have an account?")
        Text(text = "Register", color = MaterialTheme.colorScheme.primary)

    }
}
