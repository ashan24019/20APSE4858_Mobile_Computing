fun main() {
    val originalList = listOf("Kotlin", "Java", "Python", "C++")
    val reversedList = ArrayList<String>()

    for (i in originalList.size - 1 downTo 0) {
        reversedList.add(originalList[i])
    }

    println("Reversed list: $reversedList")
}