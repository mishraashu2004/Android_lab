
fun main() {
    var stringList1 = listOf("Ashutosh", "Mishra")
    var stringList2 = listOf("Ashutosh", "mishra", "ashu" ,"justice")
    println(stringList1)
    println(stringList2)
    var substring = isSubset(stringList1, stringList2)
    println(substring)
}
fun isSubset(stringList1: List<String>, stringList2: List<String>): Boolean {
    return stringList1.all {it in stringList2}
}