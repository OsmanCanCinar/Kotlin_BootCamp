package examples.control_flows

/**
 * Kotlin supports all the commonly used loops: for, while, do-while
 */

fun main() {
    forLoop()
    whileLoop()
}

fun forLoop() {
    val vegetables = listOf("Carrot", "Broccoli", "Lettuce")

    for (vegetable in vegetables) {
        println(vegetable)
    }
}

// while and do-while constructs work similarly to most languages as well.
fun whileLoop() {
    var vegetablesEaten = 0
    var vegetablesBaked = 0

    // Executes the block while the condition is true.
    while (vegetablesEaten < 5) {
        eatAVegetable()
        vegetablesEaten++
    }

    // Executes the block first and then checking the condition.
    do {
        bakeAVegetable()
        vegetablesBaked++
    } while (vegetablesBaked < vegetablesEaten)
}

fun eatAVegetable() = println("eat a vegetable")
fun bakeAVegetable() = println("bake a vegetable")