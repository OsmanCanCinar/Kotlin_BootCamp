package bootcamp.basic_types

fun main() {
    /**
     * \t – tab
     * \b – backspace
     * \n – new line (LF)
     * \r – carriage return (CR)
     * \' – single quotation mark
     * \" – double quotation mark
     * \\ – backslash
     * \$ – dollar sign
     **/

    val aChar: Char = 'a'
    aChar.toString()

    println(aChar)
    println('\n') // Prints an extra newline character
    println('\uFF00')
}