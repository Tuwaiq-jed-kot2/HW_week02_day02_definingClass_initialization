fun main() {
    val carOne=Car("MG",2020)
    val carTew=Car("FEW",2021,"Red")
    carOne.accelerate()
    carTew.useBreake()


}
class Car(val name:String,val manufacuringYear:Int) {
    var color: String = ""
    constructor(nameC: String, manufacuringYearC: Int, colorC: String) : this(
        name=nameC,
        manufacuringYear=manufacuringYearC) {
        color=colorC
    }
    init {
        println("WELCOMING THE CAR : $name ")
    }
    fun accelerate(){
        println("The car accelerate")
    }
    fun useBreake(){
        println("The car use break")
    }
}