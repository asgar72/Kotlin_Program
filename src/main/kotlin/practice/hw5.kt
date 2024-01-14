package practice

fun main() {
    println("Please enter your age :")
    val age = readLine()?.toInt()

    if (age != null){
        if (age >=1 && age < 18){
            println("You are not an adult yet")
        }
        else if (age >=18 && age <= 60){
            println("You are an adult")
        }
        else{
            println("You are really really old")
        }
    }
}