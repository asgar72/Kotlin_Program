package practice

fun main() {
    println("please enter a number")
    var num = readLine()?.toInt()
    if (num != null) {
       println("Lets count from $num down to 0:")
        var count = num
        while (count >= 0) {
            println(count)
            count--
        }
    }
}
