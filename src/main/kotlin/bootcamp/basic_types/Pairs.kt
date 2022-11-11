package bootcamp.basic_types

fun main() {

    // Pairs
    val equipment = "Fishnet" to "catching fish" to "big fish" to "me"
    println(equipment)
    println(equipment.first)
    println(equipment.second)

    val equipment2 = ("Fishnet" to "catching fish") to ("big fish" to "me")
    println(equipment2)
    println(equipment2.first)
    println(equipment2.second)

    val equipment3 = "Fishnet" to "catching fish"
    val (tool, use) = equipment3
    println("tool: $tool, use: $use")

    val string = equipment3.toString()
    println(string)

    // Lists
    val testList = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    println(reverseTheGivenList(testList))
    println(reverseList(testList))
    println(testList.reversed())

    val symptoms = mutableListOf("white spots", "red spots", "not eating", "bloated", "belly up")
    symptoms.add("white fungus")
    symptoms.remove("white fungus")

    println(symptoms.contains("red"))
    println(symptoms.contains("red spots"))

    println(symptoms.subList(4, symptoms.size))
    println(listOf(1, 5, 3).sum())
    println(listOf("a", "b", "cx").sumOf { it.length })

    //Maps
    val cures = mapOf("white spots" to "red spots", "not eating" to "bloated")
    println(cures["white spots"])
    println(cures.getOrDefault("bloating", "sorry"))
    println(cures.getOrElse("bloating") { "No Cure For This" })

    val inventory = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber", 3)
    inventory.remove("tank scrubber", 3)

}

fun reverseTheGivenList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0..list.size - 1) {
        result.add(list[list.size - i - 1])
    }
    return result
}

fun reverseList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size - 1 downTo 0) {
        result.add(list[i])
    }
    return result
}