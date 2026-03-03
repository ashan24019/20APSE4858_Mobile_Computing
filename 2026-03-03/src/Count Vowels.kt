fun main() {
    val text = "Sabaragamuwa"
    var count = 0
    val vowels = "aeiouAEIOU"

    for (char in text) {
        if (char in vowels) {
            count++
        }
    }

    println("Vowels count: $count")
}