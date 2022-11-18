package examples.collections.useful_extension

/**
 * count functions returns either the total number of elements in a collection or
 * the number of elements matching the given predicate.
 */
fun main() {

    //Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // Counts the total number of elements.
    val totalCount = numbers.count()

    // Counts the number of even elements.
    val evenCount = numbers.count { it % 2 == 0 }

}