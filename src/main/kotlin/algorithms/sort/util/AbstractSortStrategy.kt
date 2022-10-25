package algorithms.sort.util

abstract class AbstractSortStrategy<T> {
    abstract fun <T : Comparable<T>> perform(arr: Array<T>)
}