package com.example.ashu2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ashu2.ui.theme.Ashu2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ashu2Theme {
                CounterView()
                val intContainer = genericClass(10)
                val stringContainer = genericClass("Hello, Kotlin!")
                val doubleContainer = genericClass(3.14)


                println("Int Container: $intContainer")
                println("String Container: $stringContainer")
                println("Double Container: $doubleContainer")
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

class genericClass<T>(val item: T) {
}
