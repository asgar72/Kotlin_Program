package for_loop

fun main(){
    val number = 2
    for(i in 1..10)
    {
        //String Concatenation
//        println(number.toString()+" x "+ i +" = "+(number*i))

        //String Templates
        println("$number x $i = ${number*i}")
    }
}