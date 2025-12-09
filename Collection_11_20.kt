package com.example.easyblekotlin


fun main(){
    println("Collection Demo 11 se 20")
    //collection_11()
    //collection_12()
    //collection_13()
    //collection_14()
    //collection_15()
    //collection_16()
    //collection_17()
    //collection_18()
    //collection_19()
    collection_20()
}

// 13. Find index of element 30 in [10, 20, 30, 40]
private fun collection_11(){
    val itemList = listOf(10, 20, 30, 40)
    println("FindIndexOf_30:${itemList.indexOf(30)}")
    println("FindIndexOf_300:${itemList.indexOf(300)}")
}

// 14. Find last index of 2 in [1, 2, 3, 2, 1]
private fun collection_12(){
    val itemList = listOf(1,2,3,2,1)
    val result = itemList.lastIndexOf(2)
    println("FindLastIndexOf_2:${result}")
}

// 15. Get sublist from index 1 to 4 of [0, 1, 2, 3, 4, 5]
// Input: [0, 1, 2, 3, 4, 5], subList(1, 4)
// Expected: [1, 2, 3]
private fun collection_13(){
    val itemList = listOf(0, 1, 2, 3, 4, 5)
    val result = itemList.subList(1,4)
    println("Get sublist from index 1 to 4 :${result}")
}

// 16. Check if list [] is empty
// Input: []
// Expected: true
private fun collection_14(){
    val itemList: List<Int> = listOf()
    println("Check if list [] is empty:${itemList.isEmpty()}")
    val itemList1: List<Int> = listOf(1,2)
    println("Check if list [] is notEmpty:${itemList1.isNotEmpty()}")
}

// 18. Map each element * 3 in [1, 2, 3, 4]
// Input: [1, 2, 3, 4], multiply by 3
// Expected: [3, 6, 9, 12]
private fun collection_15(){
    val itemList: List<Int> = listOf(1,2,3,4)
    val result = itemList.map { it*3 }
    println("Map each element * 3 in:${result}")
}

// 19. Filter elements > 5 from [2, 5, 7, 10, 3]
// Input: [2, 5, 7, 10, 3], filter > 5
// Expected: [7, 10]
private fun collection_16(){
    val itemList: List<Int> = listOf(2,5,7,10,3)
    val result = itemList.filter { it>5 }
    println("Filter elements > 5 from :${result}")
}

// 20. Filter elements NOT greater than 3 from [1, 2, 3, 4, 5]
// Input: [1, 2, 3, 4, 5], filterNot > 3
// Expected: [1, 2, 3]
private fun collection_17(){
    val itemList = listOf(1,2,3,4,5)
    val result = itemList.filterNot { it>3 }
    println("Filter elements NOT greater than 3 from :${result}")
}

// 21. Print each element of [10, 20, 30]
// Input: [10, 20, 30]
// Expected: 10 20 30
private fun collection_18(){
    val itemList = listOf(1,2,3,4,5)
    itemList.map {
        print(it)
    }
}

// 22. Check if any element > 8 in [1, 5, 9, 3]
// Input: [1, 5, 9, 3], any > 8
// Expected: true
private fun collection_19(){
    val itemList = listOf(1, 5, 9, 3)
    val result = itemList.any { it > 8 }
    println("Check if any element > 8 in :${result}")
}

// 23. Check if all elements > 0 in [1, 2, 3, 4]
// Input: [1, 2, 3, 4], all > 0
// Expected: true
private fun collection_20(){
    val itemList = listOf(1, 2, 3, 4)
    val result = itemList.all { it > 0 }
    println("Check if all elements > 0 in :${result}")
}


