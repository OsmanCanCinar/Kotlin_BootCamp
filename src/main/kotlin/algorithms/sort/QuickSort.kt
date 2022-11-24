package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
 * Quick Sort is popular because it is faster and also space-efficient. But in the worst case,
 * it is O(n^2) then also it is better than other sorting algorithms which exhibit O(n^2) time
 * complexity.
 *
 * Quick Sort works on divide and conquer paradigm. It chooses an element known as a pivot and
 * ensures that it gets placed at its right position in the list that is being sorted and then
 * the process is repeated with the sub list on left of the pivot and on the right of the pivot,
 * till the list is sorted.
 *
 * The process of placing the pivot element in its final position is called as the partitioning.
 * You can choose any element as the pivot element and partition the array based on it.
 */
@ComparisonSort
@StableSort
class QuickSort<T> : AbstractSortStrategy<T>() {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        println("Quick Sort WIP...")

        sort(arr, 0, arr.size - 1)

        println("\n\nAfter Quick Sort:")
        arr.forEach { print("$it,") }
    }

    private fun <T : Comparable<T>> sort(arr: Array<T>, lo: Int, hi: Int) {
        if (hi <= lo) return
        val j = partition(arr, lo, hi)
        sort(arr, lo, j - 1)
        sort(arr, j + 1, hi)
    }

    private fun <T : Comparable<T>> partition(arr: Array<T>, lo: Int, hi: Int): Int {

        var i = lo
        var j = hi + 1
        val v = arr[lo]

        while (true) {
            while (arr[++i] < v) {
                if (i == hi) break
            }

            while (v < arr[--j]) {
                if (j == lo) break
            }

            if (j <= i) break
            arr.swap(j, i)
        }
        arr.swap(j, lo)
        return j
    }
}