
 fun main() {
    var numList= listOf(1,2,3,4,5,6,7,8)
    println(numList)
    var newList= filter(numList,4)
    println(newList)
}
fun filter(numList :List<Int> , n :Int):List<Int> = numList.filter {it >= n}