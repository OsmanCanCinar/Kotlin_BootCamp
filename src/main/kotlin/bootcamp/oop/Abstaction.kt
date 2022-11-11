package bootcamp.oop

/***
 * class may be declared abstract, along with some or all of its members.
 * An abstract member does not have an implementation in its class.
 * You don't need to annotate abstract classes or functions with open.
 *
 * public: public keyword in Kotlin is similar to java it is use to make the visibility of classes, methods,
 * variables to access from anywhere.
 *
 * open: In Kotlin all classes, functions, and variables are by defaults final, and by inheritance property,
 * we cannot inherit the property of final classes, final functions, and data members.
 * So we use the open keyword before the class or function or variable to make inheritable that.
 */

abstract class PolygonAbstract {
    abstract fun draw()
}

class Rectangle : PolygonAbstract() {
    override fun draw() {
        // draw the rectangle
    }
}

open class PolygonOpen {
    open fun draw() {
        // some default polygon drawing method
    }
}

abstract class WildShape : PolygonOpen() {
    // Classes that inherit WildShape need to provide their own
    // draw method instead of using the default on Polygon
    abstract override fun draw()
}