package examples.delegation

import kotlin.reflect.KProperty

/**
 * Kotlin provides a mechanism of delegated properties that allows delegating the calls of the property set
 * and get methods to a certain object. The delegate object in this case should have the method getValue.
 * For mutable properties, you'll also need setValue.
 */
fun main() {
    val e = Example()
    println(e.p)
    e.p = "New"
}

class Example {

    // Delegates property p of type String to the instance of class Delegate.
    // The delegate object is defined after the by keyword.
    var p: String by Delegate()

    override fun toString(): String = "Example Class"
}

class Delegate() {

    // Delegation methods. The signatures of these methods are always as shown in the example.
    // Implementations may contain any steps you need. For immutable properties only getValue is required.
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    // Delegation methods. The signatures of these methods are always as shown in the example.
    // Implementations may contain any steps you need. For immutable properties only getValue is required.
    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}