open class Payment(){
    open fun pay(amount : Double){
        println("Payment of $amount done")
    }
}

class CreditCardPayment(): Payment() {
    override fun pay(amount : Double){
        println("Payment of $amount done via Credit Card")
    }
}

class UPIPayment(): Payment(){
    override fun pay(amount: Double){
        println("Payment of $amount done via UPI ")
    }
}

class CashPayment(): Payment(){
    override fun pay(amount : Double){
        println("Payment of $amount done via Cash")
    }
}


fun main(){

    val payment : Array<Payment> = arrayOf(
        CreditCardPayment(),
        UPIPayment(),
        CashPayment()
    )

    for (payments in payment){
        payments.pay(1200.00)
    }
}