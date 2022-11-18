package examples.classes.objects

/**
 * In Kotlin you also have the object keyword. It is used to obtain a data type with a single implementation.
 *
 * If you are a Java user and want to understand what "single" means, you can think of the Singleton pattern:
 * it ensures you that only one instance of that class is created even if 2 threads try to create it.
 *
 * To achieve this in Kotlin, you only need to declare an object: no class, no constructor, only a lazy instance.
 * Why lazy? Because it will be created once when the object is accessed. Otherwise, it won't even be created.
 *
 * Here is a basic typical usage of an object expression: a simple object/properties structure.
 * There is no need to do so in class declaration: you create a single object, declare its members
 * and access it within one function. Objects like this are often created in Java as anonymous class instances.
 */

fun main() {
    // Calls the function. This is when the object is actually created.
    rentPrice(10, 2, 1)
}

// Creates a function with parameters.
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int) {

    // Creates an object to use when calculating the result value.
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    var total = 0
    // Accesses the object's properties.
    dayRates.apply {
        total = standard + festivity + special
    }

    println(total)
}
