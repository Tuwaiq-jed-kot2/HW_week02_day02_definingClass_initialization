fun main() {
    val firstCar = Car("BMW", "red", 2021)
    val secondCar = Car("Xcent", "White")

    firstCar.carModule()
    secondCar.carModule()
    firstCar.accelerate()
    secondCar.useBreake()
}

class Car(var name: String?, var color: String?) {
    //var manufacturingYear:Int? = null

    constructor(sName: String?, sColor: String?, manufacturingYear: Int?) : this(name = sName, color = sColor) {
        //manufacturingYear = 111
    }

    init {
        println("welcome $name")
    }

//    fun carInfo() {
//        if (!::manufacturingYear.isInitialized)
//        {
//            println("The car name is: ${this.name} the module is: ${this.color}")
//        } else {
//            println("The car name is: ${this.name} the module is: ${this.color} and the module is:${this.manufacturingYear}year")
//
//        }
//    }

    fun carModule() {
        try {
            println("The car name is: ${this.name} the module is: ${this.color} ")
        } catch (e : NumberFormatException) {
            println("e:NumberFormatException")
        }
    }

    fun accelerate() {
        println("The car accelerate")
    }

    fun useBreake() {
        println("The car stop")
    }
}




