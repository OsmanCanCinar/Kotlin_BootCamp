package examples.control_flows

/**
 * Kotlin uses == for structural comparison and === for referential comparison.
 * More precisely, a == b compiles down to if (a == null) b == null else a.equals(b).
 */

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    // Returns true because it calls authors.equals(writers) and sets ignore element order.
    println(authors == writers)

    // Returns false because authors and writers are distinct references.
    println(authors === writers)

    println(max(99, -42))
}

/**
 * There is no ternary operator condition ? then : else in Kotlin. Instead, if can be used as an expression.
 * if is an expression here: it returns a value.
 */
fun max(a: Int, b: Int) = if (a > b) a else b