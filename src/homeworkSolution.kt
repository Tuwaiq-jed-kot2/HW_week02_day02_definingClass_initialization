fun main() {
    val car1 = Car("exent", 2015)
    car1.printInfo()
    car1.useBreake(false)
    car1.accelerate(100 , 100,30)
    val car2 = Car("camre", 2021, "BLACK")
    car2.printInfo()



}

class Car(val name: String, val manufacturingYear: Int) {

    lateinit var Ccolor: String

    constructor(Cname: String, CmanufacturingYear: Int, color: String) : this(
        name = Cname,
        manufacturingYear = CmanufacturingYear
    ) {
        Ccolor = color
    }

    init {
        println("Welcome $name")
    }

    fun accelerate(distance1:Int ,distance2:Int ,time:Int) {

        println((distance1 -distance2)/time)
    }

    fun useBreake(breakk:Boolean){

        if (breakk){
            println("move")
        }else{
            println("stop")
        }
    }


    fun printInfo(){
        if (!::Ccolor.isInitialized){
            println("car name:$name+ car year :$manufacturingYear")
        }else{
            println("car name:$name+ car year :$manufacturingYear + the color is:$Ccolor")
        }}}
