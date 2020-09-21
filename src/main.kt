fun main(){
    val person1 = Employee("Rosella", "Valentine", "24", 3)  // person 1 info
    val person2 = Employee("Leon", "Pendragon", "16", 1)  // person 2 info
    val person3 = Employee("Julia", "Stone", "60", 2)  // person 3 info

    person1.printAll() // calls the function printAll to send person 1's info
    println("\n")  // prints a space between person 1 and 2
    person2.printAll() // calls the function printAll to send person 2's info
    println("\n")  // prints a space between person 2 and 3
    person3.printAll() // calls the function printAll to send person 3's info
}