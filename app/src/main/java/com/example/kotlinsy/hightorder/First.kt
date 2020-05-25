package com.example.kotlinsy.hightorder

/**
 * create by zhangshi on 2020/5/12.
 * kotlin函数做参数传递
 */

fun main() {

    val s = lock("param1", "param2", ::getResult)
    println(s)
    val s2 = lock("abc", "abc123", ::getResult2)
    println(s2)
    //使用其他class中的方法
    val s3 = lock("abc", "abc123", Helper()::getResultLength)
    println(s3)
}

/**我们在 Class 中的某个方法中使用双冒号调用当前 Class 的内部方法时调动方式如下：
 * 一般情况，我们调用当前类的方法 this 都是可省略的，这里之所以不可省略的原因是
 * 为了防止作用域混淆 ， :: 调用的函数如果是类的成员函数或者是扩展函数，必须使用限定符,比如this
 * **/
class First01 {

    fun  isAdd(x: Int) = x % 2 != 0
    fun test() {
        var list = mutableListOf<Int>(1, 2, 3, 4, 5)
        list.filter(this::isAdd)
    }
}

fun getResult(str1: String, str2: String): String =
    "result is {$str1, $str2}"

fun getResult2(s1: String, s2: String) =
    if (s1.length > s2.length) s1 else s2

fun lock(p1: String, p2: String, method: (str1: String, str2: String) -> String): String {
    return method(p1, p2)
}

/**
 * 格式：变量名：（函数参数）-> 函数返回值
 */
fun aaa(method: (i: Int) -> String) {
    method(6)
}
