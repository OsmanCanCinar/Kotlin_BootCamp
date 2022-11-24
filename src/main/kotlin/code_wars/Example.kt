package code_wars

import kotlin.math.sqrt

fun main() {
    val result = findScreenHeight(1024, "4:3")
    println(result) // 1024x768
    val result2 = findScreenHeight(1898, "4:3")
    println(result2) // 1898x142
}

fun findScreenHeight(width: Int, ratio: String): String {
    val ratios = ratio.split(":").map { it.trim() }

    val wRatio = ratios[0].toInt()
    println(wRatio)

    val hRatio = ratios[1].toInt()
    println(hRatio)

    val unit = width / wRatio

    val height = unit * hRatio
    println(height)

    return "${width}x${height}"
}

fun getAscii(c: Char): Int = c.code// code here

fun grow(arr: IntArray): Int {
    var sum = 1
    for (i in arr.indices) {
        sum *= arr[i]
    }
    return sum
}

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int {
    val list = arrayListOf<Int>(age1, age2, age3, age4, age5, age6, age7, age8)
    var sum = 0

    list.forEach { sum += it * it }

    val sqRoot = sqrt(sum.toDouble()).toInt()

    return sqRoot / 2
}