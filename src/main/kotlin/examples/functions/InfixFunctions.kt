package examples.functions

/**
 * Member functions and extensions with a single parameter can be turned into infix functions.
 */

fun main() {

    // Defines an infix extension function on Int and calls the infix function.
    infix fun Int.times(string: String) = string.repeat(this)
    println(2 times "Can")

    // Creates a Pair by calling the infix function to from the standard library.
    val pair = "Ferrari" to "Can"
    println(pair)

    // Here's your own implementation of to creatively called onto.
    infix fun String.onto(other: String) = Pair(this, other)
    val customPair = "BMW" onto "osman"
    println(customPair)

    val can = Person("Can")
    val osman = Person("Osman")

    // Infix notation also works on members functions (methods).
    can likes osman
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()

    // The containing class becomes the first parameter.
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}
