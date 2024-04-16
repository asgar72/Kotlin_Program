package functions

//Default Arguments in functions
fun main(){
    printMessage(3)//arguments
    printMessage()
}

fun printMessage(count:Int=2){ // count parameter
    for (i in 1..count)(
        println("Hello $i")
    )
}