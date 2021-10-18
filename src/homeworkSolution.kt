fun main() {

    val cars = Car("Maybach,", "Mercedes", 2021)
    cars.brake()
    cars.manufacturingYear
    cars.showCarInfo()
    println(cars.color)
    cars.accelerate()
    Car("BMW,", "BMW", 2021, "Phantom Black")
}

class Car(private var name: String, var brand: String, var manufacturingYear: Int) {


    var carOwner: String = ""

    init {
        carOwner = "Hind"


    }

    constructor(
        name: String,
        brand: String,
        manufacturingYear: Int,
        color: String
    )
            : this(name = name, brand = brand, manufacturingYear = manufacturingYear) {

    }

    var color = ""


    fun brake() {
println("Car has a brake")

    }

    fun showCarInfo() {
        println(
            "Hello $carOwner how are my name is $name  and I " +
                    "was msade in $manufacturingYear"
        )

    }

    fun accelerate() {
        val isEngineSatlling = false
        val isEngineLightOff = false

        if (isEngineSatlling or isEngineLightOff) {

            println("Your engine need to be checked ")
            if (isEngineSatlling && isEngineLightOff) {
                println(" Alert Alert FIX YOUR engine")
            }
        } else {
            println("Your engine works fine")
        }

    }
}







