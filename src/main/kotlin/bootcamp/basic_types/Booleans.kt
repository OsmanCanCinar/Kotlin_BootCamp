package bootcamp.basic_types

fun main() {

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    // null-safety
    val boolNull: Boolean? = null

    // a list of nullable strings
    var lotsOfFish: List<String?> = listOf(null, null, "hey")

    // a nullable list that hold strings
    var evenMoreFish: List<String>? = null

    // a nullable list that hold nullable strings
    var definitelyMoreFish: List<String?>? = null

    // not null assertion operator is "!!" and it means that a nullable variable is not null. Risky!
    //boolNull!!.toString() // since it is null it will give null pointer exception

    // null testing with the "?" operator to save some time and "?:" elvis operator to assign it fast
    println(boolNull?.equals(true) ?: false)

    // disjunction (logical OR)
    println(myTrue || myFalse)

    // conjunction (logical AND)
    println(myTrue && myFalse)

    // negation (logical NOT)
    println(!myTrue)

}