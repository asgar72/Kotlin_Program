package list_arrays
fun main(){
    //Immutable list - you can not add items after the initialization
    val shoppingList1 = listOf("Processor","RAM","Graphics Card","SSD")

    //Mutable list - you can add items later and modify
    val shoppingList = mutableListOf("Processor","RAM","Graphics Card RTX 3060","SSD")

    //adding item to the list
    shoppingList.add("Cooling System")

    //remove item to the list
    shoppingList.remove("Graphics Card RTX 3060")

    //again add an item to the list
    shoppingList.add("Graphics Card RTX 4090")

    //remove some item from the list
    shoppingList.removeAt(1)

    // add list item on index of the list item
    shoppingList.add(2,"RAM")

    //replace some list items
    shoppingList[3] = "Graphics card RX 7800XT"
    //or this is second way to replace any item
    shoppingList.set(1,"Water Cooling")

    if (shoppingList.contains("RAM")){
        println("Has RAM in the list")
    }else{
        println("No RAM in the list")
    }
    println(shoppingList)
}