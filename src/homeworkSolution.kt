import kotlin.contracts.Returns

class Car(val name: String, val manuFactoringYear: Int) {

    lateinit var carColor: String
    var isThereRock: Boolean = false
    val carSpeed: String = " "

    constructor(name2: String, manuFactoringYear2: Int, color: String) : this(
        name = name2,
        manuFactoringYear = manuFactoringYear2
    ) {
        carColor = color
    }

    init {
        println("Hello $name with full option")
        var carMove: String
    }

    fun brake(): Boolean {
        if (isThereRock) {
            println("BRAKE")
            return true
        } else {
            println("keep moving..")
            return false
        }
    }

    fun accelerate() {
        if (brake()) {
            println("there is a rock so your accelerate will slow down")
        } else {
            println("there is no rock on the road so your accelerate will increase ")
        }
    }


    fun infCar() {
        if (carColor.isEmpty()) {
            println("the car name is $name from year[$manuFactoringYear]")
        } else {
            println("the car name is $name from year[$manuFactoringYear] with color: $carColor")
        }
    }
}


fun main() {
    val car1 = Car("BMW", 2019)
    val car2 = Car("Honda", 2020, "blue")

    car2.infCar()
    car1.accelerate()


}