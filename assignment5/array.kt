fun ArrayElement(array: Array<Int>, index: Int): Int? {
    return try {
        array[index]
    } catch (e:Exception) {
        println("Error: Entered index have no elements")
        null
    }
}
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val element1 = ArrayElement(array, 2)
    println("Element at index 2: $element1")
    val element2 = ArrayElement(array, 10)
    println("Element at index 10: $element2")
}
