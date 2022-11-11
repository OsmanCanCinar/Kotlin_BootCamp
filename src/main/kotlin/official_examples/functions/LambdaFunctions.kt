package official_examples.functions

/**
 * Lambda functions ("lambdas") are a simple way to create functions ad-hoc.
 * Lambdas can be denoted very concisely in many cases thanks to type inference and the implicit it variable.
 */

// All examples create a function object that performs upper-casing.
// So it's a function from String to String
fun main() {

    // A lambda in all its glory, with explicit types everywhere. The lambda is the part in curly braces,
    // which is assigned to a variable of type (String) -> String (a function type).
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }

    // Type inference inside lambda: the type of the lambda parameter
    // is inferred from the type of the variable it's assigned to.
    val upperCase2: (String) -> String = { str -> str.uppercase() }

    // Type inference outside lambda: the type of the variable is inferred
    // from the type of the lambda parameter and return value.
    val upperCase3 = { str: String -> str.uppercase() }

    // For lambdas with a single parameter, you don't have to explicitly name it.
    // Instead, you can use the implicit it variable. This is especially useful
    // when the type of it can be inferred (which is often the case).
    val upperCase4: (String) -> String = { it.uppercase() }

    // If your lambda consists of a single function call, you may use function pointers (::) .
    val upperCase5: (String) -> String = String::uppercase

    println(upperCase1("can"))
    println(upperCase2("can"))
    println(upperCase3("can"))
    println(upperCase4("can"))
    println(upperCase5("can"))

}