package classes

//Singleton
object MobyDickWhale {

    val author = "Herman Melville"

    fun jump() {

    }
}

//Enums
enum class Color(val rgb: Int) {
    RED(rgb = 0xFF000),
    GREEN(rgb = 0x00FF00),
    BLUE(rgb = 0x0000FF)
}

//It's a class that can be subclassed but only inside the file it's been declared in
sealed class Seal

class SeaLion : Seal()

class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when (seal) {
        is Walrus -> "Walrus"
        is SeaLion -> "SeaLion"
    }
}