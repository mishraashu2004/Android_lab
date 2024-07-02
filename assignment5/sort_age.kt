fun sort_Age(people: List<Pair<String, Int>>): List<Pair<String, Int>> {
    return people.sortedBy { it.second }
}
fun main() {
    val people = listOf("Ashu" to 19, "Ayush" to 20, "swaraj" to 21, "Deepsikha" to 22 )
    val s_People = sort_Age(people)
    println(s_People)
}