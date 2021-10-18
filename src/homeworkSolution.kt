class Car (var name:String,var manufacturingYear:Int){

    var color:String ="white"
    constructor(name:String, manufacturingYear:Int,color:String):this(name,manufacturingYear){
        this.color = color
    }
    init {
        println("welcome to $name car")
    }
    fun breake(){
        println(" $name Breake!!")
    }

}

fun main(){
    val mercedes = Car("mercedes",2020)
    println(mercedes.name)
    val lexus = Car("lexus",2020,"white")
    println(lexus.name)
    println(lexus.color)

    lexus.breake()
}