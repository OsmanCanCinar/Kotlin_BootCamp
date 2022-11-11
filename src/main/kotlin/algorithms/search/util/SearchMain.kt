package algorithms.search.util

import algorithms.search.BinarySearch
import algorithms.search.LinearSearch

fun main() {
    val linearSearch = LinearSearch<Int>()
    val binarySearch = BinarySearch<Int>()

    val numbers = arrayOf(12, 11, 13, 5, 6)

    linearSearch.perform(numbers, 13)
    binarySearch.perform(numbers, 13)
}
