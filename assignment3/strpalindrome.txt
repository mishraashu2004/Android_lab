fun isPalindrome(input: String): Int {
    val length = input.length
    for (i in 0 until length / 2) {
        if (input[i] != input[length - 1 - i]) {
            return 0
        }
    }
    return 1
}

fun main() {
    val str = "mod"
    if (isPalindrome(str) == 1) {
        println("String is palindrome")
    } else {
        println("String is not palindrome")
    }
}
