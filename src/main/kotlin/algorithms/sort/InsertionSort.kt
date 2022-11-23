package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
 * Insertion sort is similar to arranging the documents of a bunch of students
 * in order of their ascending roll number.
 *
 * Starting from the second element, we compare it with the first element and swap
 * it if it is not in order. Similarly, we take the third element in the next iteration
 * and place it at the right place in the subarray of the first and second elements
 * (as the subarray containing the first and second elements is already sorted).
 *
 */
@ComparisonSort
@StableSort
class InsertionSort<T> : AbstractSortStrategy<T>() {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {

        println("Insertion Sort WIP...")

        for (i in 1 until arr.size) {

            println()
            arr.forEach { print("$it,") }

            for (j in i downTo 1) {
                if (arr[j - 1] < arr[j]) break
                else arr.swap(j, j - 1)
            }
        }

        println("\n\nAfter Insertion Sort:")
        arr.forEach {
            print("$it,")
        }
    }
}
