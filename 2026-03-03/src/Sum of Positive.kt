fun main() {
    val numbers = listOf(-10, 15, 2, -5, 30, -8, 0, 12)
    var sum = 0

    for (number in numbers) {
        if (number > 0) {
            sum += number
        }
    }

    println("Sum of positive numbers: $sum")
}