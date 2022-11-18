package examples.delegation

/**
 *  Kotlin supports easy implementation of the delegation pattern on the native level without any boilerplate code.
 */
fun main() {

    // When makeSound() is called on tomAraya of type TomAraya or elvisPresley of type ElvisPresley,
    // the call is delegated to the corresponding delegate object.
    val tomAraya = TomAraya("Thrash Metal")
    tomAraya.makeSound()

    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}

// Defines the interface SoundBehavior with one method.
interface SoundBehavior {
    fun makeSound()
}

//The classes ScreamBehavior and RockAndRollBehavior implement the interface and contain their
// own implementations of the method.
class ScreamBehaviour(val n: String) : SoundBehavior {
    override fun makeSound() = println("${n.uppercase()} !!!")
}

// The classes ScreamBehavior and RockAndRollBehavior implement the interface and contain their
// own implementations of the method.
class RockAndRollBehavior(val n: String) : SoundBehavior {
    override fun makeSound() = println("I'm the king of rock 'N' Roll: $n")
}

// The classes TomAraya and ElvisPresley also implement the interface, but not the method.
// Instead, they delegate the method calls to the responsible implementation. The delegate
// object is defined after the by keyword. As you see, no boilerplate code is required.
class TomAraya(n: String) : SoundBehavior by ScreamBehaviour(n)

// The classes TomAraya and ElvisPresley also implement the interface, but not the method.
// Instead, they delegate the method calls to the responsible implementation. The delegate
// object is defined after the by keyword. As you see, no boilerplate code is required.
class ElvisPresley(n: String) : SoundBehavior by RockAndRollBehavior(n)