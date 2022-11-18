package examples.functions

/**
 * Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.
 */

fun main() {

    // This takes the infix function from above one step further using the operator modifier.
    operator fun Int.times(str: String) = str.repeat(this)
    // The operator symbol for times() is * so that you can call the function using 2 * "Bye".
    println(2 * "Bye")

    // An operator function allows easy range access on strings.
    operator fun String.get(range: IntRange) = substring(range)

    val str = "Always forgive your enemies; nothing annoys them so much."
    // An operator function allows easy range access on strings.
    println(str[0..14])
}