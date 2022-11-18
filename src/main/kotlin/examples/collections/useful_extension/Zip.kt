package examples.collections.useful_extension

/**
 * zip function merges two given collections into a new collection. By default,
 * the result collection contains Pairs of source collection elements with the same index.
 * However, you can define your own structure of the result collection element.
 *
 * The size of the result collection equals to the minimum size of a source collection.
 */

fun main() {

    // Defines two collections.
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)

    // Merges them into a list of pairs. The infix notation is used here.
    val resultPairs = A zip B
    println(resultPairs)

    // Merges them into a list of String values by the given transformation.
    val resultReduce = A.zip(B) { a, b -> "$a$b" }
    println(resultReduce)
}