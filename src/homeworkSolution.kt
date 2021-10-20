fun main() {
    val firstCar = Car("BMW", "red", 2021)
    val secondCar = Car("Xcent", "White")

    firstCar.carInfo()
    secondCar.carInfo()
    firstCar.accelerate()
    secondCar.useBreake()
}

class Car(var name: String?, var color: String?) {
    var manufacturingYears:Int

    constructor(sName: String?, sColor: String?, manufacturingYear: Int) : this(name = sName, color = sColor) {
        manufacturingYears = manufacturingYear
    }

    init {
        manufacturingYears = 0
        println("welcome $name")
    }

    fun carInfo() {
        try {
            if (manufacturingYears == 0)
            {
                println("The car name is: ${this.name}  a model is: ${this.color}")
            } else {
                println("The car name is: ${this.name} the module is: ${this.color} and  a model is: ${this.manufacturingYears}year")

            }
        }catch (e : NumberFormatException) {
            println("e:NumberFormatException")}
    }

    fun accelerate() {
        println("The car accelerate")
    }

    fun useBreake() {
        println("The car stop")
    }
}




