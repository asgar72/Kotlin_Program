package class_obj

fun main() {

    // Creating an object/instance of the class Dog
    var daisy = Dog("Daisy","Dwarf poodle",1)
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
    println("A year is passed!")
    daisy.age=2
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old")
}