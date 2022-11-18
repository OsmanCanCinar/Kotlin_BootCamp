package examples.collections.useful_extension

/**
 * When applied to a map, [] operator returns the value corresponding to the given key, or
 * null if there is no such key in the map.
 *
 * getValue function returns an existing value corresponding to the given key or throws an
 * exception if the key wasn't found. For maps created with withDefault, getValue returns
 * the default value instead of throwing an exception.
 */

fun main() {

    val map = mapOf("key" to 42)

    // Returns 42 because it's the value corresponding to the key "key".
    val value1 = map["key"]
    println(value1)

    // Returns 42 because it's the value corresponding to the key "key".
    val value2 = map.getValue("key")
    println(value2)

    // Returns null because "key2" is not in the map.
    val value3 = map["key2"]
    println(value3)

    val mapWithDefault = map.withDefault { k -> k.length }

    // Returns the default value because "key2" is absent. For this key it's 4.
    val value4 = mapWithDefault.getValue("key2")
    println(value4)

    // Throws NoSuchElementException because "anotherKey" is not in the map.
    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
}