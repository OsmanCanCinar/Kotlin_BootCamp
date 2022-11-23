package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
 * Selection sort is one of the simplest sorting algorithms. It is similar to the handpicking
 * where we take the smallest element and put it in the first position and the second smallest
 * in the second position and so on.
 *
 * We first check for the smallest element in the array and swap it with the first element of
 * the array. Again, we check for the smallest number in a subarray excluding the first element
 * of the array as it is where it should be (at the first position) and put it in the second position
 * of the array.
 */
@ComparisonSort
@StableSort
class SelectionSort<T> : AbstractSortStrategy<T>() {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        println("Selection Sort WIP...")

        for (i in arr.indices) {
            println()
            arr.forEach { print("$it,") }
            var min = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[min]) min = j
            }
            if (min != i) arr.swap(min, i)
        }

        println("\n\nAfter Selection Sort:")
        arr.forEach { print("$it,") }
    }
}