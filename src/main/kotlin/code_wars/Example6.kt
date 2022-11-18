package code_wars

fun main() {
    println(twiceAsOld(36, 7))

    val scores = listOf("1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3")
    val totalScore = points(scores)
    println(totalScore)

    println(points2(scores))
}

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    val ageDif = dadYearsOld - sonYearsOld
    var res = ageDif - sonYearsOld

    if (res < 0) {
        res *= -1
    }

    return res
}

fun points(games: List<String>): Int {
    // Format "3:1"
    var totalScore = 0

    for ((index, element) in games.withIndex()) {
        val ourScore = element[0].code
        val theirScore = element[2].code

        totalScore += calculateScore(ourScore, theirScore)
    }

    return totalScore
}

fun calculateScore(ourScore: Int, theirScore: Int): Int {
    return when {
        ourScore > theirScore -> 3
        ourScore == theirScore -> 1
        else -> 0
    }
}

fun points2(games: List<String>) =
    games.sumBy {
        val (x, y) = it.split(":")
        when {
            x > y -> 3
            x < y -> 0
            else -> 1
        }
    }