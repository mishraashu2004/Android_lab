fun main() {
    val number = 153

    var sum = 0
    var onumber = number
    while (onumber > 0) {
        val digit = onumber % 10
        sum = sum+(digit * digit * digit)
        onumber /= 10
    }

    if (sum == number) {
        println("$number is an Armstrong number")
    } else {
        println("$number is not an Armstrong number")
    }
}