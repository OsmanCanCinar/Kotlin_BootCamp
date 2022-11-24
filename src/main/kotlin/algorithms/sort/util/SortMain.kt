package algorithms.sort.util

import algorithms.sort.*

fun main() {

    var numbers = arrayOf(12, 11, 13, 5, 6)
    val insertionSort = InsertionSort<Int>()
    insertionSort.perform(numbers)
    println("\n")

    numbers = arrayOf(12, 11, 13, 5, 6)
    val selectionSort = SelectionSort<Int>()
    selectionSort.perform(numbers)
    println()

    numbers = arrayOf(12, 11, 13, 5, 6)
    val bubbleSort = BubbleSort<Int>()
    bubbleSort.perform(numbers)
    println()

    numbers = arrayOf(12, 11, 13, 5, 6)
    val mergeSort = MergeSort<Int>()
    mergeSort.perform(numbers)
    println()

    numbers = arrayOf(12, 11, 13, 5, 6)
    val quickSort = QuickSort<Int>()
    quickSort.perform(numbers)
    println()

    numbers = arrayOf(12, 11, 13, 5, 6)
    val shellSort = ShellSort<Int>()
    shellSort.perform(numbers)
    println()
}