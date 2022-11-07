package official_examples.null_safety

/**
 *In an effort to rid the world of NullPointerException, variable types in Kotlin don't allow the assignment of null.
 * If you need a variable that can be null, declare it nullable by adding ? at the end of its type.
 */

fun main() {

    // Declares a non-null String variable.
    var neverNull: String = "This can't be null"

    // Declares a nullable String variable.
    var nullable: String? = "This can be null"
    // Sets the null value to the nullable variable. This is OK.
    nullable = null

    // When inferring types, the compiler assumes non-null for variables that are initialized with a value.
    var inferredNonNull = "The compiler assumes non-null"

    // Calls the function with a String (non-nullable) argument. This is OK.
    strLength(neverNull)

    // Produces Error because of Null Safety
    // strLength(nullable)

    /**
     * Sometimes Kotlin programs need to work with null values, such as when interacting with external Java code or
     * representing a truly absent state. Kotlin provides null tracking to elegantly deal with such situations.
     */
}

// Declares a function with a non-null string parameter.
fun strLength(notNull: String): Int {
    return notNull.length
}

// A function that takes in a nullable string and returns its description.
fun describeString(maybeString: String?): String {

    // If the given string is not null and not empty, return information about its length.
    return if (!maybeString.isNullOrEmpty()) {
        "length : ${maybeString.length}"
    }
    // Otherwise, tell the caller that the string is empty or null.
    else {
        "Empty or Null String"
    }
}