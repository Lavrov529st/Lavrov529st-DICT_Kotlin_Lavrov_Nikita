package practice.coffeemachine

class `main,` {
    fun `main,`() {
        // Кількість стаканчиків кави, яку користувач хоче приготувати
        println("Write how many cups of coffee you will need:")
        val cupsOfCoffee = readLine()!!.toInt()

        // Обчислення кількості інгредієнтів для приготування зазначеної кількості стаканчиків кави
        val water = cupsOfCoffee * 200
        val milk = cupsOfCoffee * 50
        val coffeeBeans = cupsOfCoffee * 15

        // Виведення результатів
        println("For $cupsOfCoffee cups of coffee you will need:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$coffeeBeans g of coffee beans")
    }
}