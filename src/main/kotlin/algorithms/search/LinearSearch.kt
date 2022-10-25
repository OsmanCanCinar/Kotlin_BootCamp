package algorithms.search

import algorithms.search.util.AbstractSearchStrategy

class LinearSearch<T> : AbstractSearchStrategy<T>() {

    override fun <T : Comparable<T>> perform(array: Array<T>, element: T): Int {
        for ((i, a) in array.withIndex()) {
            if (a == element) {
                println("found index is $i")
                return i
            }
        }
        return -1;
    }
}