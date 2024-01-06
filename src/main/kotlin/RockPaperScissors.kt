package Practice

fun main() {

    var computerChoice = ""
    var playerChoice = ""
    println("Rock, Paper or Scissors? Enter your choice!")

    // Read user input and validate it
    do {
        playerChoice = readln().toString()
        if (playerChoice !in listOf("Rock", "Paper", "Scissors")) {
            println("Invalid choice. Please enter Rock, Paper, or Scissors.")
        }
    } while (playerChoice !in listOf("Rock", "Paper", "Scissors"))

    val randomNumber = (1..3).random()
    if(randomNumber == 1) {
        computerChoice = "Rock"
    } else if (randomNumber == 2) {
        computerChoice = "Paper"
    } else if (randomNumber == 3) {
        computerChoice = "Scissors"
    }
    println(computerChoice)

    val winner = when{
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if(winner == "Tie"){
        println("It's a tie")
    }else{
        println("$winner won!")
    }
}