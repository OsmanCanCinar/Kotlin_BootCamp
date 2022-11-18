package code_wars

import java.lang.Long.valueOf

fun main() {
    val res = maxRot(38458215)
    println(res)

    val res2 = maxRot2(56789)
    println(res2)
}

class Kata {
    fun makeNegative(x: Int): Int = if (x > 0) x * -1 else x
    fun summation(n: Int): Int {
        var res = 0
        for (i in 1..n) {
            res += i
        }
        return res
    }
}

fun maxRot3(n: Long): Long {
    val numberList = arrayListOf<Long>()
    numberList.add(n)
    var text = n.toString()

    (1 until n.toString().length).forEach { t ->
        text = text.removeRange(t - 1, t) + text[t - 1]
        numberList.add(text.toLong())
    }

    return numberList.reduce { max, element -> if (element > max) element else max }
}


fun maxRot2(n: Long): Long {
    var result: Long = 0
    val aNum = n.toString()
    var counter = 0
    var tempString = aNum
    while (counter <= aNum.length - 1) {
        if (valueOf(tempString) > result) {
            result = valueOf(tempString)
        }
        tempString = tempString.substring(0, counter) + tempString.substring(counter + 1) + tempString.substring(
            counter,
            counter + 1
        )
        counter++
    }
    return result
}

fun maxRot(n: Long): Long {
    var num = n.toInt().toString().reversed()
    val digits = num.length
    val combinations = mutableListOf<Long>()

    for (i in 0 until digits) {
        when (i) {
            digits -> {
                val temp = num.substring(i..num.lastIndex)
                num = num.substring(0 until i) + temp
                combinations.add(i, num.toLong())
            }

            else -> {
                val temp = num.substring(i + 1..num.lastIndex)
                num = temp + num.substring(0..i)
                combinations.add(i, num.toLong())
            }
        }
    }
    return combinations.max()
}