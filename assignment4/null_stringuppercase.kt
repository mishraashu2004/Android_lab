
fun printUppercaseOrNull(input: String?) {
    input?.let {
        println(it.uppercase())
    } ?: println("String is null")
}

fun main() {
    val nonNullString = "Ashu, Mishra"
    val nullString: String? = null
    
    printUppercaseOrNull(nonNullString) 
    printUppercaseOrNull(nullString)    
}