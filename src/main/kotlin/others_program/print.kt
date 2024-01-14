fun main() {
    println("Hello World!")
    var myAge: Byte = 22
    println(myAge)
    myAge = 23
    println(myAge)

    //Unicode
    val myChar = '\u00AE'
    println(myChar)

    //String
    var name = "aman,Abbas,Ali,Asif"
    println(name.uppercase())
    name = "Denis, Berlin, Jack, Bill, Obama, Pichai, Google, "
    println(name + "Abbas")

    var age = 0
    println("Please enter your age as whole number")
    //read what the user has entered into the console
    val enteredValue = readln()
    //convert the string variable into the int variable
    age = enteredValue.toInt()
    //if statement
    if (age in 18..39) {
        println("You can go to the club")
    } else if (age >= 40) {
        println("You are too old")
    } else {
        println("You are to young to go into the club!")
    }
}