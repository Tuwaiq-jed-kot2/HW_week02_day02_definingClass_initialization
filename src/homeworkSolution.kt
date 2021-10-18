fun main(){
    val person= car("M","red",1976)
    person.printInfo()
    person.accelerate("speed")

}
class car(val name:String,val color:String,val manufacturingYear:Int ) {


    init {
        println("wellcom")
    }
    val speed = mutableListOf<String>()

    fun printInfo() {
        println("hello your car name $name and the color $color amd the manufacturingYear $manufacturingYear ")

    }

    fun accelerate(car: String) {
        if (speed.contains(name)) {
            println("need to slow")
        } else (speed.add(name))
        println("your speed fine")
    }
}
