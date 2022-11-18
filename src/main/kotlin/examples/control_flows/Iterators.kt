package examples.control_flows

/**
 * You can define your own iterators in your classes by implementing the iterator operator in them.
 */

fun main() {
    val zoo = Zoo(listOf(Animal("Zebra"), Animal("Lion")))

    for (animal in zoo) {
        // Loops through animals in the zoo with the user-defined iterator.
        println(animal.name)
    }
}

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {

    // Defines an iterator in a class. It must be named iterator and have the operator modifier.
    // The iterator can be declared in the type or as an extension function.
    operator fun iterator(): Iterator<Animal> {

        // Returns the iterator that meets the following method requirements: next(): Animal, hasNext(): Boolean
        return animals.iterator()
    }
}