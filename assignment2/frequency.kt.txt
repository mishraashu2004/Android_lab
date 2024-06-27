fun main(args: Array<String>) {
    val string = "hello good afternoon every one i am ashutosh mishra "
    val searchele = 'o'
    var f = 0

    for (i in 0 until string.length - 1) {
        if (searchele == string[i]) {
            ++f
        }
        
    }
    val count= f

    println("Frequency of $searchele = $count")
}