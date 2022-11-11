package bootcamp.basic_types

fun main() {

    val one: Int = 1 // Int
    val threeBillion = 3_000_000_000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1
    val e = 2.7182818284 // Double
    val eFloat = 2.7182817f // Float, actual value is 2.7182817

    // use underscores to make it more readable
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    // Type Interface, auto-detects the variable type
    val fish = 10

    println("+ " + fish.plus(1))  // 1 + 1
    println("- " + fish.minus(3)) // 10 + 3
    println("% " + fish.mod(3)) // 10 % 3
    println("/ " + fish.div(2)) // 10 / 3
    println("* " + fish.times(2)) // 10 * 3

    // x in a..b, x !in a..b
}