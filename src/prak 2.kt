fun main() {
    // Практика No2

    // 1. На вході ціле число, повернути рядок “Even” для парного числа та “Odd” в
    // іншому випадку.
    fun evenOrOdd(num: Int): String {
        return if (num % 2 == 0) "Even" else "Odd"
    }

    println(evenOrOdd(4)) // Виведе "Even"
    println(evenOrOdd(5)) // Виведе "Odd"

    // 2. Помножити задане число на 4, якщо воно парне і на 5 інакше.
    fun multiplyBy(num: Int, multiplier1: Int, multiplier2: Int): Int {
        return if (num % 2 == 0) num * multiplier1 else num * multiplier2
    }

    println(multiplyBy(4, 4, 5)) // Виведе 16
    println(multiplyBy(5, 4, 5)) // Виведе 25

    // 3. Повернути негативне число.
    fun negate(num: Int): Int {
        return -num
    }

    println(negate(1)) // Виведе -1
    println(negate(-5)) // Виведе 5

    // 4. За роком визначити вік.
    fun calculateAge(year: Int): Int {
        val currentYear = 2023
        return currentYear - year
    }

    println(calculateAge(1990)) // Виведе 33

    // 5. Задано масив цілих чисел, котрому необхідно визначити найменше ціле
    // число.
    fun findMin(arr: Array<Int>): Int {
        return arr.minOrNull() ?: 0
    }

    println(findMin(arrayOf(34, 15, 88, 2))) // Виведе 2

    // 6. Задано масив цілих чисел, для якого потрібно знайти два найбільші числа.
    fun findTwoMax(arr: Array<Int>): List<Int> {
        val sortedArr = arr.sortedDescending()
        return sortedArr.take(2)
    }

    println(findTwoMax(arrayOf(1, 5, 87, 45, 8, 8))) // Виведе [87, 45]

}

