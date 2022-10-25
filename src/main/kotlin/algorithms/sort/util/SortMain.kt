package algorithms.sort.util

import algorithms.sort.InsertionSort
import algorithms.sort.SelectionSort

fun main() {

    val insertionSort = InsertionSort<Int>()
    val selectionSort = SelectionSort<Int>()

    val numbers = arrayOf(12, 11, 13, 5, 6)

    insertionSort.perform(numbers)
    println()
    selectionSort.perform(numbers)
    println()
}