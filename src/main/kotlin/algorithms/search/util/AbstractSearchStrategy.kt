package algorithms.search.util

abstract class AbstractSearchStrategy<T> {
    abstract fun <T : Comparable<T>> perform(array: Array<T>, element: T): Int
}