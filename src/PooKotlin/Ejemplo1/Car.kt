package PooKotlin.Ejemplo1

class Car(brand : String, var model : String, var year: Int?) {
//    val brand : String
//    var model : String = ""
//    var year : Int? = null
    var isClasic : Boolean = false

    init {
        year?.let {
            if (it < 2000){
                isClasic = true
            }
        }
    }

//   constructor(brand : String, model : String, year : Int?) : this(brand){
//       this.model = model
//       this.year = year
//   }
}