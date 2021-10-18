fun main() {
    val str=Car("Toyota",2020,"black")
    str.printCarINFO()
    str.abilityToUseBreak()
    str.abilityToAccelerate()
    // this one for sale the car
    str.saleCar(false)
}
class Car (val name:String,val manufacturingYear:Int){

    lateinit var color:String


    constructor(name:String, manufacturingYear:Int,carColor:String):this(name = name,manufacturingYear = manufacturingYear) {
        color=carColor
    }

    fun printCarINFO(){
        println("car name: $name \nmanufacturing year: $manufacturingYear\ncar color:$color ")
    }

    fun abilityToAccelerate(){
        println("the car is Accelerate right now")
    }
    fun abilityToUseBreak(){
        println("the car is breaking right now")

    }
    fun saleCar(speedticket:Boolean){
        if (speedticket){
            println("you can't sel the car ")
        }else{
            println("you can sel the car")
        }

    }
}