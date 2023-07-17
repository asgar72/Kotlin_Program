package for_loop

fun main() {
    val myArray = arrayOf(4,10,5,9,665,1,65,66)
    var max = myArray[0]
    for (item in myArray) {
        if (item > max) {
            max = item
        }
    }
    println(max)
}