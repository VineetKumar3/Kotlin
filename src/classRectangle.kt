class Rectangle (val length: Double, val width: Double){
    fun area() : Double{
        return length*width

    }

    fun perimeter(): Double{
        return ((length*2)+(width*2))
    }
}

fun main(){
    val rectangle = Rectangle(10.0,10.0)

    println("Area: ${rectangle.area()}")
    println("Perimeter: ${rectangle.perimeter()}")
}