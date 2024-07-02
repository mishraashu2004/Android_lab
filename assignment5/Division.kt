fun dividenumber(num: Int, denom: Int): String {
    return try {
        val result = num / denom
        "Answer: $result"
    } catch (e: ArithmeticException) {
        "Error: Division by zero is Imposible."
    }
}
fun main() {
    println(dividenumber(10, 2))
    println(dividenumber(10, 0)) 
}
