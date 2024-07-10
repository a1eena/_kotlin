open class Human(
    open val name: String,
    open val age: Int,
    open val gender: String = "M"
){
    open fun detail() {
        println("i am $name")
        println("i am $age yrs old")
        when (gender){
            "M" ->println("i am male")
            "F" ->println("i am female")
        }

    }

}
class Student(
    override val name: String,
    override val age: Int,
    override val gender: String,
    val school: String,
    val klass: String
  ) : Human(name, age, gender) {
    override fun detail(){
        super.detail()
        println("i study in $school")
        println("i am in class $klass")

    }
}

fun main(){
    val h1 = Human("alina", 20, "F")
    val s1 = Student("rani", 18, "F", "KV", "12th")

    h1.detail()
    println("---")
    s1.detail()

}