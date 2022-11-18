package examples.functions

/**
 * A higher-order function is a function that takes another function as parameter and/or returns a function.
 */

fun main() {
    // Invokes the higher-order function passing in two integer values and the function argument ::sum.
    // :: is the notation that references a function by name in Kotlin.
    val sumResult = calculate(4, 5, ::customSum)

    //Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?
    val mulResult = calculate(4, 5) { a, b -> a * b }

    println(sumResult)
    println(mulResult)

    // Invokes operation to get the result assigned to a variable. Here func becomes square which is returned by operation.
    val func = operation()
    // Invokes func. The square function is actually executed.
    println(func(2))
}

// Declares a function that matches the operation signature.
fun customSum(x: Int, y: Int) = x + y

// Declares a higher-order function. It takes two integer parameters, x and y.
// Additionally, it takes another function operation as a parameter.
// The operation parameters and return type are also defined in the declaration.
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    // The higher order function returns the result of operation invocation with the supplied arguments.
    return operation(x, y)
}

// Declares a higher-order function that returns a function. (Int) -> Int represents the
// parameters and return type of the square function.
fun operation(): (Int) -> Int {
    return ::square
}

// Declares a function matching the signature.
fun square(x: Int) = x * x