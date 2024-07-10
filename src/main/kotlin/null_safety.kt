fun main() {
    var a: Int? = 0
    println(a)
    a = null
    println(a)

    var name: String? = null
    println(name)
    //name = readLine()
    name = null
    println(name)
    println(name?.length ?: "no length")
    println(name?.isBlank() ?: "no data")
    // ? nullability  operator
    // ?. null check operator OR null safety op
    // ?: elvis
    //if (name?.length!! >= 10){
    //println("yes! name is greater than 10 characters")
    //} else {
    // println("name is smaller than 10 characters")
    //}

    // TODO: will update code here

}