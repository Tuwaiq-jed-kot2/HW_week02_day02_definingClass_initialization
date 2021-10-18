fun main() {
    val car = car("camaro", 2016, "blue")
    car.Accelerate()
    car.Break()                                 /***** main class  *****/
}
    /*------------------------------------------------------------------------------*/

class car(val CarName: String, val ManufacYear: Int) {

    constructor(consCarName: String, consCarManufacYear: Int, cosCarColor: String) : this(
        CarName = consCarName,
        ManufacYear = consCarManufacYear        /***** car class  *****/
    ) {

    }
    /*------------------------------------------------------------------------------*/
    init {                                      /***** Initialization  *****/
        println("WELCOME $CarName owner nice car you have!")
    }
    /*------------------------------------------------------------------------------*/
    fun Accelerate() {                          /***** accelerate Functions *****/
        println("your $CarName going fast")
    }
    /*------------------------------------------------------------------------------*/
    fun Break() {                               /***** Break Functions *****/
        println("your $CarName slow down")
    }
}
