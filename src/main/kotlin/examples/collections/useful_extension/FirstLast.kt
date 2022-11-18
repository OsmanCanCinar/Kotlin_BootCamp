package examples.collections.useful_extension

/**
 * These functions return the first and the last element of the collection correspondingly.
 * You can also use them with a predicate; in this case, they return the first or the last
 * element that matches the given predicate.
 *
 * If a collection is empty or doesn't contain elements matching the predicate, the functions
 * throw NoSuchElementException.
 */

fun main() {

    // Defines a collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // Picks the first element.
    val first = numbers.first()
    println(first)

    // Picks the last element.
    val last = numbers.last()
    println(last)

    // Picks the first even element.
    val firstEven = numbers.first { it % 2 == 0 }
    println(firstEven)

    // Picks the last odd element.
    val lastOdd = numbers.last { it % 2 == 1 }
    println(lastOdd)

    /**
     * These functions work almost the same way with one difference: they return null if there are no matching elements.
     */

    // Defines a collection of words.
    val words = listOf("foo", "bar", "baz", "faz")

    // Defines an empty collection.
    val empty = emptyList<String>()

    // Picks the first element from empty collection. It supposed to be null.
    val firstElement = empty.firstOrNull()

    // Picks the last element from empty collection. It supposed to be null as well.
    val lastElement = empty.lastOrNull()

    // Picks the first word starting with 'f'.
    val firstF = words.firstOrNull { it.startsWith('f') }
    val lastF = words.lastOrNull { it.endsWith('f') }

}