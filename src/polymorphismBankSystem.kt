open class Account(val principal: Double){
    open fun calculateInterest(): Double{
        return 0.0
    }
}

class SavingsAccount(principal: Double) : Account(principal){
    override fun calculateInterest(): Double {
        return  (principal * 5) / 100
    }
}

class CurrentAccount(principal: Double): Account(principal){
    override fun calculateInterest(): Double {
        return (principal * 2) / 100
    }
}

fun main(){
//    val savings = SavingsAccount(2500.00)
//    println(savings.calculateInterest())
//    val current = CurrentAccount(2500.00)
//    println(current.calculateInterest())

    val accounts: Array<Account> =  arrayOf(
        SavingsAccount(2500.00),
        CurrentAccount(2500.00))

    for (account in accounts){
        println(account.calculateInterest())
    }
}