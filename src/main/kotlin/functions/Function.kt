package functions

fun main() {
    //jo values ham yaha pass krte hai oo arguments hai
    val result = Add(4, 5)
    println(result)
    val result2 = Add(5, 6)
    println(result2)
    evenOrOdd(12)
    evenOrOdd(13)

}
//Inline function
//function ke andar to variable define hai they called parameter
//this ::   num1: Int, num2: Int
fun Add(num1: Int, num2: Int) = num1+num2

//fun Add(num1: Int, num2: Int): Int {
//    val sum = num1 + num2
//    return sum
//}

fun evenOrOdd(num1: Int) {
    val result = if (num1 % 2 == 0) "Even" else "odd"
    println(result)
}