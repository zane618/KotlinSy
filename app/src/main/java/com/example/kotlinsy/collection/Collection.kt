package com.example.kotlinsy.collection

/**
 * create by zhangshi on 2020/4/14.
 * 集合
 */
fun main() {
    setTest()

    mapTest()
}

fun mapTest() {
    val siMap = mapOf<String, Int>("key1" to 1, "key2" to 2, "key3" to 3)
    for (item in siMap) {
        println(item.key + ":" + item.value)
    }
    for (entr in siMap.entries) {
        println("key:" + entr.key + ",value:" + entr.value)
    }

}

fun setTest() {
    val strSet = setOf<String>("1", "2", "3")

    var toSet = strSet.toMutableSet()


    var strSet2: Set<String>? = setOf("可空的set")
    for (str in strSet) {
        println(str)
    }

    var set2 = mutableSetOf<String>()
    set2.add("_1")
    set2.addAll(strSet)
    set2.addAll(strSet2!!)

    for (str in set2) {
        println("set2:" + str)
    }
}

