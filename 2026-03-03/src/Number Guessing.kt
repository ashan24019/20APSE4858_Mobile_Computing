fun main() {
    val targetNumber = 7
    var guess = 0

    println("Guess a number between 1 and 10")

    while (guess != targetNumber) {
        print("Enter your guess: ")
        val input = readln()
        guess = input.toInt()

        if (guess == targetNumber) {
            println("Entered number is correct!")
        } else {
            println("Try again.")
        }
    }
}