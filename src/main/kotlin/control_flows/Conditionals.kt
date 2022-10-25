package control_flows

import control_flows.MyColors
import java.awt.Color

fun main() {

    var x = 10

    if (x > 1) println("Alright")
    else println("Not Alright")


    if (x in 1..100) println(x)

    when (x) {
        0, 1 -> println("too small")
        10 -> println("Alright")
        20 -> println("OKAY")
        in 1..100 -> println(x)
        !in 1..100 -> println(x)
        else -> println("Not Alright")
    }

    val a = 2
    val b = 4

    var max = if (a > b) a else b

    max = when {
        a > b -> a
        else -> b
    }


    /*
     fun Request.getBody() =
         when (val response = executeRequest()) {
             is Success -> response.body
             is HttpError -> throw HttpException(response.status)
         }
     */

    when (getMyColors()) {
        MyColors.BLUE -> println("blue")
        MyColors.RED -> println("red")
        MyColors.GREEN -> println("green")
    }
}

fun getMyColors(): MyColors {
    return MyColors.RED
}

enum class MyColors {
    GREEN,
    RED,
    BLUE
}

