package official_examples.classes

/**
 * Data classes make it easy to create classes that are used to store values.
 * Such classes are automatically provided with methods for copying,
 * getting a string representation,and using instances in collections.
 * You can override these methods with your own implementations in the class declaration.
 */

fun main() {
    val user1 = User("Can", 1)

    // Method toString is auto-generated, which makes println output look nice.
    println(user1)

    val user2 = User("Osman", 2)
    val user3 = User("Can", 1)

    // Our custom equals considers two instances equal if their ids are equal.
    println("${user1 == user3}")
    println("${user1 == user2}")

    // Data class instances with exactly matching attributes have the same hashCode.
    println(user1.hashCode())
    println(user2.hashCode())
    println(user3.hashCode())

    // Auto-generated copy function makes it easy to create a new instance.
    println(user1.copy())

    // copy creates a new instance, so the object and its copy have distinct references.
    println(user1 === user1.copy())

    // When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
    println(user1.copy("Nazlı"))

    // Use copy with named arguments to change the value despite of the properties order.
    println(user1.copy(id = 3))

    // Auto-generated componentN functions let you get the values of properties in the order of declaration.
    println("name = ${user1.component1()}")
    println("id = ${user1.component2()}")
}

// Defines a data class with the data modifier.
data class User(val name: String, val id: Int) {

    // Override the default equals method by declaring users equal if they have the same id.
    override fun equals(other: Any?): Boolean = other is User && other.id == this.id
}