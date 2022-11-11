package official_examples.collections.useful_extension

/**
 * find and findLast functions return the first or the last collection element that matches the given predicate.
 * If there are no such elements, functions return null.
 */

fun main() {

    // Defines a collection of words.
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    // Looks for the first word starting with "some".
    val first = words.find { it.startsWith("some") }
    println(first)

    // Looks for the last word starting with "some".
    val last = words.findLast { it.startsWith("some") }
    println(last)

    // Looks for the first word containing "nothing".
    val nothing = words.find { it.contains("nothing") }
    println(nothing)
}