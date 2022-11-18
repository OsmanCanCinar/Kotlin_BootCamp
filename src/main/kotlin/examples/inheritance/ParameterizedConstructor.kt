package examples.inheritance

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}

open class Tiger(private val origin: String) {
    fun sayHello() {
        println("Tiger is from $origin")
    }
}

// If you want to use a parameterized constructor of the superclass when creating a subclass,
// provide the constructor arguments in the subclass declaration.
class SiberianTiger : Tiger("Siberia")

