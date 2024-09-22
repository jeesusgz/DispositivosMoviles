package CapacitacionKotlin.Leccion1

fun main() {
    //variable
    var x = 2
    //constante
    val fixed = 5
    val float = 5f
    x = x.times(4)

    val y = fixed.plus(10) + x
    //dolar sirve para accender al valor de la variable
    println("Hello World!, x=$x y=$y ")

    if (x > y){
        println("x es mayor que y")
    }else if (x == y){
        println("x es igual a y")
    }else{
        println("y es mayor a x")
    }

    println(sayHello2())
}

fun sayHello2() : String{
    return "Hello World"
}
