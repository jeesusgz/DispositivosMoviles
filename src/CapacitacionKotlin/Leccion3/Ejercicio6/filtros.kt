package CapacitacionKotlin.Leccion3.Ejercicio6

fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator","flowerpot")
//    println(decorations.filter { it[0] == 'p' })

    val eager = decorations.filter { it[0] == 'p' }
    println("eager : $eager")
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered : $filtered")
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazyMap : $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter { it[0] == 'p' }.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
}

