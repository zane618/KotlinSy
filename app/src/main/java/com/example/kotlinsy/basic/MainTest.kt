package com.example.kotlinsy.basic

/**
 * create by zhangshi on 2020/4/13.
 * main是程序入口，
 * 创建变量
 */

//顶层变量
val PI = 3.14
//必须初始化
//var x : Int
var x = 0


fun main() {
    println("Hello world!")

    varMethod()

    println(++x)

    //字符串模板
    var a = 0
    a ++
    val s1 = "a is $a"
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

//可重新赋值的变量使用var
fun varMethod() {
    var x = 5
    var y : Int = 6 //可省略
    var z : Int
    //为初始化不可++
//    z ++
    x ++
    println(x)

}

//不可重新复制的变量用val
fun valMethod() {
    val a = 1
    val b : Int = 2
    val c: Int

    c = 3
    // val 变量不可再次复制
//    a = 4
//    b = 3
    println("a = $a" + ", b=$b" + ", c= $c")
}