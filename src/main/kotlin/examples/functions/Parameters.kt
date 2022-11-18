package examples.functions

/**
 * Default Parameter Values and Named Arguments
 *
 * Kotlin also supports named arguments to allow clearer invocations and avoid mistakes with the order of
 * arguments. Such mistakes are hard to find because they are not detected by the compiler, for example,
 * when two sequential arguments have the same type.
 */

fun main() {
    // Calls the first function with the argument.
    printMessage("Hey Can!")

    // Calls the function with two parameters, passing values for both of them.
    // Calls a function with argument values.
    printMessageWithPrefix("Hey Can!", "Log")

    // Calls a function with switched arguments. No syntax errors, but the result is incorrect.
    printMessageWithPrefix("Log", "Hey Can!")

    // Calls the same function omitting the second one. The default value Info is used.
    printMessageWithPrefix("Hey Can!")

    // Calls a function with named arguments.
    printMessageWithPrefix(message = "Hey Can!", prefix = "Log")

    // Calls the same function using named arguments and changing the order of the arguments.
    // When invoking a function with named arguments, you can specify them in any order you like.
    printMessageWithPrefix(prefix = "Log", message = "Hey Can!")

    // Prints the result of the sum function call.
    println(sum(1, 2))

    // Prints the result of the multiply function call.
    println(multiply(1, 3))
}

// A simple function that takes a parameter of type String and returns Unit (i.e., no return value).
fun printMessage(message: String): Unit {
    println(message)
}

// A function that takes a second optional parameter with default value Info. The return type is omitted,
// meaning that it's actually Unit.
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

// A function that returns an integer.
fun sum(x: Int, y: Int): Int {
    return x + y
}

// A single-expression function that returns an integer (inferred).
fun multiply(x: Int, y: Int) = x * y