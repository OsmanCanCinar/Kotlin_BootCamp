package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
Insertion Sort WIP...
12,11,13,5,6,
11,12,13,5,6,
11,12,13,5,6,
5,11,12,13,6,

After Insertion Sort:
5,6,11,12,13,
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
