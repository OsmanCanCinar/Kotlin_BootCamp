package examples.null_safety

import java.io.File

fun main() {

    // If-not-null shorthand
    val files = File("Test").listFiles()
    println(files?.size)

    // If-not-null-else shorthand
    println(files?.size ?: "empty") // if files is null, this prints "empty"

    // To calculate the fallback value in a code block, use `run`
    // val filesSize = files?.size ?: run { return someSize }
    //println(filesSize)
}
