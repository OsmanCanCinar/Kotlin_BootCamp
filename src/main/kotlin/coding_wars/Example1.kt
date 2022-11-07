fun main() {
    print(past(0,1,1))
}

fun past(h: Int, m: Int, s: Int): Int {

    var total = 0

    if(checkConstraints(h,"hours")) {
        total += h * 3600000
    }

    if(checkConstraints(m,"minutes")) {
        total += m * 60000
    }

    if(checkConstraints(s,"seconds")) {
        total += s * 1000
    }

    return total

}

fun checkConstraints(num: Int, type: String): Boolean {
    when(type) {
        "hours" ->  if(num in 0..23) return true
        "minutes" -> if(num in 0..60) return true
        "seconds" -> if(num in 0..60) return true
        else -> return false
    }
    return false
}