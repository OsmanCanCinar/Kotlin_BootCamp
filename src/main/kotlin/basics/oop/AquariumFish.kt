package basics.oop

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

interface FishAction {
    fun eat()
}

class Shark : AquariumFish(), FishAction {

    override val color = "gray"

    override fun eat() {
        println("I eat fishes")
    }
}

class Plecostomus : AquariumFish(), FishAction {

    override val color = "gold"

    override fun eat() {
        println("I eat algae")
    }
}

/** Abstract Classes vs Interfaces
 *  Abstract Classes can have constructors but interfaces cannot.
 *  Both can contain implementations of methods. In interfaces its called default implementations.
 *  Difference comes up when & how you use them.
 */

//Use an abstract class any time you cant complete a class!!!!!!
interface AquariumAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("Swim")
    }
}
