class BankAccount(val accountNumber: String, var balance: Double) {
fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited \$${amount}")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance =balance-amount
            println("Withdrawn \$${amount}")
        }
    }
}
fun main() {
    val account = BankAccount("904034526737", 1000.0)
    println("Account Number: ${account.accountNumber}")
    println("Initial Balance: \$${account.balance}")
    account.deposit(500.0)
    account.withdraw(200.0)
    account.withdraw(1500.0)
    println("Final Balance: \$${account.balance}")
}
