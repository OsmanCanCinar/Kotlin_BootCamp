package bootcamp.basic_types

fun main() {

    var str = "abcd 123"
    for (c in str) {
        println(c)
    }

    str = "abcd"
    println(str.uppercase()) // Create and print a new String object
    println(str) // The original string remains the same

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

