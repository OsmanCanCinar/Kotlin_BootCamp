package official_examples.inheritance

/**
 * Kotlin fully supports the traditional object-oriented inheritance mechanism.
 */

fun main() {
    val dog: Dog = Dog()
    dog.bark()

    val yorkshire: Dog = Yorkshire()
    yorkshire.bark()
}

// Kotlin's classes are final by default. If you want to allow the class inheritance,
// mark the class with the open modifier.
open class Dog {

    // Kotlin's methods are also final by default. As with the classes, the open modifier allows overriding them.
    open fun bark() {
        println("wuf!")
    }
}

// A class inherits a superclass when you specify the : SuperclassName() after its name.
// The empty parentheses () indicate an invocation of the superclass default constructor.
class Yorkshire : Dog() {

    // Overriding methods or attributes requires the override modifier.
    override fun bark() {
        println("wif!")
    }
}