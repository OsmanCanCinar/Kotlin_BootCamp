package examples.functions.scope_functions

/**
 * The Kotlin standard library function let can be used for scoping and null-checks. When called on an object,
 * let executes the given block of code and returns the result of its last expression. The object is accessible
 * inside the block by the reference it (by default) or a custom name.
 */

fun main() {
    // Calls the given block on the result on the string "test".
    val empty = "test".let {
        // Calls the function on "test" by the it reference.
        customPrint(it)
        // let returns the value of this expression.
        it.isEmpty()
    }

    println("empty: $empty")

    printNonNull("ab")
    printNonNull(null)
    printIfBothNonNull("ab", "cd")
    printIfBothNonNull("ab", null)
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    // Uses safe call, so let and its code block will be executed only on non-null values.
    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    // Uses the custom name instead of it, so that the nested let can access the context object of the outer let.
    strOne?.let { firstString ->
        strTwo?.let { secondString ->
            customPrint("$firstString : $secondString ")
            println()
        }
    }
}

fun customPrint(str: String) {
    println(str)
}