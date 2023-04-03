fun main() {
    var continuePlaying = true
    while (continuePlaying) {
        val computerChoice = generateComputerChoice()
        val userChoice = getUserChoice()
        val winner = determineWinner(userChoice, computerChoice)
        displayResults(userChoice, computerChoice, winner)
        continuePlaying = promptToPlayAgain()
    }
}

fun generateComputerChoice(): String {
    val choice = Random.nextInt(1, 4)
    return when (choice) {
        1 -> "rock"
        2 -> "paper"
        3 -> "scissors"
        else -> throw IllegalArgumentException("Invalid choice: $choice")
    }
}

fun getUserChoice(): String {
    println("Choose rock, paper, or scissors:")
    var input: String? = null
    while (input == null) {
        input = readLine()?.trim()?.toLowerCase()
        if (input !in setOf("rock", "paper", "scissors")) {
            println("Invalid input. Please choose rock, paper, or scissors:")
            input = null
        }
    }
    return input
}

fun determineWinner(userChoice: String, computerChoice: String): String? {
    if (userChoice == computerChoice) {
        return null // Tie
    }
    return when (userChoice) {
        "rock" -> if (computerChoice == "scissors") "user" else "computer"
        "paper" -> if (computerChoice == "rock") "user" else "computer"
        "scissors" -> if (computerChoice == "paper") "user" else "computer"
        else -> throw IllegalArgumentException("Invalid choice: $userChoice")
    }
}

fun displayResults(userChoice: String, computerChoice: String, winner: String?) {
    println("You chose $userChoice.")
    println("The computer chose $computerChoice.")
    if (winner == null) {
        println("It's a tie!")
    } else {
        println("${winner.capitalize()} wins!")
    }
}

fun promptToPlayAgain(): Boolean {
    println("Do you want to play again? (y/n)")
    var input: String? = null
    while (input == null) {
        input = readLine()?.trim()?.toLowerCase()
        when (input) {
            "y" -> return true
            "n" -> return false
            else -> {
                println("Invalid input. Please enter y or n.")
                input = null
            }
        }
    }
    return false 
}
main()
