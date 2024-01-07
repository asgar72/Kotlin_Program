package functions

fun main() {
    
    askCoffeeDetails()
}

fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()
    //call functions
    makeCoffee(sugarCount, name)
}

//define functions and use multiple parameter
fun makeCoffee(sugarCount: Int, name: String) {
    if (sugarCount == 1) {
        println("Coffee with $sugarCount spoon of sugar and this coffee for $name .")
    } else if (sugarCount == 0) {
        println("Coffee with No sugar and this coffee for $name .")
    } else {
        println("Coffee with $sugarCount spoon of sugar and this coffee for $name .")
    }
}