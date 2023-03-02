package practice.coffeemachine

class `main,` {
    class CoffeeMachine(
        var water: Int = 400,
        var milk: Int = 540,
        var beans: Int = 120,
        var cups: Int = 9,
        var money: Int = 550
    ) {
        fun remaining() {
            println("The coffee machine has:")
            println("$water of water")
            println("$milk of milk")
            println("$beans of coffee beans")
            println("$cups of disposable cups")
            println("$money of money")
        }

        fun fill() {
            println("Write how many ml of water do you want to add:")
            water += readLine()!!.toInt()
            println("Write how many ml of milk do you want to add:")
            milk += readLine()!!.toInt()
            println("Write how many grams of coffee beans do you want to add:")
            beans += readLine()!!.toInt()
            println("Write how many disposable cups of coffee do you want to add:")
            cups += readLine()!!.toInt()
        }

        fun take() {
            println("I gave you $money")
            money = 0
        }

        fun buy() {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu")
            val choice = readLine()!!

            when (choice) {
                "1" -> makeCoffee(250, 0, 16, 4)
                "2" -> makeCoffee(350, 75, 20, 7)
                "3" -> makeCoffee(200, 100, 12, 6)
                "back" -> return
                else -> println("Invalid choice!")
            }
        }

        private fun makeCoffee(waterNeeded: Int, milkNeeded: Int, beansNeeded: Int, cost: Int) {
            if (water >= waterNeeded && milk >= milkNeeded && beans >= beansNeeded && cups >= 1) {
                println("I have enough resources, making you a coffee!")
                water -= waterNeeded
                milk -= milkNeeded
                beans -= beansNeeded
                cups--
                money += cost
            } else {
                if (water < waterNeeded) {
                    println("Sorry, not enough water!")
                } else if (milk < milkNeeded) {
                    println("Sorry, not enough milk!")
                } else if (beans < beansNeeded) {
                    println("Sorry, not enough coffee beans!")
                } else {
                    println("Sorry, not enough cups!")
                }
            }
        }
    }

    fun `main,`() {
        val machine = CoffeeMachine()

        while (true) {
            println("Write action (buy, fill, take, remaining, exit):")
            val action = readLine()!!

            when (action) {
                "buy" -> machine.buy()
                "fill" -> machine.fill()
                "take" -> machine.take()
                "remaining" -> machine.remaining()
                "exit" -> return
                else -> println("Invalid action!")
            }
        }
    }



}