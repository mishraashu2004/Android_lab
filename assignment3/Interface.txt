interface Drawable {
    fun drawInfo()
}
class Square(val sideLength: Double) : Drawable {
    override fun drawInfo() {
        println("Square with side length $sideLength")
        println("Area: ${sideLength * sideLength}")
        println("Perimeter: ${4 * sideLength}")
    }
}
class Triangle(val base: Double, val height: Double) : Drawable {
    override fun drawInfo() {
        println("Triangle with base $base and height $height")
        println("Area: ${(base * height) / 2}")
        println("Perimeter: ${base + 2 * (Math.sqrt((base / 2) * (base / 2) + height * height))}")
    }
}
fun main() {
    val square = Square(5.0)
    val triangle = Triangle(4.0, 3.0)
    square.drawInfo()
    triangle.drawInfo()
}