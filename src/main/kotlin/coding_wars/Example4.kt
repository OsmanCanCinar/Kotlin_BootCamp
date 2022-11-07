package coding_wars

fun main() {
    val res = feast("chickadee", "chocolate cake")
    println(res)// true
}

fun feast(beast: String, dish: String): Boolean {

    if ((dish[0] == beast[0]) &&
        (dish[dish.length - 1] == beast[beast.length - 1])
    ) {
        return true
    }
    return false
}

