class student(val name: String, var marks: Int) {

    constructor(name: String): this(name, 0)

    fun results(){
        if(marks >= 40){
            println("Pass")
        }else{
            println("Fail")
        }
    }

    fun showDetails(){
        println("Name: $name")
    }
}
fun main(){
    val student1 = student("Vineet", 100)
    val student2 = student("Rahul")


    student1.showDetails()
    student1.results() 

    student2.showDetails()
    student2.results()


}