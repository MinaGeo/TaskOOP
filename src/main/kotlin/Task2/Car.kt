package Task2



abstract class Car ( var model: String,
                     var color: String,
                     var speed: Double) : wheels {


    open fun getFuelType() : String
    {
        return "Fuel type"
    }
}
class BMW(var BMWModel: String, var BMWColor: String, BMWspeed:Double) : Car(BMWModel,BMWColor, BMWspeed )
{
    override fun getFuelType() : String
    {
        return "Petrol"
    }
}
class Tesla(var TeslaModel: String, var TeslaColor: String, Teslaspeed:Double) : Car(TeslaModel,TeslaColor, Teslaspeed )
{
    override fun getFuelType() : String
    {
        return "Tesla car is Electric, doesn't use fuel"
    }
}
interface wheels
{
fun getWheels(): Int
{
    return 4
}
}
fun main()
{

    val teslaA = Tesla("AirOne","Blue",100.5)
    val bmwA = BMW("X6","Red",120.5)

    println("Tesla fuel type: ${teslaA.getFuelType()}, BMW fuel type: ${bmwA.getFuelType()}")
    println("Number of wheels in a tesla car: ${teslaA.getWheels()}")
}
