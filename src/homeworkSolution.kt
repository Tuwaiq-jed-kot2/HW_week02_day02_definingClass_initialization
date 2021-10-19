fun main() {

    val car1 = Car("Honda",2020)
    val carAcc =car1.accelerate(10,60,2)
    println("The car accelerate $carAcc per second")

    car1.brake(0)

}

class Car(val name:String, val manufacturingYear:Int){

    lateinit var carColor:String

    init {
        println("Welcome، The car name is $name, Manufacturing Year is $manufacturingYear.")
    }

    constructor(cName:String , cManufacturingYear:Int , color:String) :
            this(name = cName,manufacturingYear = cManufacturingYear) {
        carColor = color
    }

    fun accelerate(v1:Int, v2:Int, t:Int): Int {
        //The difference between the two speeds divided by the time in seconds
        return (v2-v1)/t
    }

    fun brake(speed:Int){
        if (speed == 0){
            println("The car is not moving")
        } else {
            println("The car is moving")
        }
    }

}