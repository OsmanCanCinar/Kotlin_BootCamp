package examples.classes

/**
 * Enum classes are used to model types that represent a finite set of distinct values,
 * such as directions, states, modes, and so forth.
 */

fun main() {
    // Accesses an enum constant via the class name.
    val state = State.RUNNING

    // With enums, the compiler can infer if a when-expression is exhaustive so that you don't need the else-case.
    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

    println(message)

    // The default toString returns the name of the constant, here "RED".
    val red = Color.RED
    println(red)

    // Calls a method on an enum constant.
    println((red.containsRed()))

    // Calls a method via enum class name.
    println(Color.BLUE.containsRed())

    // The RGB values of RED and YELLOW share first bits (FF) so this prints 'true'.
    println(Color.YELLOW.containsRed())
}

/**
 * Defines a simple enum class with three enum constants.
 * The number of constants is always finite and they are all distinct.
 */
enum class State {
    IDLE, RUNNING, FINISHED
}


/**
 * Enums may contain properties and methods like other classes, separated from
 * the list of enum constants by a semicolon.
 *
 * Defines an enum class with a property and a method.
 */
enum class Color(val rgb: Int) {
    // Each enum constant must pass an argument for the constructor parameter.
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    // Enum class members are separated from the constant definitions by a semicolon.
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}