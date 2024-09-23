package CapacitacionKotlin.Leccion4.Ejercicio3

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquiarium = Aquiarium()
    myAquiarium.printSize()
    myAquiarium.height = 60
    myAquiarium.printSize()

    val aquiarium1 = Aquiarium()
    aquiarium1.printSize()
    val aquiarium2 = Aquiarium(width = 25)
    aquiarium2.printSize()
    val aquiarium3 = Aquiarium(height = 35, length = 110)
    aquiarium3.printSize()
    val aquiarium4 = Aquiarium(width = 25, height = 35, length = 110)
    aquiarium4.printSize()

    val aquiarium5 = Aquiarium(numberOfFish = 29)
    aquiarium5.printSize()
    println("Volume: ${aquiarium5.width * aquiarium5.lenght * aquiarium5.height / 1000} 1")

    val aquiarium6 = Aquiarium(numberOfFish = 29)
    aquiarium6.printSize()
    aquiarium6.volume = 70
    aquiarium6.printSize()
}