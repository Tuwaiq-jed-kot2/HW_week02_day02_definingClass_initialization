fun main() {

    val car1 = Car("camry", 2017)

    car1.accelerate()
    car1.useBreak()

    val car2 = Car("lexus", 2021, "white")

    car2.accelerate()
    car2.useBreak()

}

class Car(val carName: String, val carManufacturingYear: Int) {

    var carColor: String = ""

    constructor(cName: String, cManufacturingYear: Int, color: String) :
            this(carName = cName, carManufacturingYear = cManufacturingYear) {
        carColor = color
    }

    init {
        println("Welcome to $carName")
    }

    fun accelerate() {
        println("car accelration")
    }

    fun useBreak() {
        println("$carName break is working")
    }

}