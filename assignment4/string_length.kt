
 fun stringsToLength(strings: List<String>): Map<String, Int> {
    return strings.associateWith { it.length }
}

fun main() {
    val strings = listOf("My", "name", "is", "Ashu")
    val lengthMap = stringsToLength(strings)
    println(lengthMap)
}