
fun filterNonNullNumbers(num: List<Int?>): List<Int> {
    return num.filterNotNull()
}

fun main() {
    val nullableIntegers = listOf(1 , 2 , null , 7 , null , 9 , 13 , 15 , null)
    val nonNullNumbers = filterNonNullNumbers(nullableIntegers)
    println(nonNullNumbers) 
}