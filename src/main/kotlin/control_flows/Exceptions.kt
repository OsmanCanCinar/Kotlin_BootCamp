package control_flows

fun main() {

    var z = 2L

    var name: String? = null
    val name2: String? = "Can"

    val s = name2 ?: throw IllegalArgumentException("Name required")

    try {
        // some code
    } catch (e: Exception) {
        // handler
    } finally {
        // optional finally block
    }


    val a: Int? = try {
        z.toInt()
    } catch (e: NumberFormatException) {
        null
    }


    var c = name2 ?: fail("shiiiit")


    var obj: Any = "Osman"
    obj = 2


    // is operator & !is
    if (obj is String) {
        println(obj.length)
    } else {
        println("Not a String")
    }


    when (obj) {
        is Int -> println(obj + 1)
        is String -> println(obj.length + 1)
        is IntArray -> println(obj.sum())
    }

    val y = 3
    // Unsafe Casting, the cast operator throws an exception if the cast isn't possible.
    //val x: String = y as String

    //Use safe casting instead it will return null.
    val x2: String? = y as? String
    println(x2)

}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}