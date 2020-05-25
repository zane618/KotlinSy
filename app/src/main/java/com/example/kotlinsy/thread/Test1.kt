package com.example.kotlinsy.thread

import kotlinx.coroutines.*

/**
 * create by zhangshi on 2020/4/24.
 */

fun main() {

    runBlocking {
        repeat(10) {
            launch {
                delay(1000)
                println(".")
            }
        }
    }



}