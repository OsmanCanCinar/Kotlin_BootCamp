package official_examples.collections.useful_extension

/**
 * These functions check the existence of collection elements that match a given predicate.
 */

fun main() {

    // Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    /**
     * Function any returns true if the collection contains at least one element that matches the given predicate.
     */

    // Checks if there are negative elements.
    val anyNegative = numbers.any { it < 0 }

    /**
     * Function all returns true if all elements in collection match the given predicate.
     */

    // Checks whether all elements are even.
    val allEven = numbers.all { it % 2 == 0 }

    /**
     * Function none returns true if there are no elements that match the given predicate in the collection.
     */

    // Checks if there are no odd elements (all elements are even).
    val noOdd = numbers.none {
        it % 2 == 1
    }

    println(anyNegative)
    println(allEven)
    println(noOdd)
}