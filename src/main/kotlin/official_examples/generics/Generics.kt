package official_examples.generics

/**
 * Generics are a genericity mechanism that's become standard in modern languages. Generic classes and
 * functions increase code reusability by encapsulating common logic that is independent of a
 * particular generic type, like the logic inside a List<T> is independent of what T is.
 */

fun main() {
    val mutableStack = MutableStack(1, 2, 3, 4, 5, 6, 7, 8)
    println(mutableStack.toString())

    mutableStack.push(9)
    println(mutableStack.toString())

    println(mutableStack.peek())

    mutableStack.pop()
    println(mutableStack.toString())

    println(mutableStack.isEmpty())
    println(mutableStack.size())

    val anotherMutableStack = mutableStackOf(1, 2, 3)

    anotherMutableStack.push(4)
    println(anotherMutableStack.toString())

    println(anotherMutableStack.peek())

    anotherMutableStack.pop()
    println(anotherMutableStack.toString())

    println(anotherMutableStack.isEmpty())
    println(anotherMutableStack.size())
}

/**
 * The first way to use generics in Kotlin is creating generic classes.
 *
 * Defines a generic class MutableStack<E> where E is called the generic type parameter.
 * At use-site, it is assigned to a specific type such as Int by declaring a MutableStack<Int>.
 */

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    // Inside the generic class, E can be used as a parameter like any other type.
    fun push(element: E) = elements.add(element)

    // You can also use E as a return type.
    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString(): String = "MutableStack(${elements.joinToString()})"

}

/**
 * You can also generify functions if their logic is independent of a specific type.
 * For instance, you can write a utility function to create mutable stacks:
 */

fun <E> mutableStackOf(vararg element: E) = MutableStack(*element)