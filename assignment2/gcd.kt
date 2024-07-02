fun main() {
    val num1 = 81
    val num2 = 153
    var gcd = 1

    var n = 1
    while (n <= num1 && n <= num2) {
        if (num1 % n == 0 && num2 % n == 0)
            gcd = n
        ++n
    }

    println("greatest common deviser of $num1 and $num2 is $gcd")
}