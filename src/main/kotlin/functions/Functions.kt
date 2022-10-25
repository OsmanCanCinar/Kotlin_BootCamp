package classes

import java.lang.Math.random

fun main() {

    val day = "Sunday"
    var x = doubleIt()
    println(x)
    x = doubleIt(10)
    println(x)

    // Anonymous Functions
    val stringLengthFunc: (String) -> Int = { input ->
        input.length
    }

    val stringLength: Int = stringLengthFunc("android")

    //High-order functions usage
    stringMapper("Android") { input ->
        input.length
    }

    someFoo(strings = arrayOf("1","2","3"))


    println(isItSunday(day))


    val someList = listOf(1,"Osman",2,"Can",3,"Çınar",4)
    println(someList.filterIsInstance<String>())

    var a = 20
    val abc : (Int) -> Int = { it -> it/2}


    val random1 = random()
    val random2 = {random()}
    /***
     * random1 has a value assigned at compile time, and the value never changes when the variable is accessed.
     * random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.
     */

}

fun isItSunday(day: String) = day == "Sunday"

class MyStringCollection {
    //infix
    infix fun add(s: String) { /*...*/ }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}

//High-order functions
fun stringMapper(
    str: String,
    mapper: (String) -> Int): Int {
    // Invoke function
    return mapper(str)
}

//varargs multiple: arguments. Only one parameter can be marked as vararg
fun someFoo(vararg strings: String): Unit{ // unit means void and it does not have to be explicitly talked about.

}

fun doubleIt(x: Int = 12): Int {
    return 2 * x
}

// Single expression function
fun tripleIt(x: Int = 12): Int = 3 * x


open class A {
    open fun foo(i: Int = 10) { /*...*/ }
}

class B : A() {
    override fun foo(i: Int) { /*...*/ }  // No default value is allowed.
}

/***
 * Function parameters are defined using Pascal notation - name: type
 */