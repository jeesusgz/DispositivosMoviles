package CapacitacionKotlin.Leccion2.Ejercicio4

import jdk.internal.org.jline.utils.Colors.s

fun main() {

//    var rocks: Int = null; // error

    var marbles : Int? = null

    //forma de java
    var fishFoodTreats = 6
    if (fishFoodTreats != null){
        fishFoodTreats = fishFoodTreats.dec()
    }
    //forma de kotlin
    //fishFoodTreats = fishFoodTreats?.dec() //falla y no deberia
    fishFoodTreats = fishFoodTreats.dec() ?: 0

    //nullPointerExceptions

//    val len = s!!.length   // throws NullPointerException if s is null
}