package basics.functions

fun main() {

}

data class Fish(val name: String)

fun fishEx() {
    val fish = Fish("Can")

    // with the use of lambda functions
    myWith(fish.name) {
        uppercase()
    }

    // without lambda
    myWith(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.uppercase()
        }
    })

    // without inline an object is created every call to myWith
    myWith2(fish.name, object : Function1<String, Unit> {
        override fun invoke(name: String) {
            name.uppercase()
        }
    })

    //with inline no object is created, and lambda body is inlined here
    fish.name.uppercase()
}

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

inline fun myWith2(name: String, block: String.() -> Unit) {
    name.block()
}