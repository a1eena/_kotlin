//interfaces
interface Vehicle {
    fun start()
    fun stop()
}

class Car(): Vehicle{
    override fun start() {
        println("Car is starting")

    }

    override fun stop() {
        println("Car is stopping")

    }

}

class Truck(): Vehicle{
    override fun start() {
        println("Truck is starting")

    }

    override fun stop() {
        println("Truck is stopped")

    }
}

abstract class Smartphone{
    open fun takePicture(){
println("function to take picture")

    }
    fun takeCall(){
println("function to take call")
    }
}

class Iphone: Smartphone(){
    override fun takePicture(){
        println("function to take picture with iphone")
    }
}


fun main() {
    val i1 = Iphone()
    val c1 = Car()
    val t1 = Truck()
    c1.start()
    t1.start()
    c1.stop()
    t1.stop()
    i1.takePicture()
    i1.takeCall()



}
