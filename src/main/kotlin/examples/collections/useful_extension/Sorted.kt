package examples.collections.useful_extension

import kotlin.math.abs

/**
 * sorted returns a list of collection elements sorted according to their natural sort order (ascending).
 * sortedBy sorts elements according to natural sort order of the values returned by specified selector function.
 */

fun main() {

    // Defines a collection of shuffled numbers.
    val shuffled = listOf(5, 4, 2, 1, 3, -10)
    println(shuffled)

    // Sorts it in the natural order.
    val natural = shuffled.sorted()
    println(natural)

    // Sorts it in the inverted natural order by using -it as a selector function.
    val inverted = shuffled.sortedBy { -it }
    println(inverted)

    //Sorts it in the inverted natural order by using sortedDescending.
    val descending = shuffled.sortedDescending()
    println(descending)

    // Sorts it in the inverted natural order of items' absolute values by using abs(it) as a selector function.
    val descendingBy = shuffled.sortedByDescending { abs(it) }
    println(descendingBy)
}