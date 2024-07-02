fun main() {
    val number = 5
    val factorial = calculatefact(number)
    println("Factorial of is: $factorial")
}
fun calculatefact(number: Int): Int {
    val factorial: (Int) -> Int= {
        var result: Int = 1
        for (i in 1 until it+1) {
            result *= i
        }
        result
    }
    return factorial(number)
}