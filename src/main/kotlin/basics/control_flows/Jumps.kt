package basics.control_flows

fun main() {

    /***
     * "return" by default returns from the nearest enclosing function or anonymous function.
     * "break" terminates the nearest enclosing loop.
     * "continue" proceeds to the next step of the nearest enclosing loop.
     */

    // Nothing type
    var x: Int? = 3
    var s = x ?: return
    println(s)

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i < j) break@loop
        }
    }

    foo()
    foo2()
    foo3()
    foo4()
    foo5()
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        print(it)
    }
    println("this point is unreachable")
}

fun foo2() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with explicit label")
}

fun foo3() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with implicit label")
}

fun foo4() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return  // local return to the caller of the anonymous function - the forEach loop
        print(value)
    })
    print(" done with anonymous function")
}

fun foo5() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // non-local return from the lambda passed to run
            print(it)
        }
    }
    print(" done with nested loop")
}