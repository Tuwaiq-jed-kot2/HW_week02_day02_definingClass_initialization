fun main() {
    val bmw = car("BMW", "black", 2021)
    val ford = car("Ford", "white", 1999)
    accelerate()
    Break()
}

class car(val Name: String, val manufacturingYear: Int) {


    constructor(Cname: String, Ccolor: String, CmanufacturingYear: Int) : this(Name = Cname,manufacturingYear = CmanufacturingYear
    ) {
    }

    init {
        println("welcome your car is $Name")
    }
}


fun accelerate() {
    println("type your speed by kilo")
    val S = readLine()?.toInt()
    println("type the time by minutes")
    val A = readLine()?.toInt()
    val m = S!! / A!!
    println("the car acceleration is $m sec per hour")

}


fun Break() {
    println("the breaks doesn't work ")
}