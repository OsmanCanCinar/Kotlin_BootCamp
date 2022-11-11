package official_examples.collections

/**
 * A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList)
 * or read-only (List). For list creation, use the standard library functions listOf() for read-only
 * lists and mutableListOf() for mutable lists. To prevent unwanted modifications, obtain read-only
 * views of mutable lists by casting them to List.
 */

fun main() {

    // Updates the MutableList. All related read-only views are updated as well since they point to the same object.
    addSystemUser(4)

    // Retrieves the size of the read-only list.
    println(println("Total Sudoers: ${getSystemSudoers().size}"))

    // Iterates the list and prints its elements.
    getSystemSudoers().forEach { i ->
        println("info of the user $i")
    }

    /**
     * filter function enables you to filter collections. It takes a filter predicate as a lambda-parameter.
     * The predicate is applied to each element. Elements that make the predicate true are
     * returned in the result collection.
     */

    // Defines collection of numbers.
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // Gets positive numbers.
    val positives = numbers.filter { x -> x > 0 }

    // Uses the shorter it notation to get negative numbers.
    val negatives = numbers.filter { it < 0 }

    /**
     * count functions returns either the total number of elements in a collection or
     * the number of elements matching the given predicate.
     */

    // Counts the total number of elements.
    val totalCount = numbers.count()

    // Counts the number of even elements.
    val evenCount = numbers.count { it % 2 == 0 }

}

// Creates a MutableList.
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)

// Creates a read-only view of the list.
val sudoers: List<Int> = systemUsers

// Adds a new item to the MutableList.
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

// A function that returns an immutable List.
fun getSystemSudoers(): List<Int> = sudoers