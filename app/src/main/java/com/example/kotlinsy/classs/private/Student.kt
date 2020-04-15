package com.example.kotlinsy.classs.private

/**
 * create by zhangshi on 2020/4/14.
 */

internal class Student : Person() {


    override fun eat() {
        println("student:eat")

    }

    fun study() {
        println("student:" + PrivateTest(1, 2).a)
    }

    companion object Builder {
        fun createStudent():Student {
            return Student()
        }
    }


}

class PrivateTest (x:Int, y:Int){
    internal val a = "a"




}