package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
 * Merge sort is an algorithm that is n * log n in runtime complexity. It’s a divide and conquer algorithm
 * that splits a given list in half recursively until each list only has 1 element in it. Then it merges
 * these lists back into one big list by sorting each one of these smaller lists and merging them back up
 * into larger and larger lists.
 *
 * Merge Sort follows the rule of Divide and Conquer to sort a given set of numbers/elements, recursively,
 * hence consuming less time.
 */
@ComparisonSort
@StableSort
class MergeSort<T> : AbstractSortStrategy<T>() {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        println("Merge Sort WIP...")

        val aux = arr.clone()
        sort(arr, aux, 0, arr.size - 1)

        println("\n\nAfter Merge Sort:")
        arr.forEach { print("$it,") }
    }

    private fun <T : Comparable<T>> sort(array: Array<T>, aux: Array<T>, lo: Int, hi: Int) {
        if (hi <= lo) return
        val mid = (lo + hi) / 2
        sort(array, aux, lo, mid)
        sort(array, aux, mid + 1, hi)
        merge(array, aux, lo, mid, hi)
    }

    private fun <T : Comparable<T>> merge(array: Array<T>, aux: Array<T>, lo: Int, mid: Int, hi: Int) {
        System.arraycopy(array, lo, aux, lo, hi - lo + 1)

        var i = lo
        var j = mid + 1
        for (k in lo..hi) {
            when {
                i > mid -> array[k] = aux[j++]
                j > hi -> array[k] = aux[i++]
                aux[j] < aux[i] -> array[k] = aux[j++]
                else -> array[k] = aux[i++]
            }
        }
    }
}