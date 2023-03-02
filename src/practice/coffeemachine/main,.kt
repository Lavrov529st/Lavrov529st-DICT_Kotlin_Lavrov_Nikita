package practice.coffeemachine

class `main,` {
    fun `main,`() {
        print("Write how many ml of water the coffee machine has: ")
        val water = readLine()!!.toInt()
        print("Write how many ml of milk the coffee machine has: ")
        val milk = readLine()!!.toInt()
        print("Write how many grams of coffee beans the coffee machine has: ")
        val coffeeBeans = readLine()!!.toInt()
        print("Write how many cups of coffee you will need: ")
        val cups = readLine()!!.toInt()

        val waterPerCup = 200 // мл
        val milkPerCup = 50 // мл
        val beansPerCup = 15 // грам

        val maxCupsByWater = water / waterPerCup
        val maxCupsByMilk = milk / milkPerCup
        val maxCupsByBeans = coffeeBeans / beansPerCup

        val maxCups = minOf(maxCupsByWater, maxCupsByMilk, maxCupsByBeans)

        when {
            maxCups == cups -> println("Yes, I can make that amount of coffee")
            maxCups > cups -> println("Yes, I can make that amount of coffee (and even ${maxCups - cups} more than that)")
            else -> println("No, I can make only $maxCups cups of coffee")
        }
    }

}