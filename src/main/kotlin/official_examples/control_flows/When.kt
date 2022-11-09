package official_examples.control_flows

/**
 * Instead of the widely used switch statement, Kotlin provides the more flexible and clear when construction.
 * It can be used either as a statement or as an expression.
 */

fun main() {
    whenStatement("Hello")
    whenStatement(1)
    whenStatement(MyClass())
    whenStatement(0L)
    whenStatement("hello")

    println(whenExpression("Hello"))
    println(whenExpression(3.4))
    println(whenExpression(1))
    println(whenExpression(MyClass()))
}

fun whenStatement(obj: Any) {
    when (obj) {
        1 -> println("one")
        "Hello" -> println("greetings")
        is Long -> println("Long")
        !is String -> println("Not a String")
        else -> println("unknown")
    }
}

fun whenExpression(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass