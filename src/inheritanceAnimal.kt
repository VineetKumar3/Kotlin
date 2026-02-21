open class Animal(var name: String){
    open fun makeSound(){
        println("$name Animal make sound")
    }
}

class Dog(name: String) : Animal(name){
    override fun makeSound() {
        println("$name barks!!")
    }
}

fun main(){
    val animal = Animal("Dog")
    animal.makeSound()
    val dog = Dog("Dog")
    dog.makeSound()

}