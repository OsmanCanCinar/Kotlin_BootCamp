package examples.functions.scope_functions

/**
 * apply executes a block of code on an object and returns the object itself. Inside the block, the
 * object is referenced by this. This function is handy for initializing objects.
 */

fun main() {
    // Creates a Person() instance with default property values.
    val jake = Person()

    // Applies the code block (next 3 lines) to the instance.
    val stringDescription = jake.apply {
        // Inside apply, it's equivalent to jake.name = "Jake".
        name = "Jake"
        age = 30
        about = "Android Developer"
    }.toString()
    // The return value is the instance itself, so you can chain other operations.

    println(stringDescription)

}

class Person() {
    lateinit var name: String
    var age: Int = -1
    lateinit var about: String

    override fun toString(): String = "$name, $age, $about"
}