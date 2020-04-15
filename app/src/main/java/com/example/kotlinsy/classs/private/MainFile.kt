package com.example.kotlinsy.classs.private



/**
 * create by zhangshi on 2020/4/14.
 */

fun main() {
    val p = Person()
    var stu = Student()
    var stu2 = Student.Builder.createStudent()
    var stu3 = Student.createStudent()
    stu2.study()
//    stu.eat()
//    p.eat()

    val practice = Practice.create()
    practice.sout()
    println(practice.name)
}