
fun main() {
    var numList= listOf(1,2,3,4)
    println(numList)
    var reverseList=reverse(numList)
    println(reverseList)
}
fun reverse(numList : List<Int>): List<Int> = numList.reversed()