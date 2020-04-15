package com.example.kotlinsy.classs

/**
 * create by zhangshi on 2020/4/14.
 */
class User constructor(name: String?, age: Int?){

}

fun main() {
    var student = Student(1, "zhangsan")
    println(student.size)

    student.items = listOf("a","b", "c")
    println(student.size)



}

class Student {
    val id: Int
    val name: String
    var items = emptyList<String>()
    val size: Int
    get() {
        return items.size
    }

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }
    init {
//        grade = "3"
    }
}


