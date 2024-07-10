package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackTheme {
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
                        verticalArrangement = Arrangement.Center
                    )
                    {
                        CounterView()

                    }
                }
            }
        }
    }
}

@Composable
fun CounterView(counterVM: CounterViewModel = viewModel()) {
    val counterState by counterVM.counter

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Current counter value: ${counterState.count}")
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(onClick = { counterVM.incrementCounter() }) {
                Text("Increment")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { counterVM.decrementCounter() }) {
                Text("Decrement")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { counterVM.resetCounter() }) {
            Text("Reset")
        }
    }
}



// Model classes
data class Counter(val count: Int)
data class User(val username: String, val password: String)

// ViewModel class
// ViewModel class
class CounterViewModel : ViewModel() {
    private val _counter = mutableStateOf(Counter(0))
    val counter: State<Counter> = _counter

    fun incrementCounter() {
        _counter.value = Counter(_counter.value.count + 1)
    }

    fun decrementCounter() {
        _counter.value = Counter(_counter.value.count - 1)
    }

    fun resetCounter() {
        _counter.value = Counter(0)
    }

}

