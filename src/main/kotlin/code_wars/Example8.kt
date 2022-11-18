package code_wars

fun main() {
    val res = reverseLetter("ultr53o?n")
    println(res)

    val result = evaporator(10.0, 10.0, 10.0)
    println(result)
}

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    var amount = content
    var limit = (content * threshold) / 100
    var dayCount = 0

    while (amount > limit) {
        amount -= (amount * evap_per_day) / 100
        ++dayCount
    }
    return dayCount;
}

fun include(arr: IntArray, item: Int): Boolean {
    return arr.contains(item)
}

fun reverseLetter2(str: String): String {
    return str.filter(Char::isLetter).reversed()
}

fun reverseLetter(str: String): String {
    val tempString = mutableListOf<Char>()

    for ((index, element) in str.withIndex()) {
        if (element.isLetter()) {
            tempString.add(element)
        }
    }

    return tempString.joinToString("").reversed()
}

fun invert(arr: IntArray): IntArray {
    val tempArr = arr.copyOf()

    for ((index, element) in arr.withIndex()) {
        tempArr[index] = element * -1
    }

    return tempArr
}
