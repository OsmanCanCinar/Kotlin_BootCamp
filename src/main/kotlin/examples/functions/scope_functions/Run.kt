package examples.functions.scope_functions

/**
 * Like let, run is another scoping function from the standard library. Basically, it does the same: executes
 * a code block and returns its result. The difference is that inside run the object is accessed by this. This
 * is useful when you want to call the object's methods rather than pass it as an argument.
 */

fun main() {
    getNullableLengths(null)
    getNullableLengths("")
    getNullableLengths("some thing")
}

fun getNullableLengths(ns: String?) {
    println("for \"$ns\"")
    // Calls the given block on a nullable variable.
    ns?.run {
        // Inside run, the object's members are accessed without its name.
        println("\tis empty?" + isEmpty())
        println("\tlength = $length")
        // run returns the length of the given String if it's not null.
        length
    }

}