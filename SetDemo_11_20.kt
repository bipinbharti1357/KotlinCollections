package com.example.easyblekotlin

fun main(){
    //sDemo_11()
    //sDemo_12()
    //sDemo_13()
    //sDemo_14()
    //sDemo_15()
    //sDemo_16()
    //sDemo_17()
    //sDemo_18()
    //sDemo_19()
    sDemo_20()
}
// 51. Intersection of [1, 2, 3] and [2, 3, 4]
// Input: [1, 2, 3] intersect [2, 3, 4]
// Expected: [2, 3]
private fun sDemo_11(){
    val itemSet1 = setOf(1,2,3)
    val itemSet2 = setOf(3,4,5)
    val unionSet = itemSet1.intersect(itemSet2)
    println("Intersect of sets:$unionSet")
}

// 52. Subtract [2, 3] from [1, 2, 3, 4]
// Input: [1, 2, 3, 4] subtract [2, 3]
// Expected: [1, 4]
private fun sDemo_12(){
    val itemSet1 = setOf(2,3)
    val itemSet2 = setOf(1,2,3,4)
    val result = itemSet2.subtract(itemSet1)
    println("Subtract:$result")
}

// 53. Convert list [1, 1, 2, 2, 3] to set
// Input: [1, 1, 2, 2, 3]
// Expected: [1, 2, 3]
private fun sDemo_13(){
    val itemList = listOf(1,1,2,2,3)
    println("Convert list to set:"+itemList.toSet())
}

// 54. Convert set [10, 20, 30] to list
// Input: [10, 20, 30]
// Expected: [10, 20, 30]
private fun sDemo_14(){
    val itemSet = setOf(10,20,30)
    println("Convert set to list :${itemSet.toList()}")
}

// 55. Filter set [1, 2, 3, 4, 5] for elements > 3
// Input: [1, 2, 3, 4, 5], filter > 3
// Expected: [4, 5]
private fun sDemo_15(){
    val itemSet = setOf(1,2,3,4,5)
    val result = itemSet.filter { it>3 }
    println("Filter set for elements:${result}")
}

// 56. Map set [1, 2, 3] with each element * 10
// Input: [1, 2, 3], multiply by 10
// Expected: [10, 20, 30]
private fun sDemo_16(){
    val itemSet = setOf(1,2,3)
    val result = itemSet.map { it*10 }
    println("Map set with each element * 10:${result}")
}

// 57. Check if any element > 3 in [1, 2, 3, 4]
// Input: [1, 2, 3, 4], any > 3
// Expected: true
private fun sDemo_17(){
    val itemSet = setOf(1,2,3,4)
    val result = itemSet.any { it>3 }
    println("Check if any element > 3 in:$result")
}

// 58. Check if all elements are positive in [1, 2, 3]
// Input: [1, 2, 3], all > 0
// Expected: true
private fun sDemo_18(){
    val itemSet = setOf(1,2,3)
    val result = itemSet.all { it>0 }
    println("Check if all elements are positive in > 0 in:$result")
}

// 59. Get first element from set [5, 10, 15]
// Input: [5, 10, 15]
// Expected: 5
private fun sDemo_19(){
    val itemSet = setOf(5,10,15)
    val result = itemSet.first()
    println("Get first element from set:$result")
}

// 60. Get last element from set [5, 10, 15]
// Input: [5, 10, 15]
// Expected: 15
private fun sDemo_20(){
    val itemSet = setOf(5,10,15)
    val result = itemSet.last()
    println("Get last element from set:$result")
}