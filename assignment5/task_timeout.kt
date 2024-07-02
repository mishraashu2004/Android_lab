import kotlinx.coroutines.*
fun main() = runBlocking {
    val job = launch {
        try {
            withTimeout(2000L) {
                longRunningTask()
            }
        } catch (e: TimeoutCancellationException) {
            println("Task took too long and was canceled.")
        }
    }
    
    job.join()
}
suspend fun longRunningTask() {
    repeat(5) { i ->
        println("Task is running step $i...")
        delay(1000L)
    }
}
