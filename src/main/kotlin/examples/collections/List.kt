package examples.collections

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

    // Read-only list. Immutable
    val listImmutable = listOf("a", "b", "c")

    // Read-Write list. Mutable
    val listMutable = mutableListOf("a", "b", "c")
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