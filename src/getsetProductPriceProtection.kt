class getsetProductPriceProtection(price: Double, var discount: Double) {

    private var price: Double = price
    set(value) {
        if (value >= 0){
            field = value
        }else{
            println("$value is less than 0")
        }
    }
    val finalPrice: Double
    get() = price - (price * discount/100)
}

fun main(){
    val product = getsetProductPriceProtection(100.00, 10.00)

    println("final price: ${product.finalPrice}")

    product.discount = 30.00
    println("final price: ${product.finalPrice}")
}