abstract class Shape {
    abstract fun area(): Double
}
class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double {
        return width * height
    }
    fun circum(): Double {
        return 2 * (width + height)
    }
}
class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.141 * radius * radius
    }
    fun perimeter(): Double {
        return 2 * 3.141 * radius
    }
}
fun main() {
    val rectangle = Rectangle(5.9, 3.8)
    val circle = Circle(4.1)   
    println("Rectangle:")
    println("Area: ${rectangle.area()}")
    println("Circumference: ${rectangle.circum()}")   
    println("Circle:")
    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")
}
