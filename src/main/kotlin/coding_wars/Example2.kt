package coding_wars

import kotlin.math.floor

fun main() {
    var result = dutyFree(12, 50, 1000) // result is 166

    var result2 = dutyFree(17, 10, 500) // result is 294

    var result3 = dutyFree(24, 35, 3000) // result is 357

    var result4 = dutyFree(377, 40, 9048) // result is 60

    var result5 = dutyFree(2479, 51, 13390) // result is 10
}

fun dutyFree(normPrice: Int, discount: Int, hol: Int): Int {

    val roundingWindow = 0.000000001

    val discount = (normPrice.toDouble() * discount) / 100

    var count = hol.toFloat().div(discount)

    var res = floor(count + roundingWindow).toInt()

    return res
}