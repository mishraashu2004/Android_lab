import kotlinx.coroutines.*
import java.util.concurrent.TimeUnit

fun main() {
    runBlocking {
         println("Hello")
        launch {
            delay(1000L)
            println("World")
        }
    }
}
