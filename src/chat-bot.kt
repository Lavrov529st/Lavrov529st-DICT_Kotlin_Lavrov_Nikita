fun main() {
    // Вітаємо користувача та запитуємо його ім'я
    println("Hello! My name is DICT_Bot.")
    println("Please, remind me your name.")
    val name = readLine()!!
    println("What a great name you have, $name!\n")

    // Вгадуємо вік користувача
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    print("> ")
    val remainder3 = readLine()!!.toInt()
    print("> ")
    val remainder5 = readLine()!!.toInt()
    print("> ")
    val remainder7 = readLine()!!.toInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age!\n")

    // Рахуємо від 0 до числа, введеного користувачем
    println("Now I will prove to you that I can count to any number you want.")
    print("> ")
    val number = readLine()!!.toInt()
    for (i in 0..number) {
        println("$i!")
    }
    println()

    // Тестуємо знання користувача
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")
    var answer: Int? = null
    while (answer != 2) {
        print("> ")
        answer = readLine()?.toIntOrNull()
        if (answer != 2) {
            println("Please, try again.")
        }
    }
    println("Completed, have a nice day!")
    println("Congratulations, have a nice day!")
}
