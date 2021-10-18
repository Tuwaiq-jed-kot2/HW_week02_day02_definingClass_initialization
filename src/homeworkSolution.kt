fun main() {
    // just to test our code
    val mercedes = Car("Mercedes",2021)
    mercedes.apply {
        this.useBreake()
        this.accelerate()
        this.useBreake()
    }

    val camary = Car("Mercedes",2021, "red")
    camary.apply {
        useBreake()
        accelerate()
        useBreake()
    }

}

class Car (val Name:String, val manufacturingYear:Int){
    var color:String = ""

    constructor(Cname:String,CmanufacturingYear: Int,Ccolor:String):this(Name = Cname,manufacturingYear = CmanufacturingYear){
        color = Ccolor
    }

    init {
        print("welcome $Name to my Car system ")
    }

    fun accelerate(){
        println("the car able to drive")
    }

    fun useBreake(){
        println("the car now stop")
    }

}
