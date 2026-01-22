package com.example.easyblekotlin


fun main() {
    //sDemo_1()
    //sDemo_2()
    //sDemo_3()
    //sDemo_4()
    //sDemo_5()
    //sDemo_6()
    //sDemo_7()
    //sDemo_8()
    //sDemo_9()
    //sDemo_10()
}

// 41. Create an empty set of strings
// Input: -
// Expected: []
private fun sDemo_1() {
    val itemSet: Set<String> = setOf()
    println(itemSet)
}

// 42. Create a set with ["apple", "banana", "cherry"]
// Input: "apple", "banana", "cherry"
// Expected: [apple, banana, cherry]
private fun sDemo_2(){
    val itemSet = setOf("apple","banana","cherry")
    println(itemSet)
}

// 43. Create set from [1, 2, 2, 3, 3, 3] (removes duplicates)
// Input: [1, 2, 2, 3, 3, 3]
// Expected: [1, 2, 3]
private fun sDemo_3(){
    val itemSet = setOf(1,2,2,3,3,3)
    println("removes duplicates:$itemSet")
}

// 44. Create mutable set with [5, 10, 15]
// Input: 5, 10, 15
// Expected: [5, 10, 15]
private fun sDemo_4(){
    val itemSet = mutableSetOf(5,10,15)
    println("Create mutable set with:$itemSet")
}

// 45. Add element 20 to set [5, 10, 15]
// Input: [5, 10, 15], add 20
// Expected: [5, 10, 15, 20]
private fun sDemo_5(){
    val itemSet = mutableSetOf(5,10,15)
    itemSet.add(20)
    println("Add element 20 to set:$itemSet")
}

// 46. Try adding duplicate 10 to set [5, 10, 15]
// Input: [5, 10, 15], add 10
// Expected: [5, 10, 15]
private fun sDemo_6(){
    val itemSet = mutableSetOf(5,10,15)
    itemSet.add(15)
    println(" Try adding duplicate 10 to set:$itemSet")
}

// 47. Remove element 10 from set [5, 10, 15, 20]
// Input: [5, 10, 15, 20], remove 10
// Expected: [5, 15, 20]
private fun sDemo_7(){
    val itemSet = mutableSetOf(5,10,15,20)
    itemSet.remove(10)
    println("Remove element 10 from set:${itemSet}")
}

// 48. Check if set ["a", "b", "c"] contains "b"
// Input: ["a", "b", "c"], check "b"
// Expected: true
private fun sDemo_8(){
    val itemSet = mutableSetOf("a","b","c")
    println("Check if set contains b:${itemSet.contains("a")}")
}

// 49. Find size of set [1, 2, 3, 4, 5]
// Input: [1, 2, 3, 4, 5]
// Expected: 5
private fun sDemo_9(){
    val itemSet = setOf(1, 2, 3, 4, 5)
    println("Find size of set:${itemSet.size}")
}

// 50. Union of sets [1, 2, 3] and [3, 4, 5]
// Input: [1, 2, 3] union [3, 4, 5]
// Expected: [1, 2, 3, 4, 5]
private fun sDemo_10(){
    val itemSet1 = setOf(1,2,3)
    val itemSet2 = setOf(3,4,5)
    val unionSet = itemSet1.union(itemSet2)
    println("Union of sets:$unionSet")
}

