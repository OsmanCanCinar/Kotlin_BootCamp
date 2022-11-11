package bootcamp.basic_types

fun main() {

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    // null-safety
    var boolNull: Boolean? = null
    var lotsOfFish: List<String?> = listOf(null, null, "hey") // a list of nullable strings
    var evenMoreFish: List<String>? = null // a nullable list that hold strings
    var definitelyMoreFish: List<String?>? = null // a nullable list that hold nullable strings

    // not null assertion operator is "!!" and it means that a nullable variable is not null. Risky!
    //boolNull!!.toString() // since it is null it will give null pointer exception

    // null testing with the "?" operator to save some time and "?:" elvis operator to assign it fast
    println(boolNull?.equals(true) ?: false)

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)


}