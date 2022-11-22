package examples.variables

/**
 * Kotlin has powerful type inference. While you can explicitly declare the type of a variable,
 * you'll usually let the compiler do the work by inferring it. Kotlin does not enforce immutability,
 * though it is recommended. In essence use val over var.
 */

fun main() {

    // Declares a mutable variable and initializes it.
    var a: String = "initial"
    println(a)

    // Declares an immutable variable and initializes it.
    val b: Int = 1

    // Declares an immutable variable and initializes it without specifying the type. The compiler infers the type Int.
    val c = 3


    // You're free to choose when you initialize a variable, however, it must be initialized before the first read.
    // Declares a variable without initialization.
    val d: Int

    d = if (true) {
        1
    } else {
        2
    }

    /**
     * String templates allow you to include variable references and expressions into strings. When the value
     * of a string is requested (for example, by println), all references and expressions are substituted
     * with actual values.
     */

    // Prints a string with a variable reference. References in strings start with $.
    val greeting = "Kotliner"

    //Prints a string with an expression. Expressions start with $ and are enclosed in curly braces.
    // String interpolation
    println("Hello $greeting")
    println("Hello ${greeting.uppercase()}")


    // Nullable Boolean
    val z: Boolean? = null
    if (z == true) {
    } else {
        // `b` is false or null
    }
}