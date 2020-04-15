package com.example.kotlinsy.classs.private

/**
 * create by zhangshi on 2020/4/14.
 * 练习
 * 创建一个 Kotlin 类，这个类需要禁止外部通过构造器创建实例，并提供至少一种实例化方式。
 */
class Practice private constructor(){

    var name = "Practice"

    fun sout() {
        println("sout")
    }

    companion object Builder {
        fun create(): Practice {
            return Practice()
        }
    }
}


