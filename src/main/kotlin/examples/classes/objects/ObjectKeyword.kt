package examples.classes.objects

import java.util.Random

/**
 * Classes and objects in Kotlin work the same way as in most object-oriented languages: a class is a blueprint,
 * and an object is an instance of a class. Usually, you define a class and then create multiple instances of that class.
 */
fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
}

// Defines a blueprint.
class LuckDispatcher {
    // Defines a method.
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}


