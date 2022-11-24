package algorithms.sort

import algorithms.sort.util.AbstractSortStrategy
import algorithms.sort.util.ComparisonSort
import algorithms.sort.util.StableSort
import algorithms.sort.util.swap

/**
 * Shell sort in kotlin is the generalization of insertion sort which overcomes the drawbacks of insertion sort
 * by comparing elements separated by a gap of several positions.
 *
 * Shell sort allows sorting elements which are far apart. In case of insertion sort, comparison happens between
 * only adjacent elements but in shell sort, it avoids comparing adjacent elements until the last step. The Last
 * step of shell sort is ultimately insertion sort.
 *
 * In short, it improves insertion sort by comparison and exchange elements that are far away.
 *
 * Shell sort uses a sequence that can be referred as increment sequence. Shell sort makes multiple passes over
 * the array and sort number of an equally sized array using insertion sort.
 */
@ComparisonSort
@StableSort
class ShellSort<T> : AbstractSortStrategy<T>() {

    override fun <T : Comparable<T>> perform(arr: Array<T>) {
        println("Shell Sort WIP...")

        var h = 1
        while (h < arr.size / 3) {
            h = h * 3 + 1
        }

        while (h > 3) {
            for (i in h until arr.size) {
                for (j in i downTo h step h) {
                    if (arr[j - h] < arr[j]) break
                    arr.swap(j, j - h)
                }
            }
            h /= 3
        }

        println("\n\nAfter Shell Sort:")
        arr.forEach { print("$it,") }
    }
}