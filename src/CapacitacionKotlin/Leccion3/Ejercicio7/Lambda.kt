package CapacitacionKotlin.Leccion3.Ejercicio7

fun main() {
    var dirtyLevel = 19
    val waterfilter = {dirty : Int -> dirty / 2}
    println(waterfilter(dirtyLevel))

    val waterFilter2: (Int) -> Int = {dirty -> dirty / 2}
    println(updateDirty(30, waterFilter2))
    println(updateDirty(15, ::increaseDirty))

    dirtyLevel = updateDirty(dirtyLevel){dirtyLevel -> dirtyLevel + 23}
    println(dirtyLevel)
}

//crea una funcion de tipo superior

fun updateDirty(dirty : Int, operation : (Int) -> Int) : Int {
    return operation(dirty)
}

fun increaseDirty(start : Int) = start + 1



