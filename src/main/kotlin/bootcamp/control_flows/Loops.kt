package bootcamp.control_flows

import java.util.Calendar

fun main() {
    var list = listOf(1, 2, "3", 4, 1.1)

    for ((index, element) in list.withIndex()) {
        println("element at $index is $element")
    }

    for (i in 1..10) println(i)


    for (i in 5 downTo 1) println(i)

    for (i in 3..6 step 2) println(i)

    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))

    val ints = IntArray(5) { it * 2 }

    for (item: Int in ints) {
        println(item)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    var x = 5

    while (x > 0) {
        x--
    }

    fun getY(): Int {
        return 4
    }
    do {
        val y = getY()
    } while (y != null) // y is visible here!

    // x in a..b, x !in a..b
}