package coding_wars

fun main() {

    /**
     * replace("Hi!") === "H!!"
     * replace("!Hi! Hi!") === "!H!! H!!"
     * replace("aeiou") === "!!!!!"
     * replace("ABCDE") === "!BCD!"
     */

    replace("Hi!")
    replace("!Hi! Hi!")
    replace("aeiou")
    replace("ABCDE")

    println(repeatStr(2, "Osman"))
    println(repeatStr(3, "3S}0"))
}

fun repeatStr(r: Int, str: String): String {
    val oldCharArray = str.toCharArray()
    val newCharArray = mutableListOf<Char>()

    for (i in 0 until r) {
        for (element in oldCharArray) {
            newCharArray.add(element)
        }
    }
    return newCharArray.joinToString("").takeWhile {
        it.isDefined()
    }
}

fun replace(s: String): String {
    val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val charArray = s.toCharArray()

    for ((index, element) in charArray.withIndex()) {
        if (element in vowels)
            charArray[index] = '!'
    }

    val string = charArray.concatToString()
    println(string)

    return string
}