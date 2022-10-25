package classes.generics

class Generics {

    sealed class MyIntList {
        fun get(pos: Int): Int = 0
        fun addItem(item: Int) {}
    }

    sealed class MyShortList {
        fun get(pos: Int): Short = 0
        fun addItem(item: Short) {}
    }

    sealed class MyList<T> {
        fun get(pos: Int): T {
            TODO()
        }

        fun addItem(item: T) {}
    }
}

