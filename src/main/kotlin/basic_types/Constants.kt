package basic_types

// top-level
const val CONSTANT = "top-level constant"

// object level
object Constants {
    const val CONSTANT2 = "object constant"
}

val foo = Constants.CONSTANT2


// class level
class MyClass {
    companion object {
        const val CONSTANT3 = "const inside companion"
    }
}

