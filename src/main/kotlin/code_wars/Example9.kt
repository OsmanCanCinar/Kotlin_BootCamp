package code_wars

import examples.variables.Pair

fun main() {
    println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))

    println(alphabetWar("z"))
    println(alphabetWar("zdqmwpbs"))
    println(alphabetWar("zzzzs"))
    println(alphabetWar("wwwwww"))
}

fun noSpace(x: String): String {
    return x.replace(" ", "")
}

fun alphabetWar(fight: String): String {

    val leftSide = mapOf('w' to 4, 'p' to 3, 'b' to 2, 's' to 1)
    val rightSide = mapOf('m' to 4, 'q' to 3, 'd' to 2, 'z' to 1)

    var (left, right) = Pair(0, 0)

    fight.forEach {
        if (leftSide.containsKey(it)) {
            left += leftSide.getValue(it)
        }

        if (rightSide.containsKey(it)) {
            right += rightSide.getValue(it)
        }
    }

    return when {
        left > right -> "Left side wins!"
        left < right -> "Right side wins!"
        else -> "Let's fight again!"
    }
}


