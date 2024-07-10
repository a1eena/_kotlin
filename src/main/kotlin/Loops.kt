fun main() {

    val movies = listOf("Titanic, harry potter, avengers:endgame")
    for (name in movies){
        println("i🤍$name")
    }

    for(idx in movies.indices){
        println("$idx ${movies[idx]}")
    }

    for(i in 1..10){
        println("$i 🦋")
    }

    //ranges
    for( x in 9 downTo 0 step 3) {
        println(x)
    }

    //sum of all digits
    val number = 129032
    var temp = number
    var total = 0
    while(temp > 0){
        println("$temp, => $total")
        total += temp%10
        temp /= 10
    }


    println("Total of $number is $total")

    // about me
    var aboutme = ""
    do {
        print(">>>")
        val line = readln()
        aboutme += line + "\n"
    } while (line.isNotBlank())
    println("About me\n$aboutme")
}