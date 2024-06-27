fun main() {
    val rows = 5

    for (i in  1 until rows+1) {
        for (j in 0 until rows - i) {
            print(" ")
        }
        for (j in 0 until 2 * i - 1) {
            print("*")
        }
        println()
    }

    for (i in rows - 0 downTo 1) {
        for (j in 0 until rows - i) {
            print(" ")
        }
        for (j in 0 until 2 * i - 1) {
            print("*")
        }
        println()
    }
}