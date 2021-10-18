fun main() {

    val car1 = Car("Corela", 2020)
    val car2 = Car("Camery", 2021, "white")

    car1.accelerate()
    car1.breake()

    car2.accelerate()
    car2.breake()
}
class Car(private val carName: String, private val manufacturingYear: Int){

    private var color: String

    constructor(
        carName: String,
        manufacturingYear: Int,
        color: String): this(
        carName = carName,
        manufacturingYear = manufacturingYear){
        this.color = color
    }

    init {
        color = ""
        println("Welcome, Car Created Successfully")
    }

    fun accelerate(){
        println("Car Accelerated")
    }

    fun breake(){
        println("Car Breaked")
    }
}