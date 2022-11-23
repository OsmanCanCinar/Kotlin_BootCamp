package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
 * Bubble sort is one of the simplest sorting algorithms. The two adjacent elements of an array
 * are checked and swapped if they are in the wrong order and this process is repeated until we
 * get a sorted array.
 *
 * The steps of performing a bubble sort are:
 * 1) Compare the first and the second element of the array and swap them if they are in the wrong order.
 * 2) Compare the second and the third element of the array and swap them if they are in the wrong order.
 * 3) Proceed till the last element of the array in a similar fashion.
 * 4) Repeat all of the above steps until the array is sorted.
 */
@ComparisonSort
@StableSort
class BubbleSort<T> : AbstractSortStrategy<T>() {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        println("Bubble Sort WIP...")

        var exchanged: Boolean
        do {
            exchanged = false
            for (i in 1 until arr.size) {
                println()
                arr.forEach { print("$it,") }
                if (arr[i] < arr[i - 1]) {
                    arr.swap(i, i - 1)
                    exchanged = true
                }
            }
        } while (exchanged)
        println("\n\nAfter Bubble Sort:")
        arr.forEach { print("$it,") }
    }
}