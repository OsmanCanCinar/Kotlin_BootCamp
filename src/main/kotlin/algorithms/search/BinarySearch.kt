package algorithms.search

import algorithms.search.util.AbstractSearchStrategy

class BinarySearch<T> : AbstractSearchStrategy<T>() {

    override fun <T : Comparable<T>> perform(array: Array<T>, element: T): Int {
        var lo = 0
        var hi = array.size - 1
        while (lo <= hi) {
            val mid = (lo + hi) / 2
            when {
                element < array[mid] -> hi = mid - 1
                element > array[mid] -> lo = mid + 1
                else -> {
                    println("element found at index $mid")
                    return mid
                }
            }
        }
        return -1
    }
}