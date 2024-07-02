fun max(a: Int, b: Int): Int {
    return if (a > b){
        return a
    } 
           else {
               return b
           }
}
fun main() {
    val n1 = 5
    val n2 = 10
    println("The larger number is: ${max(n1, n2)}")
}