package examples.collections.useful_extension

/**
 * getOrElse provides safe access to elements of a collection. It takes an index and a function
 * that provides the default value in cases when the index is out of bound.
 */
fun main() {

    val list = listOf(0, 10, 20)

    // Prints the element at the index 1.
    println(list.getOrElse(1) { 42 })

    // Prints 42 because the index 10 is out of bounds.
    println(list.getOrElse(10) { 42 })

    /**
     * getOrElse can also be applied to Map to get the value for the given key.
     */
    val map = mutableMapOf<String, Int?>()

    // Prints the default value because the key "x" is not in the map.
    println(map.getOrElse("x") { 1 })

    // Prints 3, the value for the key "x".
    map["x"] = 3
    println(map.getOrElse("x") { 1 })

    // Prints the default value because the value for the key "x" is not defined.
    map["x"] = null
    println(map.getOrElse("x") { 1 })
}