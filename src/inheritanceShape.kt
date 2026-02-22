open class Color(val color : String){
    open fun area(){
        println("Area not defined")
    }
}

class rectangle(val length : Int, val width : Int, color :String) : Color(color){
    override fun area() {
        val area = length * width
        println("Area of color $color is equal to $area")
    }
}

fun main(){
    val color = Color("red")
    color.area()
    val rectanglearea = rectangle(2,2,"Blue")
    rectanglearea.area()
}