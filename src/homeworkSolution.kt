import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerValueConstant

class Car (val name:String?, manufacturingYear:Int? ){
    init {
        println("welcome $name owner ")
    }

    constructor (tName: String?,tManufacturingYear: Int?,color:String?) : this(name = tName  , manufacturingYear = tManufacturingYear){

    }

    fun accelerate (){
        println("the car is accelerating")
    }

    fun useBrake (){
        println("the car is decelerating")
    }

}




fun main() {
    println("please type in your car name")
    val name = readLine()

    println("please type in your car color")
    val color = readLine()

    try {
        println("please type in your car manufacturing year")
        val manufacturingYear = readLine()?.toInt()

        val car = Car (name,manufacturingYear , color)

        car.accelerate()

        car.useBrake()

    }catch (e : NumberFormatException){

        println("you entered invalid manufacturing year")

    }

}