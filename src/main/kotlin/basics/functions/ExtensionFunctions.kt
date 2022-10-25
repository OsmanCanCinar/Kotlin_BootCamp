package basics.functions

fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

fun String.hasSpaces2() = find { it == ' ' } != null

fun extEx() {
    "Does it have spaces?".hasSpaces() // true
    "Does it have spaces?".hasSpaces2() // true
}

class Plant(val color: String)

fun Plant?.pull() {
    this?.apply {
        println("removing $this")
    }
}

fun nullableEx() {
    val plant: Plant? = null
    plant.pull() // ok
}