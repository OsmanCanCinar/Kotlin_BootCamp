package examples.collections.useful_extension

/**
 * map extension function enables you to apply a transformation to all elements in a collection.
 * It takes a transformer function as a lambda-parameter.
 */
fun main() {
    // Defines a collection of numbers.
    val numbers = listOf<Int>(1, 2, 3, 4)

    // Doubles numbers.
    val doubled = numbers.map { x -> x * 2 }

    //Uses the shorter it notation to triple the numbers.
    val tripled = numbers.map { it * 3 }
}