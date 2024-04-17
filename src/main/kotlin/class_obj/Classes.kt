package class_obj

fun main(){
    val mustang = Car("mustang","petrol",100)
    val beetle = Car("beetle","diesel",200)

    println(mustang.name)
    println(mustang.type)
    
    println(beetle.name)
    println(beetle.kmRan)
}
class Car(val name:String,val type:String,var kmRan:Int)//property
{
    fun driveCar(){
        println("Car is Driving")
    }

    fun applyBrakes(){
        println("Applied Brakes")
    }
}