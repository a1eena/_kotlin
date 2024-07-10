fun main(){
    print("enter a number:")
    var num = readln().toInt()
    if(num % 2 ==0){
        println("Even")
    }
    else{
        println("Odd")
    }
    print("enter another number:")
    num = readln().toInt()
    if(num>0) {
        println("positive")
    } else if (num <0) {
        println("negative")
    } else {
        println("zero")
    }
   //when
    println("who is the father of botany?")
    println("A: Theophrasrus")
    println("B: Aristotle")
    println("C: Darwin")
    println("D: Linnaeus")
    println("select an option")
    val ans = readln()
    when (ans) {
        "A" -> println(" Correct")
        "B" -> println(" Wrong")
        "C" -> println(" Wrong")
        "D" -> println(" Wrong")
        else ->println("Invalid option")
    }

    print("Question: what is your age?")
    val age = readln().toInt()
    when {
        age < 0 -> println("Invalid age")
        age < 18 -> println("You are a minor")
        age in 18 .. 60 -> println("You are an adult")
        else -> println("you are a senior citizen")

    }

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    if((a > b ) and ( a > c)) {
        println("A is greater")
    } else  if (( b > a) && (b > c)) {
        println("B is greater")
    } else {
        println("C is greater")
    }
}
