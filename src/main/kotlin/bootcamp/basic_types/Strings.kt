package bootcamp.basic_types

fun main() {

    // Generally, a string value is a sequence of characters in double quotes
    var str = "abcd 123"

    for (c in str) {
        println(c)
    }

    str = "abcd"

    // Create and print a new String object
    println(str.uppercase())

    // The original string remains the same
    println(str)

    // concatenate strings
    var s = "abc" + 1
    println(s + "def")

    s = "Hello, world!\n"
    println(s + "def")

    // Raw Strings
    var text = """
         for (c in "foo")
            print(c)
    """

    text = """
        |Tell me and I forget.
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
    """.trimMargin()

    val g = "abc"
    println("length is ${g.length}") // Prints "abc.length is 3"

    val price = """
        ${'$'}_9.99
    """

    val fullName = "Osman" + " " + "Can" + " " + "Cinar"
}

