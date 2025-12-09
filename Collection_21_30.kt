package com.example.easyblekotlin


fun main(){
    //collection_21()
    //collection_22()
    //collection_23()
    //collection_24()
    //collection_25()
    //collection_26()
    //collection_27()
    //collection_28()
    //collection_29()
    collection_30()
}

// 24. Check if none are negative in [1, 2, 3, 4]
// Input: [1, 2, 3, 4], none < 0
// Expected: true
private fun collection_21(){
    val itemList = listOf(1, 2, 3, 4)
    val result = itemList.none { it < 0 }
    println("Check if none are negative in :${result}")
}

// 25. Calculate sum of [10, 20, 30, 40]
// Input: [10, 20, 30, 40]
// Expected: 100
private fun collection_22(){
    val itemList = listOf(10, 20, 30, 40)
    val result = itemList.sum()
    println("Calculate Sum Of :${result}")
}

// 26. Calculate average of [10, 20, 30, 40, 50]
// Input: [10, 20, 30, 40, 50]
// Expected: 30.0
private fun collection_23(){
    val itemList = listOf(10, 20, 30, 40,50)
    val result = itemList.average()
    println("Calculate average of:$result")
}

// 27. Find max element in [15, 42, 8, 23, 16]
// Input: [15, 42, 8, 23, 16]
// Expected: 42
private fun collection_24(){
    val itemList = listOf(15,42,8,23,16)
    val result = itemList.max()
    println("Find max element in:$result")
}

// 28. Find min element in [15, 42, 8, 23, 16]
// Input: [15, 42, 8, 23, 16]
// Expected: 8
private fun collection_25(){
    val itemList = listOf(15,42,8,23,16)
    val result = itemList.min()
    println("Find min element in:$result")
}

// 29. Sort list [64, 34, 25, 12, 22, 11, 90]
// Input: [64, 34, 25, 12, 22, 11, 90]
// Expected: [11, 12, 22, 25, 34, 64, 90]
private fun collection_26(){
    val itemList = listOf(64,34,12,22,11,90)
    val result = itemList.sorted()
    println("Sort list:$result")
}

// 30. Sort list in descending order [3, 1, 4, 1, 5]
// Input: [3, 1, 4, 1, 5]
// Expected: [5, 4, 3, 1, 1]
private fun collection_27(){
    val itemList = listOf(3, 1, 4, 1, 5)
    val result = itemList.sortedDescending()
    println("Sort list in descending order:$result")
}

// 31. Reverse list [1, 2, 3, 4, 5]
// Input: [1, 2, 3, 4, 5]
// Expected: [5, 4, 3, 2, 1]
private fun collection_28(){
    val itemList = listOf(1, 2, 3, 4, 5)
    val result = itemList.reversed()
    println(" Reverse list:$result")
}

// 32. Get distinct elements from [1, 2, 2, 3, 3, 3, 4]
// Input: [1, 2, 2, 3, 3, 3, 4]
// Expected: [1, 2, 3, 4]
private fun collection_29(){
    val itemList = listOf(1, 2, 2, 3, 3, 3, 4)
    val result = itemList.distinct()
    println(" Get distinct elements from:$result")
}

// 33. Take first 3 elements from [10, 20, 30, 40, 50]
// Input: [10, 20, 30, 40, 50], take 3
// Expected: [10, 20, 30]
private fun collection_30(){
    val itemList = listOf(10,20,30,40,50)
    val result = itemList.take(3).take(1)
    println("Take first 3 elements from:$result")
}

