

fun main() {

    val ferrari = Car("ferrari" , 2021 , "black" )

    val hyundai = Car("hyundai" , 2021  )
}

class Car(val name : String, val manufacturing: Int) {

    lateinit var cColor: String

    constructor (nName: String, mManufacturing: Int, color: String) : this(
        name = nName,
        manufacturing = mManufacturing
    ) {
        cColor = color
    }

    init {
        println("welcome $name")
    }


    fun accelerate() {
        println("you used accelerate ")

    }

    fun usebreake() {
        println("you used breaks")
    }
}



