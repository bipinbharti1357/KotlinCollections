package com.example.easyblekotlin


fun main(){
    println("Collection Demo 11 se 20")
    //collection_11()
    //collection_12()
    //collection_13()
    collection_14()
}

// 13. Find index of element 30 in [10, 20, 30, 40]
fun collection_11(){
    val itemList = listOf(10, 20, 30, 40)
    println("FindIndexOf_30:${itemList.indexOf(30)}")
    println("FindIndexOf_300:${itemList.indexOf(300)}")
}

// 14. Find last index of 2 in [1, 2, 3, 2, 1]
fun collection_12(){
    val itemList = listOf(1,2,3,2,1)
    val result = itemList.lastIndexOf(2)
    println("FindLastIndexOf_2:${result}")
}

// 15. Get sublist from index 1 to 4 of [0, 1, 2, 3, 4, 5]
// Input: [0, 1, 2, 3, 4, 5], subList(1, 4)
// Expected: [1, 2, 3]
fun collection_13(){
    val itemList = listOf(0, 1, 2, 3, 4, 5)
    val result = itemList.subList(1,4)
    println("Get sublist from index 1 to 4 :${result}")
}

// 16. Check if list [] is empty
// Input: []
// Expected: true
fun collection_14(){
    val itemList: List<Int> = listOf()
    println("Check if list [] is empty:${itemList.isEmpty()}")
    val itemList1: List<Int> = listOf(1,2)
    println("Check if list [] is notEmpty:${itemList1.isNotEmpty()}")
}