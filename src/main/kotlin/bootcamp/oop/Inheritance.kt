package bootcamp.oop

class SomeClass {

    /***
     * Implicitly inherits from Any.
     * Any has three methods: equals(), hashCode(), and toString().
     * Thus, these methods are defined for all Kotlin classes.
     *
     * By default, Kotlin classes are final – they can't be inherited.
     * To make a class inheritable, mark it with the open keyword.
     */

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

}

open class Base(p: Int) // Class is open for inheritance

class Derived(p: Int) : Base(p)

/***
 * If the derived class has a primary constructor,
 * the base class can (and must) be initialized in that primary constructor according to its parameters.
 *
 * If the derived class has no primary constructor,
 * then each secondary constructor has to initialize the base type using the super keyword
 * or it has to delegate to another constructor which does.
 */

open class AnotherBase {

    constructor(a: Int)

    constructor(b: String)
}

class AnotherDerived : AnotherBase {

    constructor(a: Int) : super(a)

    constructor(b: String) : super(b)

}

/**
 * Kotlin requires explicit modifiers for overridable members and overrides
 */

open class Shape {
    open fun draw() { /*...*/
    }

    fun fill() { /*...*/
    }

    open val vertexCount: Int = 0
}

class Circle() : Shape() {
    override fun draw() { /*...*/
    }
}

open class SomeRectangle() : Shape() {
    final override fun draw() { /*...*/
    }

    override val vertexCount = 4
}