
fun main() {

    println("Enter 1 if you're a seller, 2 if you're a customer")

    when (Integer.valueOf(readLine())) {

        1 -> {

            println("Enter the name of the car you want to add")
            var sName = readLine()
            println("Enter the manufacturing year of that car")
            var sYear = readLine()?.toInt()
            val seller = Car(sName!!, sYear!!)
            seller.addCar(sName, sYear)


            println("Do you wish to add more cars?")
            var choice = readLine()

            while (choice.equals("yes")) {
                println("Enter the name of the car you wish to add")
                sName = readLine()
                println("Enter the manufacturing year of that car")
                sYear = readLine()?.toInt()
                seller.addCar(sName!!, sYear!!)
                println("The cars you have: " + seller.cars)
                println("Do you wish to add more cars?")
                choice = readLine()
            }
            println("The cars you have are: " + seller.cars)

        }

        2 -> {
            println("Enter the name of the car you want to ask about")
            var cName = readLine()
            println("Enter the year of that car")
            var cYear = readLine()?.toInt()
            println("Enter the color of that car")
            val cColor = readLine()
            val customer = Car(cName!!, cYear!!, cColor!!)
            customer.askCar(cName, cYear)

            println("Do you wish to ask about more cars?")
            var choice = readLine()

            while (choice.equals("yes")) {
                println("Enter the name of the car you want to ask about")
                cName = readLine()
                println("Enter the year of the car you want to ask about")
                cYear = readLine()?.toInt()
                customer.askCar(cName!!, cYear!!)
                println("Do you wish to ask about more cars?")
                choice = readLine()
            }

            println("Do you want to buy a car?")
            val answer = readLine()
            if (answer.equals("yes")) {
               println("Enter the name and the year of the car you want to buy")
                customer.buyCar(readLine().toString(), readLine()!!.toInt())
            } else {
                println()
            }
        }
        else -> println("1, 2 only")
    }
}

class Car(var name: String, var manuYear: Int) {

    var cars = mutableMapOf("Hyundai" to 2020, "Mazda" to 2021, "BMW" to 2022)

    lateinit var Ccolor: String

    constructor(Cname: String, CmanuYear: Int, color: String): this(name = Cname, manuYear = CmanuYear) {
           Ccolor = color
    }

    init {
        println("Welcome to the car manufacture company")
    }

    fun addCar(name: String, manuYear: Int) {
        if (!cars.contains(name)) {
            cars.put(name, manuYear)
            println("You added ($name:$manuYear)")
        } else {
            println("This car is already added")
        }
    }

    fun askCar(name: String, manuYear: Int) {
        if (cars.contains(name) && cars.containsValue(manuYear)) {
            println("We have this car")
        } else {
            println("We don't have this car")
        }
    }

    fun buyCar(name: String, manuYear: Int) {
        if (cars.contains(name) && cars.containsValue(manuYear)) {
            println("You bought $name")
            accelerate()
            useBreak()
        } else {
            println("We don't have this car, but we have: $cars")
        }
    }

    fun accelerate() {
        println("You accelerated!")
    }

    fun useBreak() {
        println("You used breaks!")
    }
}