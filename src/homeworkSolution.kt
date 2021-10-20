


fun main() {

    val Car1 = Car("Audi", "white", 2022)
    Car1.Properties()
    Car1.accelerate()
}
class  Car(var nameOfCar: String?, var colorOfCar: String?)
{ constructor(cName: String?, cColor: String?, manufacturingYear: Int?)
        :this(name = cName, color = cColor)

    init {

        println("hello $nameOfCar")

    }

    fun Properties() {
        println("car of name : ${this.nameOfCar} colors  is: ${this.colorOfCar} ")

    }

    fun accelerate() {
        TODO("Not yet implemented")
    }


}
fun accelerate() {

    println("The car accelerate")

}


fun useBreake() {
    println("The car in break mood")
}




