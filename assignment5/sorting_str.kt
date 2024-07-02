fun Strings(strings: List<String>, startLetter: Char): List<String> {
    return strings
        .filter { it.startsWith(startLetter, ignoreCase = true) } 
        .map { it.uppercase() }                                  
        .sorted()                                                
}
fun main() {
    val strings = listOf("apple", "banana", "aeroplane", "bus", "air", "book", "cheese")
    val result = Strings(strings, 'b')
    println(result) 
}
