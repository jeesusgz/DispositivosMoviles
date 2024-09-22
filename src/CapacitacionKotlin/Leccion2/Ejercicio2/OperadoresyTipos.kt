package CapacitacionKotlin.Leccion2.Ejercicio2

fun main() {
    //Paso 2 practica el uso de tipos
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)

    val b2 : Byte = 1
    println(b2)

    //falla porque b2 es un byte y no puede ser un entero
//    val i1: Int = b2
//    val i2 : String = b2
//    val i3 : Double = b2

    //convierte el b2 en los valores asignados y no falla
    val i1: Int = b2.toInt()
    val i2 : String = b2.toString()
    val i3 : Double = b2.toDouble()

    /*
    para que las constantes numéricas largas sea más legibles, kotlin te permite colocar guiones bajos en los
    números
     */
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    //Paso 3 concozca el valor de los tipos de variables

    //variable
    var fish = 1
    fish = 2
    //constante
    val acuarium = 1
//    acuarium = 2 //falla

    //asignar directamente el valor
    var pez : Int = 12
    var lakes: Double = 2.5

    //Paso 4 aprende sobre las cadenas
    val numberOfFish = 5
    val numberOfPlants = 12

    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} fish and plants")

}