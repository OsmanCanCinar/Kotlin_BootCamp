package classes.udacity

fun main() {
    delegate()
}

//interface delegation
fun delegate() {
    val pleco = Pleco()
    println("fish color ${pleco.color}")
    pleco.eat()
}

interface FishActions {
    fun eat()
}

interface FishColors {
    val color: String
}

// Only one instance - Singleton Pattern
object GoldColor: FishColors {
    override val color: String
        get() = "gold"
}

object RedColor: FishColors {
    override val color: String
        get() = "Red"
}

// all the functionality coming from interface delegation
class Pleco(fishColor: FishColors = GoldColor):
    FishAction by PrintingFishAction("algae"),
    FishColors by fishColor

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

/**
 * Interface delegation is adding features to a class via composition.
 * Composition is when you use an instance of another class as opposed to inheriting from it
 */