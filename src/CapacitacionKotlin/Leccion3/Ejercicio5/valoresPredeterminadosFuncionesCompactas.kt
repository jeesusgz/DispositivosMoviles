package CapacitacionKotlin.Leccion3.Ejercicio5

import CapacitacionKotlin.Leccion3.Ejercicio4.fishFood
import CapacitacionKotlin.Leccion3.Ejercicio4.randomDay

fun main() {
    swim() // default speed
    swim("Slow") //positional argument
    swim(speed= "turtle-like") //named parameter
    feedTheFish()
}

fun swim(speed : String = "fast"){
    println("swimming $speed")
}

fun shouldChangeWater(day: String, temperature : Int = 22, dirty : Int = 20): Boolean {
//    return when{
//        temperature > 30 -> true
//        dirty > 30 -> true
//        day == "Sunday" -> true
//        else -> false
//    }

    //un parametro predeterminado no tiene por que ser un valor, puede ser otra función
    //fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = getDirtySensorReading()): Boolean {

    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

//funciones compactas
fun isTooHot(temperature : Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"