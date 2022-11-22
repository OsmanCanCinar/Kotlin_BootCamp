package examples.control_flows

fun main() {

    // Iterates over a range starting from 0 up to 3 (inclusive).
    // Like 'for(i=0; i<=3; ++i)' in other programming languages (C/C++/Java).
    // closed range: includes 3
    for (i in 0..3) {
        print(i)
    }
    println()

    // Iterates over a range starting from 0 up to 3 (exclusive).
    // Like for loop in Python or like 'for(i=0; i<3; ++i)' in other programming languages (C/C++/Java).
    // // half-open range: does not include 3
    for (i in 0 until 3) {
        print(i)
    }
    println()

    // Iterates over a range with a custom increment step for consecutive elements.
    for (i in 2..8 step 2) {
        print(i)
    }
    println()

    // Iterates over a range in reverse order.
    for (i in 3 downTo 0) {
        print(i)
    }
    println()

    // Iterates over a char range in alphabetical order.
    for (char in 'a'..'d') {
        print(char)
    }
    println()

    // Char ranges support step and downTo as well.
    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    println()

    val x = 2
    // Checks if a value is in the range.
    if (x in 1..5) {
        print("$x is in interval")
    }
    println()

    // !in is the opposite of in.
    if (x !in 6..10) {
        print("$x is not in interval")
    }

    (1..10).forEach {}
}