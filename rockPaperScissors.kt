fun main() {
    val computerChoice = getComputerChoice()
    val userChoice = getUserChoice()
    printChoices(computerChoice, userChoice)
    determineWinner(computerChoice, userChoice)
}

fun getComputerChoice(): String {
    val randomNumber = Random.nextInt(1, 4)
    return when (randomNumber) {
        1 -> "rock"
        2 -> "paper"
        else -> "scissors"
    }
}

fun getUserChoice(): String {
    println("Please enter your choice (rock/paper/scissors): ")
    var userInput = readLine()
    while (userInput != "rock" && userInput != "paper" && userInput != "scissors") {
        println("Invalid choice. Please enter rock, paper, or scissors: ")
        userInput = readLine()
    }
    return userInput
}

fun printChoices(computerChoice: String, userChoice: String) {
    println("You chose $userChoice.")
    println("The computer chose $computerChoice.")
}

fun determineWinner(computerChoice: String, userChoice: String) {
    when {
        computerChoice == userChoice -> println("It's a tie!")
        computerChoice == "rock" && userChoice == "scissors" -> println("You lose. Rock smashes scissors.")
        computerChoice == "scissors" && userChoice == "paper" -> println("You lose. Scissors cut paper.")
        computerChoice == "paper" && userChoice == "rock" -> println("You lose. Paper wraps rock.")
        else -> println("You win!")
    }
}
