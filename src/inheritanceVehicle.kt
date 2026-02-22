open class Vehicle(val brand : String, var speed : Int) {
    open fun drive(){
        println("Vehicle is driving at speed $speed kmph")
    }
}

class car(brand : String,speed: Int) : Vehicle(brand, speed){
    override fun drive() {
        println("$brand is driving at the speed of $speed kmph")
    }
}

fun main(){
    val vehicle = Vehicle("Normal Vehicle",60)
    vehicle.drive()
    val BMW = car("BMW",120)
    BMW.drive()
    val Mercedes = car("Mercedes",120)
    Mercedes.drive()
}