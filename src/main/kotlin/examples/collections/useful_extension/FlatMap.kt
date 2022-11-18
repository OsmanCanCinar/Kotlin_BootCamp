package examples.collections.useful_extension

/**
 * flatMap transforms each element of a collection into an iterable object and builds a
 * single list of the transformation results. The transformation is user-defined.
 */

fun main() {
    // Defines a collection of Strings with fruit names.
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")

    // Defines a collection of Strings with clothes names.
    val clothesBag = listOf("shirts", "pants", "jeans")

    // Adds fruitsBag and clothesBag to the cart list.
    val cart = listOf(fruitsBag, clothesBag)

    // Builds a map of cart elements, which is a list of two lists.
    val mapBag = cart.map { it }

    // Builds a flatMap of cart elements, which is a single list consisting of elements from both lists.
    val flatMapBag = cart.flatMap { it }
    println(flatMapBag)

    // alternative
    val flattenMapBag = cart.flatten()
    println(flattenMapBag)
}