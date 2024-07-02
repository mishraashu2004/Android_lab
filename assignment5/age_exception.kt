class Invalidageexception(message: String) : Exception(message)
fun checkAge(age: Int) {
    if (age < 18) {
        throw Invalidageexception("Sorry you are under age.")
    } else {
        println("Yes you are eligible.")
    }
}
fun main() {
    try {
        checkAge(60)
    } catch (e: Invalidageexception) {
        println(e.message)
    }
    try {
        checkAge(5)
    } catch (e: Invalidageexception) {
        println(e.message)
    }
}
