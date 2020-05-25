package com.example.kotlinsy.classs.t.bean

/**
 * create by zhangshi on 2020/4/22.
 */

open class Person(open var name: String, var age: Int){

}

class Student(name: String, age: Int): Person(name, age){
    val sex: String
    init {
        sex = "1"
    }
}

fun main() {
    val s = Student("zhangsan", 18)
    print(s.name)
    println()
    print(s.age)
    println()
    println(s.sex)

}

