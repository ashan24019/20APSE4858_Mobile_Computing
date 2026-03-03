fun main() {
    val numbers = listOf(12, 45, 7, 23, 56, 89, 34)

    var maxNumber = numbers[0]
    
    for (number in numbers) {
        if (number > maxNumber) {
            maxNumber = number
        }
    }
    
    println("The largest number is: $maxNumber")
}