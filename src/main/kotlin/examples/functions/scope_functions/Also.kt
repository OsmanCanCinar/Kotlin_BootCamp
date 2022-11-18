package examples.functions.scope_functions

/**
 * also works like apply: it executes a given block and returns the object called. Inside the block,
 * the object is referenced by it, so it's easier to pass it as an argument. This function is handy
 * for embedding additional actions, such as logging in call chains.
 */

fun main() {
    // Creates a Person() object with the given property values.
    val jake = Person2("Can", 25, "Android developer")
        .also { //Applies the given code block to the object. The return value is the object itself.
            writeCatalog(it)
        }
}

class Person2(var name: String, var age: Int, var about: String) {
    override fun toString(): String = "$name, $age, $about"
}

fun writeCatalog(person2: Person2) {
    println(person2)
}