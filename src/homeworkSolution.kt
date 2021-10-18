fun main(){
    val person= car("M","red",1976)
    person.printInfo()

    val driverSpeed =88
    if(driverSpeed<=75)

        if (driverSpeed in 75..100){
            println("the car speed is accelerate")
        }else if (driverSpeed in 58..74){
            println("the car speed is fine")
        }else println("the car is going to break")



}
class car(val name:String,val color:String,val manufacturingYear:Int ){

    init { println("welcome")

    }
    fun printInfo(){
        ("hello your car name $name and the color $color amd the manufacturingYear $manufacturingYear ")

    }


}
