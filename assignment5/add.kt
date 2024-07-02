fun add(x: Int): (Int) -> Int {
    return { y: Int -> x + y }
}
fun main() {
    val Five = add(5)
    val Ten = add(10)
    println(five(10))
    println(ten(10))
}
