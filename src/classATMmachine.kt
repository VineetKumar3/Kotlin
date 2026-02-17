class ATM(val accountHolder : String, var balance : Double = 0.0){

    fun deposit(amount : Double)  {
        if(amount > 0){
            balance += amount
            println("Amount Deposited successfully $amount")
        }else{
            println("Invalid amount deposited")
        }
    }

    fun withdraw(withdrawAmount : Double)  {
        if(withdrawAmount < 0){
            println("Withdrawal amount is invalid")
        }else if(withdrawAmount > balance){
            println("Withdrawal amount is greater than balance")
        }else{
            balance -= withdrawAmount
            println("Withdrawal done successfully for amount $withdrawAmount")
        }
    }

    fun transfer(amount : Double, receiver : ATM) {
        if(amount > balance){
            println("Transfer amount is greater than balance")
        }else{
            balance -= amount
            receiver.balance += amount
            println("Amount Transfer successfully {${receiver.accountHolder}}")
        }
    }


    fun checkBalance() : Double{
        return balance
    }
}

fun main(){
    val user1 = ATM("Vineet", 1000.0)
    val user2 = ATM("Rahul", 500.0)

    user1.transfer(300.0, user2)

    println(user1.balance)  // 700
    println(user2.balance)  // 800


}