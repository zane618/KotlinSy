package com.example.kotlinsy.basic

/**
 * create by zhangshi on 2020/4/13.
 * 创建基本类及其实例
 */

//不大于Int最大值，默认推断为Int，超过推断为Long, 可显示指定L
val one = 1 //Int
val threeBillion = 3000000000 //Long
val oneLong = 1L
val oneByte: Byte = 1

//浮点默认推断为Double
val pi = 3.14 //Double
val e = 2.7182818284 //Double
val eFloat = 2.7182818284f //Float 实际值为2.7182817

fun main() {
    val i = 1
    val d = 1.1
    val f = 1.1f
    val oneMillion = 1_000_000 //可以使用下划线

    printDouble(d)
//    printDouble(i) 错误
//    printDouble(f) 错误
    val b: Byte = 1
//    val iInt: Int = b  错误
    val iInt: Int = b.toInt()

    val x = 5L /2
    println(x == 2L)

}

//只能打印Double类型
fun printDouble(d: Double) {
    println(d)
}
