package CapacitacionKotlin.Leccion2.Ejercicio5

import java.util.*

fun main() {
    //Paso 1 Listas
    //Lista No modificable
    val school = listOf("mackerel", "trout", "halibut")
    println(school)

    //Modificable
    val myList = mutableListOf("tuna", "salmon", "shark")
    println(myList.remove("shark"))

    //Paso 2 matrices
    val colegio = arrayOf("shark", "salmon", "minnow")
    println(Arrays.toString(colegio))

    //se puede mezclar varios tipos de datos
    val mix = arrayOf("fish", 2)

    //se puede crear un array solo de números
    val numbers = intArrayOf(1,2,3)

    //combina dos arrays con el operador +
    val numbers2 = intArrayOf(4,5,6)
    val foo2 = numbers2 + numbers
    println(foo2[5])

    //anidar listas
    val oceans = listOf("Atlantic", "Pacific")
    val oddlist = listOf(numbers, oceans, "salmon")
    println(oddlist)

    val array = Array(5) {it * 2}
    println(Arrays.toString(array))

    //paso 3 bucles
    for (element in colegio){
        print(element + " ")
        println()
    }

    //puedes recorrer los elementos y los indices al mismo tiempo
    for ((index, element) in colegio.withIndex()){
        println("Item at $index is $element")
    }

    //prueba distintos tamaños y rangos

    for (i in 1..5){
        print(i)
    }

    for (i in 5 downTo 1){
        print(i)
    }

    for (i in 3..6 step 2){
        print(i)
    }

    for (i in 'd'..'g'){
        print(i)
    }

    //bucles while, do while , operadores ++ y --repeat
    var bubbles = 0
    while (bubbles < 50){
        bubbles++
    }
    println("$bubbles bubbles in the water")

    do {
        bubbles--
    }while (bubbles > 50)
    println("$bubbles bubbles in the water")

    repeat(2){
        println("A fish is swimming")
    }
}