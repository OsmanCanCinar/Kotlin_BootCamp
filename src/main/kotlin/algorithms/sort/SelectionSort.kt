package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
Selection Sort WIP...


After Selection Sort:

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

        println("\n\nAfter Insertion Sort:")
        arr.forEach { print("$it,") }
    }
}