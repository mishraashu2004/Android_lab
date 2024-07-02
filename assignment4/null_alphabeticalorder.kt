
data class User(val name: String?, val email: String?)

fun userDetails(user: User) {
    val name = user.name
    val email = user.email
    if (name == null || email == null) {
        println("Incomplete User")
    } else {
        println("name=$name, email=$email")
    }
}

fun main() {
    val completeUser = User(name = "Ashutosh", email = "ashutoshmishra
@gmail.com")
    val incompleteUser1 = User(name = "Ashutosh", email = null)
    val incompleteUser2 = User(name = null, email = "ashutoshmishra
@gmail.com")
    userDetails(completeUser)       
    userDetails(incompleteUser1)     
    userDetails(incompleteUser2)     
    
}