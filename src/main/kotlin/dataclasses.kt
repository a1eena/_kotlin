data class Actor(
    val name: String,
    val gender: String = "M"
)

data class Message(
    val dp:String,
    val name:String,
    val last_msg:String,
    val time:String,
    val status: String,
    val isNotification: Boolean
)

fun main() {
    val actor = Actor("tom")
    val actor2 = Actor("priyanka", "F")
    val msg = Message("alina", "a", "hi", "19:05","double tick", false)
    println(actor)
    println(actor2)
    println(msg)
}