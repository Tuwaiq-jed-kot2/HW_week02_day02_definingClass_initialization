
fun main() {
    val car = Car("cerato",2017,"white")
    car.accelerate()
    car.useBreake()

}
class Car(val name:String,val manufacturingYear:Int){
    init {
        println("$name welcome to our dealerShop")
    }

    constructor(Tname:String,TmanufacturingYear:Int,color:String): this(name= Tname,manufacturingYear = TmanufacturingYear){
    println("your car is $color")
    }
    fun accelerate()  {
        println("your car is speeding up")

    }

    fun useBreake(){
        println("your car is slowing down")

    }
}
