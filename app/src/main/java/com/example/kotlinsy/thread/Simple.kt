package com.example.kotlinsy.thread

import kotlin.concurrent.thread

/**
 * create by zhangshi on 2020/4/23.
 * 协程，轻量级的多线程
 */
fun main() {
    for (i in 1..10) {
        Thread({
            println(i)
        }).start()
    }

    var topObj = TopObj("zhangsan", 11)

    // 创建一个 Thread 的完整写法

    Thread(object : Runnable{
        override fun run() {
            println("完整的Thread")
        }
    }).start()

}

class TopObj(var name:String, var age: Int){

}