package code_wars

fun main() {
    var res = removeChar("Can")
    println(res)
    var res2 = removeChar("Osman Can Çınar")
    println(res2)

    var ages = calculateYears(5)
    ages.forEach { println(it) }
}

fun removeChar(str: String): String {
    return str.substring(range = 1 until str.length - 1)
}

fun calculateYears(years: Int): Array<Int> {

    var catYears = 0
    var dogYears = 0

    for (i in 1..years) {
        when (i) {
            1 -> {
                catYears += 15
                dogYears += 15
            }

            2 -> {
                catYears += 9
                dogYears += 9
            }

            else -> {
                catYears += 4
                dogYears += 5
            }
        }
    }

    return arrayOf(years, catYears, dogYears);
}