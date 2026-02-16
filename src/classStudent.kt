class Student(val name: String , val rollno: Int , val  marks: Int ){

    fun getDetails(){
        println("Name: $name ")
        println("Roll No: $rollno")
        println("Marks: $marks")
    }

    fun isPass(){
        if (marks >= 40){
            println("You are Passed and Promoted")
        }else{
            println("You are Not Passed")
        }
    }
}

fun main(){
    val vineet = Student("Vineet",12322887, 89)
    val himkesh = Student("Himkesh",12322887, 100)

    vineet.getDetails()
    vineet.isPass()
    himkesh.getDetails()
    himkesh.isPass()
}