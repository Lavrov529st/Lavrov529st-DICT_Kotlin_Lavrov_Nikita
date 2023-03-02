package practice.coffeemachine

class `main,` {
    fun `main,`() {
        println("Starting to make a coffee in NIX office")
        grindCoffeeBeans()
        boilWater()
        mixWaterWithCoffee()
        pourCoffee()
        pourMilk()
        println("Coffee is ready! Go to work!")
    }

    fun grindCoffeeBeans() {
        println("Grinding coffee beans")
    }

    fun boilWater() {
        println("Boiling water")
    }

    fun mixWaterWithCoffee() {
        println("Mixing boiled water with crushed coffee beans")
    }

    fun pourCoffee() {
        println("Pouring coffee into the cup")
    }

    fun pourMilk() {
        println("Pouring some milk into the cup")
    }
}