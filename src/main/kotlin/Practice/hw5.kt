package Practice

fun main() {
    println("Please enter your age :")
    val userInput = readLine()
    if (userInput != null){
        var age = userInput.toInt()
        if (age >=1 && age <=18){
            println("You are not an adult yet")
        }
        else if (age >=19 && age <=60){
            println("You are an adult")
        }
        else{
            println("You are really really old")
        }
    }
}