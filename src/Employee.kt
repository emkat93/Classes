class Employee constructor(var firstName: String,
                           var lastName: String,
                           var employeeNumber: String,
                           var employeeShift: Int
                           ){
    fun printAll(){
        println(firstName + " " + lastName + "\nemployee number: "
                + employeeNumber + "\nshift: " + employeeShift.toString())
    }
}