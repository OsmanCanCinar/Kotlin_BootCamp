package bootcamp.oop

fun main() {
    buildAquarium()
    buildAnotherAquarium()
    fishExample()
    makeDefaultFish()
    makeFish()
}

private fun fishExample() {
    val fish = Fish(friendly = true, volumeNeeded = 20)
    println("${fish.friendly}")
}

private fun makeDefaultFish() {
    val fish = Fish()
}

private fun buildAquarium(): Aquarium =
    Aquarium(length = 20, width = 15, height = 30) // Don't have to specify a return type.

private fun buildAnotherAquarium() {
    val anotherAquarium = Aquarium(numberOfFish = 9)
    println("${anotherAquarium.volume}")
}

//interface
private fun feedFish(fish: FishAction) {
    fish.eat()
}

private fun makeFish() {
    val shark = Shark()
    val plecostomus = Plecostomus()

    // Abstraction
    println("Shark: ${shark.color} Ple:${plecostomus.color}")

    //interface
    feedFish(shark)
    feedFish(plecostomus)
}

/**     Package Visibility
 * public - Default. Everywhere
 * private - File
 * internal - Module
 */

/**     Class Visibility
 * public - Default. Class and public members
 * private - Inside class. Subclasses can't see.
 * protected - Inside class. Subclasses can see.
 * internal - Module
 */
