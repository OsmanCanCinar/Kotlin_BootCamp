package classes

class Example constructor(someString: String){

}

class MyClass(name: String){

    private val message = "hi $name"
    val message2 = name.uppercase()


    // init becomes part of primary constructor
    init {
        println(message)
    }

}

class Person(val name: String) {

    private val children: MutableList<Person> = mutableListOf()

    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }

}

fun main() {

    val person = Person("Can")
}