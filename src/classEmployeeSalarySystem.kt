class classEmployeeSalarySystem(val name: String, var monthlySalary: Double) {
     fun increaseSalary(percent:Double) {
         val increasedSalary = monthlySalary + (monthlySalary * percent/100.0)
         monthlySalary = increasedSalary
     }

    fun yearlySalary() : Double{
        return monthlySalary * 12
    }

    fun salaryCategory(){
        if(yearlySalary() > 600000.0){
            println("High Earner")
        }else{
            println("Normal Earner")
        }
    }
}

fun main(){
    val employee1 = classEmployeeSalarySystem("Vineet Kumar", 100000.0)
    employee1.increaseSalary(5.0)
    println("Salary ${employee1.monthlySalary}")
    employee1.salaryCategory()

    println("---------------------------------")

    val employee2 = classEmployeeSalarySystem("Mercedes", 40000.0)
    employee2.increaseSalary(1.0)
    println("Salary ${employee2.monthlySalary}")
    employee2.salaryCategory()
}