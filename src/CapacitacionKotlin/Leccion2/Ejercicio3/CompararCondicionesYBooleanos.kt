package CapacitacionKotlin.Leccion2.Ejercicio3

fun main() {
    val nFish = 50
    val nPlants = 23

    if (nFish > nPlants) {
        println("Good ratio!")
    }else{
        println("Unhealthy ratio!")
    }

    val fish = 50
    if (fish in 1..100){
        println(fish)
    }

    if (nFish == 0){
        println("Empty tank")
    }else if (nFish < 40){
        println("got fish!")
    }else{
        println("That´s a lot of fish!")
    }

    when (nFish) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That´s a lot of fish!")
    }


}