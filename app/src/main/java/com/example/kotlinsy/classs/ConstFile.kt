package com.example.kotlinsy.classs

/**
 * create by zhangshi on 2020/4/14.
 * 常量
 */
const val TYPE_ONE: String = "1"
const val TYPE_TOW: String = "2"

fun main() {
    println(A.B_TYPE_ONE)
    println(TYPE_ONE)
    println(TYPE_TOW)

    //todo 数组不支持协变
    val strs: Array<String> = arrayOf("a", "b", "c")
//    val anys: Array<Any> = strs

    val items: List<String> = listOf("a", "b", "c")
    val anys: List<Any> = items

    for (item in items) {
        println(item)
    }
    for (index in items.indices) {
        println(items[index])
    }



}

fun staticMethod() {
    println("staticMethod")
}


class A {

    //只能在class中创建
    companion object B {
        const val B_TYPE_ONE = "1"
        val str: String = "1"


    }
}
