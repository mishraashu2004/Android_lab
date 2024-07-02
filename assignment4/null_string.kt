
fun StringLength(input: String?): Int {
    return input?.length ?: -1
}

fun main() {
    val nullString: String? = null
    println(StringLength(nullString))   
}