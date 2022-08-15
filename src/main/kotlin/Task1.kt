import java.util.*

class Car (var model: String?= null, var color: String? = null ,var speed: Int=10)
{

    val maxSpeed: Int = 100


    fun print()
    {
        println("model: $model, color: $color, speed: $speed")
    }
}

fun main()
{
    var tst = Car()
    val scn = Scanner(System.`in`)
    print("Enter the model of the car: ")
    val model: String  = scn.nextLine()
    print("Enter the color of the car: ")
    val color: String = scn.nextLine()

    print("Enter the speed of the car: ")
    val speed: Int = scn.nextInt()
    if(speed>0 && speed <tst.maxSpeed)
    {
        var c1 = Car(model, color, speed)
        c1.print()
    }
    else{
        println("Speed not suitable")
    }
}