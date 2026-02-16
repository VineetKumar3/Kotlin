class Bike{
    val engineNO: Int = 12322887
    val name: String = "Duke 250"
    val price: Int = 250000

    fun bikedetail(){
        println(" Bike name is: $name \n Engine no is: $engineNO \n price is: $price")
    }

}


fun main() {
    var bike = Bike()
    bike.bikedetail()
}