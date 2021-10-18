fun main() {
    val C =Car ("BMW" ,2021)

}

class Car (var name:String , var manufacturingYear:Int){



    init {
        println("HI , Here Is Your $name")
    }


    constructor(Sname:String , SmanufacturingYear:Int , color:String) :
            this(name = Sname , manufacturingYear= SmanufacturingYear)


    fun accelerate(){
    }

    fun useBreak(){
    }


}


