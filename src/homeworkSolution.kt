fun main() {

    val car1 =Car("G Class",2021)
    val car2 =Car("miniCopper",2022,"red")

    car1.accelerate()
    car2.useBreak()
}

class Car(private val name:String ,private val manufacYear:Int) {

    constructor(cName:String, cManufacYear: Int ,color: String) : this(name = cName, manufacYear = cManufacYear) {
        var cColor = color
    }

    init {
        println("Welcome $name")
    }

    fun accelerate(){
        println("$name is speeding")
    }
    fun useBreak(){
        println("$name is breaking")
    }

}

