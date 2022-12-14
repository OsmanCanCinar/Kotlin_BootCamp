package examples.delegation

/**
 * The Kotlin standard library contains a bunch of useful delegates, like lazy, observable, and others.
 * You may use them as is. For example lazyis used for lazy initialization.
 *
 * If you want thread safety, use blockingLazy() instead: it guarantees that the values will be computed
 * only in one thread and that all threads will see the same value.
 */
fun main() {

    // Property lazy is not initialized on object creation.
    val sample = LazySimple()

    // The first call to get() executes the lambda expression passed to lazy() as an argument and saves the result.
    println("lazyStr = ${sample.lazyStr}")

    // Further calls to get() return the saved result.
    println(" = ${sample.lazyStr}")

    val user = User(
        mapOf(
            "name" to "John Doe",
            "age" to 25
        )
    )

    println("name = ${user.name}, age = ${user.age}")
}

class LazySimple {
    init {
        // Property lazy is not initialized on object creation.
        println("created!")
    }

    // The first call to get() executes the lambda expression passed to lazy() as an argument and saves the result.
    // the value is computed only on first access
    val lazyStr: String by lazy {
        println("computed!")
        // compute the string
        "my lazy"
    }
}

/**
 * Property delegation can be used for storing properties in a map. This is handy for tasks like parsing
 * JSON or doing other "dynamic" stuff.
 *
 * You can delegate mutable properties to a map as well. In this case, the map will be modified upon property
 * assignments. Note that you will need MutableMap instead of read-only Map.
 */
class User(val map: Map<String, Any?>) {
    // Delegates take values from the map by the string keys - names of properties.
    val name: String by map
    val age: Int by map
}