package examples.classes

/**
 * Sealed classes let you restrict the use of inheritance. Once you declare a class sealed,
 * it can only be subclassed from inside the same package where the sealed class is declared.
 * It cannot be subclassed outside of the package where the sealed class is declared.
 */

fun main() {
    println(greetMammal(Human("Can", "Software Engineering")))
    println(greetMammal(Cat("Nazlı")))
}

// Defines a sealed class.
sealed class Mammal(val name: String)

// Defines subclasses. Note that all subclasses must be in the same package.
class Cat(val catName: String) : Mammal(catName)

class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    // Uses an instance of the sealed class as an argument in a when expression.
    return when (mammal) {
        // A smartcast is performed, casting Mammal to Human.
        is Human -> "hey ${mammal.humanName}, your job is ${mammal.job}"
        // A smartcast is performed, casting Mammal to Cat.
        is Cat -> "hey ${mammal.catName}"
        // The else-case is not necessary here since all possible subclasses of the sealed class are covered.
        // With a non-sealed superclass else would be required.
    }
}