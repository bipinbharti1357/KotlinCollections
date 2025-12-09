package com.example.easyblekotlin

fun main(){
    //collection_31()
    //collection_32()
    //collection_33()
    //collection_34()
    //collextion_35()
    //collection_36()
    collection_37()
}

// 34. Take last 2 elements from [10, 20, 30, 40, 50]
// Input: [10, 20, 30, 40, 50], takeLast 2
// Expected: [40, 50]
private fun collection_31(){
    val itemList = listOf(10,20,30,40,50)
    val result = itemList.takeLast(2)
    println("Take last 2 elements from:$result")
}

// 35. Drop first 2 elements from [10, 20, 30, 40]
// Input: [10, 20, 30, 40], drop 2
// Expected: [30, 40]
private fun collection_32(){
    val itemList = listOf(10,20,30,40,50)
    val result = itemList.drop(2)
    println(" Drop first 2 elements from:$result")
}

// 36. Drop last 2 elements from [10, 20, 30, 40]
// Input: [10, 20, 30, 40], dropLast 2
// Expected: [10, 20]
private fun collection_33(){
    val itemList = listOf(10,20,30,40,50)
    val result = itemList.dropLast(2)
    println(" Drop last 2 elements from:$result")
}

// 37. Slice elements at indices 1 to 3 from [10, 20, 30, 40, 50]
// Input: [10, 20, 30, 40, 50], slice 1..3
// Expected: [20, 30, 40]
private fun collection_34(){
    val itemList = listOf(10,20,30,40,50)
    val result = itemList.slice(1..3)
    println("Slice elements at indices 1 to 3 from:$result")
}

// 38. Chunk list [1, 2, 3, 4, 5, 6, 7] into groups of 3
// Input: [1, 2, 3, 4, 5, 6, 7], chunk size 3
// Expected: [[1, 2, 3], [4, 5, 6], [7]]
private fun collextion_35(){
    val itemList = listOf(1, 2, 3, 4, 5, 6, 7)
    val result = itemList.chunked(3)
    println("Chunk list [1, 2, 3, 4, 5, 6, 7] into groups of 3:$result")
}

// 39. Create sliding windows of size 3 from [1, 2, 3, 4, 5]
// Input: [1, 2, 3, 4, 5], window size 3
// Expected: [[1, 2, 3], [2, 3, 4], [3, 4, 5]]
private fun collection_36(){
    val itemList = listOf(1,2,3,4,5)
    val result = itemList.windowed(3)
    println("Create sliding windows of size 3 from:$result")
}

// 40. Partition list [1, 2, 3, 4, 5, 6] into even and odd
// Input: [1, 2, 3, 4, 5, 6], partition by even/odd
// Expected: evens=[2, 4, 6], odds=[1, 3, 5]
private fun collection_37(){
    val itemList = listOf(1,2,3,4,5,6)
    val (even,odd) = itemList.partition { it%2==0 }
    println("Partition list [1, 2, 3, 4, 5, 6] into even and odd:$odd:===even:$even")
}



