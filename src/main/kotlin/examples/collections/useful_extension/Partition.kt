package examples.collections.useful_extension

/**
 * The partition function splits the original collection into a pair of lists using a given predicate.
 * Elements for which the predicate is true.
 * Elements for which the predicate is false.
 */

fun main() {
    // Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // Splits numbers into a Pair of lists with even and odd numbers.
    val evenOdd = numbers.partition { it % 2 == 0 }
    println(evenOdd)

    // Splits numbers into two lists with positive and negative numbers.
    // Pair destructuring is applied here to get the Pair members.
    val (positives, negatives) = numbers.partition { it > 0 }
    println("positives: $positives")
    println("negatives: $negatives")
}