class Car(var name : String  , var  carYear : Int){

    var carColour : String =""

    constructor(carName: String, cManYear: Int, colour: String) : this(name = carName, carYear = cManYear) {
        carColour = colour
    }

    init {
        println("$name Registered")
    }

    fun accelerate(){
        println("$name Accelerate !!")
    }
    fun breake(){
        println("$name Breake !!")
    }

}


fun main() {
    val car1 = Car("Car1",2020)
    val car2 = Car("Car2",2018,"Red")
    car1.accelerate()
    car2.breake()
}