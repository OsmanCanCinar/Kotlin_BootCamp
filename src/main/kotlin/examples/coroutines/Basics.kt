package examples.coroutines

import kotlinx.coroutines.*

fun main() {
    GlobalScope.launch {
        hello()
        task()
    }
    hi()
    Thread.sleep(1500)
}

fun hi() {
    println("Hello")
    println(Thread.currentThread().name)
}


suspend fun hello() {
    delay(500)
    println("Kotlin Coroutines World!")
    println(Thread.currentThread().name)
}

suspend fun task() {
    withContext(Dispatchers.IO) {
        delay(500)
        println("World!")
        println(Thread.currentThread().name)
    }
}



