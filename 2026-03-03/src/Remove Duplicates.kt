fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5, 5, 5, 6)
    val distinctNumbers = numbers.toSet().toList()

    println("List without duplicates: $distinctNumbers")
}