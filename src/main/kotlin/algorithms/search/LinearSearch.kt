package algorithms.search

import algorithms.search.util.AbstractSearchStrategy

/**
 * Linear search checks if an element is present in the given list by comparing it with every
 * element in the list. If it is found then we print the location at which it occurs, otherwise,
 * the list doesn't contain the element we are searching for.
 *
 * When we are looking for a specific element from the list/collection, we have to go to each
 * index and check whether the given value is equal or not.

 * Linear search is the simplest search algorithm; it is a special case of brute-force search.
 * Its worst-case cost is proportional to the number of elements in the list.
 */
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