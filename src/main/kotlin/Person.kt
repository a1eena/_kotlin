class Person(var name: String,
             var age: Int,
             var weight: Float,
             var height: Float,
             var gender: String = "female",
             var hairColor: String ="black"
) {

    fun show(){
        println("$name is $age years old")
        println(" gender: $gender")
        println(" weight: $weight")
        println(" height: $height")
        println(" hair colour: $hairColor")
    }
}

fun main() {
    val p1 = Person( "alina", 22 , 54f,5.2f, "female", "black")
    val p2 = Person( "tina", 20, 54f, 5.2f, "female", "brown")
    p1.show()
    p2.show()
}