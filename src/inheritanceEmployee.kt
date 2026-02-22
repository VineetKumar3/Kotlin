open class Employee(val name: String, var salary: Double) {

    open fun work(){
        println("Employee is working")
    }
}

class Manager(name: String, salary: Double, var department : String) : Employee(name, salary) {
    override fun work() {
        super.work()
        println("Manager $name manages department $department")
    }
}

fun main() {

    val employee2 = Manager("Rahul", 10000.00,"IT")
    employee2.work()
}