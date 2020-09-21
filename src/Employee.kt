class Employee constructor(var firstName: String,
                           var lastName: String,
                           var employeeNumber: String,
                           var employeeShift: Int
                           ){  // constructs our class and holds our variables
    fun printAll(){
        println(firstName + " " + lastName + "\nemployee number: "
                + employeeNumber + "\nshift: " + employeeShift.toString())  // prints our information in a nice format
    }
}