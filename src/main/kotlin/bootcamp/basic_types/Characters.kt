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

    // Character literals go in single quotes.
    val aChar: Char = 'a'
    aChar.toString()

    println(aChar)

    // Prints an extra newline character
    println('\n')

    println('\uFF00')
}