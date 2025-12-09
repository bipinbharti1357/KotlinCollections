package com.example.easyblekotlin

import android.os.Debug


fun main() {
    println("Collection Demo 1 se 10")
    //collection_1()
    //collection_2()
    //collection_3()
    //collection_4()
    //collection_5()
    //colection_6()
    //collection_7()
    //collection_8()
    //collection_9()
    collection_10()

    //getMemoryInfo()
    //checkMemoryUsage()
}

//1. Create a list with elements [1, 2, 3, 4, 5]
private  fun collection_1() {
    val itemList = listOf(1, 2, 3, 4, 5)
    print(itemList)
}

// 3. Create a mutable list with [10, 20, 30]
private  fun collection_2() {
    val itemList = mutableListOf(10, 20, 30)
    print(itemList)
}

// 4. Add element 40 to mutable list [10, 20, 30]
private  fun collection_3(){
    val itemList = mutableListOf(10, 20, 30)
    itemList.add(40)
    print(itemList)
}

// 5. Add element 5 at index 0 to list [10, 20, 30]
private fun collection_4(){
    val itemList = listOf(10, 20, 30)
    val newList = itemList.toMutableList().apply {
        add(0, 5)
    }
    println(newList)
}

// 6. Remove element 20 from list [10, 20, 30, 20]
private fun collection_5(){
    val itemList = listOf(10, 20, 30,20)
    val result = itemList.toSet()
    print(result)
}

// 7. Remove element at index 1 from [10, 20, 30]
private fun colection_6(){
    val itemList = mutableListOf(10, 20, 30,20)
    val result = itemList.removeAt(1)
    print(result)
}

// 8. Get element at index 2 from [5, 10, 15, 20]
private fun collection_7(){
    val itemList = listOf(5, 10, 15,20)
    print(itemList[2])
}

// 9. Get first element from [100, 200, 300]
private fun collection_8(){
    val itemList = listOf(100,200,300)
    //val itemList:List<Int> = listOf()
    print(itemList.firstOrNull())
}

// 10. Get last element from [100, 200, 300]
private fun collection_9(){
    val itemList = listOf(100,200,300)
    print(itemList.lastOrNull())
}

// 12. Check if list [1, 2, 3, 4] contains 3
fun collection_10(){
    val itemList  = listOf(1, 2, 3, 4)
    println("Check List Contains 3:${itemList.contains(3)}")
    println("Check List Contains 5:${itemList.contains(5)}")
}


fun getMemoryInfo() {
    val runtime = Runtime.getRuntime()
    val usedMemory = runtime.totalMemory() - runtime.freeMemory()
    val maxMemory = runtime.maxMemory()
    val availableMemory = maxMemory - usedMemory

    println("Used Memory: ${usedMemory / 1024 / 1024} MB")
    println("Max Memory: ${maxMemory / 1024 / 1024} MB")
    println("Available Memory: ${availableMemory / 1024 / 1024} MB")
}


fun checkMemoryUsage() {
    val nativeHeapSize = Debug.getNativeHeapSize() / 1024 / 1024
    val nativeHeapAllocated = Debug.getNativeHeapAllocatedSize() / 1024 / 1024
    val nativeHeapFree = Debug.getNativeHeapFreeSize() / 1024 / 1024

    println("Native Heap Size: $nativeHeapSize MB")
    println("Native Heap Allocated: $nativeHeapAllocated MB")
    println("Native Heap Free: $nativeHeapFree MB")
}

fun measureObjectSize() {
    val runtime = Runtime.getRuntime()
    runtime.gc() // Request garbage collection

    val memoryBefore = runtime.totalMemory() - runtime.freeMemory()


    val memoryAfter = runtime.totalMemory() - runtime.freeMemory()
    val objectSize = memoryAfter - memoryBefore

    println("Approximate object size: ${objectSize / 1024} KB")
}