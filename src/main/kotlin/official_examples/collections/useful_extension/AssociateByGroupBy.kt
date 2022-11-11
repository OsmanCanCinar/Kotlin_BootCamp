package official_examples.collections.useful_extension

/**
 * Functions associateBy and groupBy build maps from the elements of a collection indexed by the specified key.
 * The key is defined in the keySelector parameter. You can also specify an optional valueSelector to define
 * what will be stored in the value of the map element.
 *
 * The difference between associateBy and groupBy is how they process objects with the same key:
 *      associateBy uses the last suitable element as the value.
 *      groupBy builds a list of all suitable elements and puts it in the value.
 *
 *      The returned map preserves the entry iteration order of the original collection.
 */

fun main() {
    // Builds a map from phone numbers to their owners' information. it.phone is the keySelector here.
    // The valueSelector is not provided, so the values of the map are Person objects themselves.
    val phoneBook = people.associateBy { it.phone }
    phoneBook.forEach {
        println(it)
    }

    println()
    // Builds a map from phone numbers to the cities where owners live. Person::city is the valueSelector here,
    // so the values of the map contain only cities.
    val cityBook = people.associateBy(Person::phone, Person::city)
    cityBook.forEach {
        println(it)
    }

    println()
    // Builds a map that contains cities and people living there. The values of the map are lists of person names.
    val peopleCities = people.groupBy(Person::city, Person::name)
    peopleCities.forEach {
        println(it)
    }

    println()
    // Builds a map that contains cities and the last person living there. The values of the map are names of the
    // last person living in each city.
    val lastPersonCity = people.associateBy(Person::phone, Person::name)
    lastPersonCity.forEach {
        println(it)
    }
}

// Defines a data class that describes a person.
data class Person(val name: String, val city: String, val phone: String)

// Defines a collection of people.
val people = listOf(
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
)
