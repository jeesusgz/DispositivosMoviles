package CapacitacionKotlin.Leccion4.Ejercicio3

class Aquiarium(length: Int = 100, width: Int = 20, height: Int = 40) {
    var width : Int = length
    var height : Int = width
    var lenght: Int = height

    var volume: Int
        get() = width * height * lenght / 1000
        set(value) {
            height = (value * 1000) / (width * height)
        }

    constructor(numberOfFish : Int) : this() {
        val tank = numberOfFish * 2000 * 1.1

        height = (tank / lenght * width).toInt()
    }

    fun printSize(){
        println("Width: $width cm "+
        "Lenght: $lenght cm " +
        "Height: $height cm ")

        println("Volume: $volume 1")
    }

    //se ejecuta cada vez que se inicia el constructor
    init {
        println("aquiarium initializing")
    }
    init{
        println("Volume: ${width * length * height / 1000} 1")
    }


}

