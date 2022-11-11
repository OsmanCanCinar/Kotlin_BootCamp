package bootcamp.basic_types

fun main() {
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]

    // Array of int of size 5 with values [0, 0, 0, 0, 0]
    val arr = IntArray(5)

    // Example of initializing the values in the array with a constant
    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr2 = IntArray(5) { 42 }

    // Example of initializing the values in the array using a lambda
    // Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialized to their index value)
    var arr3 = IntArray(5) { it * 1 }

    val fishes = mutableListOf<String>("Salmon", "Tuna", "Shark")
    fishes.remove("Shark")

    // The Difference between list and array
    /***
     *  Arrays have a fixed size while
     *  (Mutable)List can adjust their size dynamically.
     *  Moreover, Array is mutable whereas List is not.
     */
    val a = arrayOf(1, 2, 3)
    a[0] = a[1] // OK

    val l = listOf(1, 2, 3)
    //l[0] = l[1] // doesn't compile

    val m = mutableListOf(1, 2, 3)
    m[0] = m[1] // OK

    //Reason why you implement the equals and hashCode functions when you work with arrays!
    val l1 = listOf("a")
    val l2 = listOf("a")
    var z = (l1 == l2) // => true

    val a1 = arrayOf("a")
    val a2 = arrayOf("a")
    var y = (a1 == a2) // => false
}