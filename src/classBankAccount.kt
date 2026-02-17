import java.awt.print.Printable

class BankAccount(val accountHolder : String, var balance : Double){

    fun deposit(amount : Double){
        balance += amount
        println("Deposited $amount")
    }

    fun withdraw(amount : Double){
        if (balance >= amount){
            balance -= amount
            println("withdrawn $amount")
        }else{
            println("withdrawn amount $balance too high")
        }
    }

    fun checkBalance() : Double{
        return balance
    }

    fun getinfo(){
        println("Account holder name: $accountHolder")
        println("Balance amount:  $balance")
    }
}

fun main() {
    val account = BankAccount("Vineet", 15000.0)

    account.deposit(500.0)
    account.withdraw(1000.0)

    account.getinfo()

    println("Final Balance: ₹${account.checkBalance()}")
}
