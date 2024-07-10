class Circle(
     val radius: Int
) {
    init {
        println("circle object created!!")
    }
    fun circumference() = 2 * Math.PI * radius
    fun area() = Math.PI * radius * radius

}

fun main() {
    println("enter the radius of circle =")
    val r = readln().toInt()
    val c1 = Circle(r)
    println("Circle with radius ${c1.radius}")
    println("Area will be ${c1.area()}")
    println("circumference will be ${c1.circumference()}")
}