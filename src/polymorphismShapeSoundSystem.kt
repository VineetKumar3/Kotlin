open class Shape(){
    open fun draw(){
        println("Drawing Shape")
    }
}
class Circle : Shape(){
    override fun draw(){
        println("Drawing Circle")
    }
}

class Square : Shape(){
    override fun draw(){
        println("Drawing Square")
    }
}

class Triangle : Shape(){
    override fun draw(){
        println("Drawing Triangle")
    }
}

class Cone : Shape(){
    override fun draw(){
        println("Drawing Cone")
    }
}

fun main(){
//    val circle : Shape = Circle()
//    circle.draw()
//    val square : Shape = Square()
//    square.draw()
//    val shape = Shape()
//    shape.draw()

    val allshapes =  arrayOf(Circle(), Square(), Triangle(), Cone())
    for(Shape in allshapes){
        Shape.draw()
    }
}