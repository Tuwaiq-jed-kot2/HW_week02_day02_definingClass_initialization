class Car (private var name:String, private var manufacturingYear:Int){

    var color: String



    constructor(carName: String, carManufacturingYear: Int, carColor: String):this(name = carName, manufacturingYear = carManufacturingYear){

        color = carColor

    }


    init {

        color = ""

        println("Hello, Are you looking for $name?")
    }


    fun accelerate(carWeight:Int,horsePower:Int){

        if (horsePower == 0){
            println("This value can't be zero")
        }else{
            println("The acceleration in a $name at 100 Km is ${"%.1f".format(carWeight/(horsePower*0.9))} seconds")
        }

    }


    fun useBreak(breake:Boolean){

        if (breake){
            println("You use the break")
        } else{
            println("you don't use the break")
        }

    }



}




fun main() {



        val x = Car("Mazda 6", 2020)

        x.accelerate(2103,188)

        x.useBreak(false)

}