package examples.idioms

/**
 * A collection of random and frequently used idioms in Kotlin.
 */
fun main() {

    // Swap two variables
    var a = 1
    var b = 2
    a = b.also { b = a }


    // Builder-style usage of methods that return Unit
    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }
}