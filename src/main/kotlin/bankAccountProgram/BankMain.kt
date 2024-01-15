package bankAccountProgram

fun main(){
        val abbasBankAccount = BankAccount("Asgar Abbas",1478.20)
        abbasBankAccount.deposit(400.0)
        abbasBankAccount.withdraw(1500.00)
        abbasBankAccount.deposit(3000.00)
        abbasBankAccount.deposit(2000.00)
        abbasBankAccount.withdraw(3232.20)

        abbasBankAccount.displayTransactionHistory()
    println("${abbasBankAccount.accountHolder}'s " +
            "balance is $${abbasBankAccount.balance}")
}