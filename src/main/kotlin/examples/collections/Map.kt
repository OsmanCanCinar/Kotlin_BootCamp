package examples.collections

/**
 *A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value.
 * For creating maps, there are functions mapOf() and mutableMapOf(). Using the to infix function makes initialization
 * less noisy. A read-only view of a mutable map can be obtained by casting it to Map.
 */

fun main() {
    // Reads the account points balance, before updates.
    accountReports()

    // Updates an existing account two times.
    updatePointsCredit(1)
    updatePointsCredit(1)

    // Tries to update a non-existing account: prints an error message.
    updatePointsCredit(5)

    // Reads the account points balance, after updates.
    accountReports()
}

const val POINTS_X_PASS: Int = 15

// Creates a mutable Map.
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 300)

// Creates a read-only view of the Map.
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    // Checks if the Map's key exists.
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")

        //Reads the corresponding value and increments it with a constant value.
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error")
    }
}

fun accountReports() {
    println("Reports")

    // Iterates immutable Map and prints key/value pairs.
    EZPassReport.forEach { k, v ->
        println("$k : $v")
    }
}