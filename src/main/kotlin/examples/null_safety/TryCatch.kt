package examples.null_safety

// try-catch expression
fun main() {
    val result = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
}

fun count() {

}

