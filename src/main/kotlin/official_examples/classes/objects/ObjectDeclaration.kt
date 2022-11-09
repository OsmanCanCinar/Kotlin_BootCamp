package official_examples.classes.objects

/**
 * You can also use the object declaration. It isn't an expression, and can't be used in a variable assignment.
 * You should use it to directly access its members.
 */

fun main() {
    // Calls the method. This is when the object is actually created.
    DoAuth.takeParams("Can", "123")
}

// Creates an object declaration.
object DoAuth {
    // Defines the object method.
    fun takeParams(name: String, password: String) {
        println("$name and $password")
    }
}