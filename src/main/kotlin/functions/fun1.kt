package functions

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)
fun main() {
    val coffeeForDenis = CoffeeDetails(0,"Denis","xxl",0)
}

fun askCoffeeDetails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()
    //call functions
//    makeCoffee(sugarCount, name)
}

//define functions and use multiple parameter
fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugarCount == 1) {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar and this coffee for ${coffeeDetails.name} .")
    } else if (coffeeDetails.sugarCount == 0) {
        println("Coffee with No sugar and this coffee for ${coffeeDetails.name} .")
    } else {
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar and this coffee for ${coffeeDetails.name} .")
    }
}