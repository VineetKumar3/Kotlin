class AgeValidation(val name : String, age : Int){
    var age : Int = age
     set(value) {
         if(value > 1){
             field = value
         }else{
             println("invalid age it should be greater than 0")
         }
     }
}

fun main(){
    val user = AgeValidation("Vineet", 10)
    println(user.age)

    user.age = 0
    println(user.age)
}