package basics.oop

//init, primary/secondary constructor, & encapsulation
class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    private val size: Int

    init {
        println("First init block")
    }

    constructor() : this(true, 9) {
        println("This is secondary constructor")
    }


    init {
        size = if (friendly) {
            volumeNeeded
        } else {
            volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}