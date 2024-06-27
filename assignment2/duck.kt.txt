fun main() {
    
    val number = "1023"
    
     if (number[0] == '0') {
        println("$number is not a Duck Number.")
    }
     else{var i = 1
    while (i < number.length) {
        if (number[i] == '0') {
            println("$number is a Duck Number.")
        }
        i++
  }
}
}
