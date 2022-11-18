package examples.collections.useful_extension

/**
 * minOrNull and maxOrNull functions return the smallest and the largest element of a collection.
 * If the collection is empty, they return null.
 */

fun main() {

    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    // For non-empty collection, functions return the smallest and the largest element.
    println("Numbers: $numbers, min = ${numbers.minOrNull()}, max = ${numbers.maxOrNull()}")

    // For empty collections, both functions return null.
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")

    // For collection with only one element, both functions return the same value.
    println("only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")
}