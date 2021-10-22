fun main(){
    var person= car("M",1988)
    var person1 =car("assd",1477,"red")

    person.printInfo()

    person.accelerate()
    person.breaking()

}
class car(private var name:String,private var manufacturingYear:Int ) {

    constructor( Aname: String, AmanufacturingYear: Int, color:String ):this
        (name=Aname,manufacturingYear=AmanufacturingYear ){var color= color}


    init {
        println("wellcom")
    }



    fun printInfo() {
        println("hello your car name $name  amd the manufacturingYear $manufacturingYear ")
    }



    fun accelerate() {

        println("need to accelerate")
    }
    fun breaking() {
        println("need to break")

    }

}

