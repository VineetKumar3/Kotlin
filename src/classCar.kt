class Car(val brand: String , val model: String , val price: Double ){
    fun carInfo(){
        println("$brand\n $model\n $price")
    }
}

fun main(){
    val car1 = Car("BMW","M4",3000000.0)
    car1.carInfo()
    val car2 = Car("Mercedes","AMG",5000000.0)
    car2.carInfo()
}