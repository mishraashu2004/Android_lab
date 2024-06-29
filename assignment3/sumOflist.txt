fun sumoflist(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum = sum+number
    }
    return sum
}
fun main() {
    val list = listOf(1,2,3,4,5,8,7)
    println("Sum of list: ${sumoflist(list)}")
}
