class Phone(val brand : String, var batteryPercentage : Int) {

    fun usePhone(hours: Int){
         val usage = hours * 10

        if(usage >= batteryPercentage){
            batteryPercentage = 0
        }else{
            batteryPercentage -= usage
        }
    }

    fun showBattery(){
        println("Battery percentage: $batteryPercentage")
    }

    fun charge(){
        batteryPercentage = 100
    }
}

fun main(){
    val phone = Phone("Redmi", 100)

    phone.usePhone(3)
    //phone.charge()
    phone.showBattery()

}