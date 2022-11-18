package bootcamp.basic_types

fun main() {

    // Int
    val one: Int = 1

    // Long
    val threeBillion = 3_000_000_000

    // Long
    val oneLong = 1L

    val oneByte: Byte = 1

    // Double
    val e = 2.7182818284

    // Float, actual value is 2.7182817
    val eFloat = 2.7182817f

    // use underscores to make it more readable
    val socialSecurityNumber = 999_99_9999L

    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    // Type Interface, auto-detects the variable type
    val fish = 10

    // 1 + 1
    println("+ " + fish.plus(1))

    // 10 + 3
    println("- " + fish.minus(3))

    // 10 % 3
    println("% " + fish.mod(3))

    // 10 / 3
    println("/ " + fish.div(2))

    // 10 * 3
    println("* " + fish.times(2))
}