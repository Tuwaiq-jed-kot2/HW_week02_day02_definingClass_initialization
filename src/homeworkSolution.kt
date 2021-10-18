

fun main() {
    val ca1 = Car()
    println("write name of car")
    ca1.nameC = (readLine())
    println("enter the color ")
    ca1.color =(readLine())
    println("add your name : ")
    var name:(String?)= readLine()
    println("Welcome $name ")
    ca1.manuFacturingYear=2012
    println("Car fractured in 2017")
    ca1.carSpeed = 0
    println("your car speed ${ca1.carSpeed}")
    ca1.accelerateandOfCar()
    ca1.accelerateandOfCar()
    ca1.useBrake()



}


class Car {

    var nameC: (String?) = ""
    var color: (String?) = ""
    var manuFacturingYear: (Int) = 0
    var carSpeed: (Int) = 0

    fun accelerateandOfCar (){
        if (carSpeed!==0){
            println("\" your Car  in Accelerate mood \"")
        }
    }



    fun useBrake (){if (carSpeed==0)
        println("the car in brake mood")
    }
}

