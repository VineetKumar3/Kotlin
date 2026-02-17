class constructorMobile(val brand : String, val price : Double){
    init {
        if (price<=0){
            println("The price is invalid")
        }else{
            println("Mobile created successfully")
        }
    }
    fun showDetails(){
        println("Brand: $brand\nPrice: $price")
    }
}

fun main(){
    val phone1 = constructorMobile("Redmi",11000.0)
    phone1.showDetails()

    println("---------------")

    val phone2 = constructorMobile("infinix",0.0)
    phone2.showDetails()
}