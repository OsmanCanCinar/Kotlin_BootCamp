package examples.collections

/**
 * A set is an unordered collection that does not support duplicates. For creating sets,
 * there are functions setOf() and mutableSetOf(). A read-only view of a mutable set can
 * be obtained by casting it to Set.
 */

fun main() {
    val aNewIssue: String = "uniqueDesc4"
    val anIssueAlreadyIn: String = "uniqueDesc2"

    // Prints a success message: the new element is added to the Set.
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")

    // Prints a failure message: the element can't be added because it duplicates an existing element.
    println("Issue $aNewIssue ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}

// Creates a Set with given elements.
val openIssues: MutableSet<String> = mutableSetOf("uniqueDesc1", "uniqueDesc2", "uniqueDesc3")

// Returns a boolean value showing if the element was actually added.
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

// Returns a string, based on function input parameter.
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly" else "marked as duplicated & rejected"
}