package examples.variables

/**
 * Destructuring declaration syntax can be very handy, especially when you need an instance only for
 * accessing its members. It lets you define the instance without a specific name therefore saving a few lines of code.
 */
fun main() {
    // Destructures an Array. The number of variables on the left side matches the number of
    // arguments on the right side.
    val (x, y, z) = arrayOf(5, 10, 15)

    // Maps can be destructured as well. name and age variables are mapped to the map key and value.
    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {
        println("$name is $age years old.")
    }

    // Built-in Pair and Triple types support destructuring too, even as return values from functions.
    // val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))

    val user = getUser()

    // Destructures an instance. Declared values are mapped to the instance fields.
    val (username, email) = user

    // Data class automatically defines the component1() and component2() methods that
    // will be called during destructuring.
    println(username == user.component1())

    // Use underscore if you don't need one of the values, avoiding the compiler hint indicating an unused variable.
    val (_, emailAddress) = getUser()

    // Destructures an instance of this class the same way as for built-in Pair.
    val (num, name) = Pair(1, "one")

    println("num = $num, name = $name")

}

// Defines a data class.
data class User(val username: String, val email: String)

fun getUser() = User("Mary", "mary@somewhere.com")

// Defines a custom Pair class with component1() and component2() methods.
class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}